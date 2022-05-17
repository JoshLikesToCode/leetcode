class Solution {
    public int numDistinctIslands(int[][] grid) {
        Set<String> uniqueIslands = new HashSet<>();
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == 1)
                {
                    StringBuilder sb = new StringBuilder();
                    bfs(grid, i, j, row, col, sb, "C");
                    uniqueIslands.add(sb.toString());
                }
            }
        }
        return uniqueIslands.size();
    }
    
    public void bfs(int[][] grid, int i, int j, int r, int c, StringBuilder sb, String dir)
    {
        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        sb.append(dir);
        bfs(grid, i + 1, j, r, c, sb, "O");
        bfs(grid, i - 1, j, r, c, sb, "D");
        bfs(grid, i, j + 1, r, c, sb, "E");
        bfs(grid, i, j - 1, r, c, sb, "4");
        sb.append("LIFE");
    }
}