public class Solution {
    
    public int MaxAreaOfIsland(int[][] grid) {
        bool[,] visited = new bool[grid.Length, grid[0].Length];
        int res = 0;
        for(int i = 0; i < grid.Length; i++)
        {
            for(int j = 0; j < grid[0].Length; j++)
            {
                res = Math.Max(res, getArea(grid, visited, i, j));
            }
        }
        return res;
    }
    
    public int getArea(int[][] grid, Boolean[,] visited, int r, int c)
    {
        if(r < 0 || r >= grid.Length || c < 0 || c >= grid[0].Length || grid[r][c] == 0)
            return 0;
        if(visited[r,c] == true)
            return 0;
        visited[r,c] = true; // mark as visited
        return (1 + getArea(grid, visited, r + 1, c) + getArea(grid, visited, r - 1, c) + getArea(grid, visited, r, c + 1) + getArea(grid, visited, r, c - 1));
    }
}