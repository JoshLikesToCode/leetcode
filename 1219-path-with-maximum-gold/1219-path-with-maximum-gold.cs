public class Solution {
    public int GetMaximumGold(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.Length; i++)
            for(int j = 0; j < grid[i].Length; j++)
                if(grid[i][j] != 0)
                    res = Math.Max(res, backTrack(grid, i, j, 0));
        return res;
    }
    
    public int backTrack(int[][] grid, int i, int j, int currSum)
    {
        if(i < 0 || j < 0 || i > grid.Length - 1 || j > grid[i].Length - 1 || grid[i][j] == 0)
            return 0;
        int tmp = grid[i][j];
        grid[i][j] = 0;
        int r = backTrack(grid, i + 1, j, currSum + grid[i][j]);
        int l = backTrack(grid, i - 1, j, currSum + grid[i][j]);
        int u = backTrack(grid, i, j + 1, currSum + grid[i][j]);
        int d = backTrack(grid, i, j - 1, currSum + grid[i][j]);
        grid[i][j] = tmp;
        return tmp + Math.Max(Math.Max(l,r), Math.Max(u,d));
    }
}
