class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == '1')
                {
                    backTrack(grid, i, j, row, col);
                    res++;
                }
            }
        }
        return res;
    }
    
    public void backTrack(char[][] grid, int i, int j, int row, int col)
    {
        if(i >= row || j >= col || i < 0 || j < 0 || grid[i][j] != '1')
            return;
        
        // mark as visited
        grid[i][j] = '0';
        backTrack(grid, i + 1, j, row, col);
        backTrack(grid, i - 1, j, row, col);
        backTrack(grid, i, j + 1, row, col);
        backTrack(grid, i, j - 1, row, col);
    }
}