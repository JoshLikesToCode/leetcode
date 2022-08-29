public class Solution {
    public int NumIslands(char[][] grid) {
        int row = grid.Length;
        int col = grid[0].Length;
        int res = 0;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                if(grid[i][j] == '1')
                {
                    backTrack(grid, i, j, row, col);
                    res++;
                }
        }
        return res;
    }
    
    public void backTrack(char[][] grid, int i, int j, int r, int c)
    {
        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        backTrack(grid, i + 1, j, r, c);
        backTrack(grid, i - 1, j, r, c);
        backTrack(grid, i, j + 1, r, c);
        backTrack(grid, i, j - 1, r, c);
    }
}
