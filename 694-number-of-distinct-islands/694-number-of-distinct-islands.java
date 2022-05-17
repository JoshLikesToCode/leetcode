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
                    serializeIsland(grid, i, j, row, col, sb, "C");
                    uniqueIslands.add(sb.toString());
                }
            }
        }
        return uniqueIslands.size();
    }
    
    public void serializeIsland(int[][] grid, int i, int j, int r, int c, StringBuilder sb, String id)
    {
        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        sb.append(id);
        serializeIsland(grid, i + 1, j, r, c, sb, "O");
        serializeIsland(grid, i - 1, j, r, c, sb, "D");
        serializeIsland(grid, i, j + 1, r, c, sb, "E");
        serializeIsland(grid, i, j - 1, r, c, sb, "U");
        sb.append("P");
    }
}