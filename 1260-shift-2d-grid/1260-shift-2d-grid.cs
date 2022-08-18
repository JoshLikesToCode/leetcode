public class Solution {
    public IList<IList<int>> ShiftGrid(int[][] grid, int k) {
        for(; k > 0; k--)
        {
            int prev = grid[grid.Length - 1][grid[0].Length - 1];
            for(int i = 0; i < grid.Length; i++)
            {
                for(int j = 0; j < grid[0].Length; j++)
                {
                    int tmp = grid[i][j];
                    grid[i][j] = prev;
                    prev = tmp;
                }
            }
        }
        return grid;
    }
}