public class Solution {
    public bool IsToeplitzMatrix(int[][] matrix) {
        int m = matrix.Length;
        int n = matrix[0].Length;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i > 0 && j > 0 && matrix[i-1][j-1] != matrix[i][j])
                    return false;
            }
        }
        return true;
    }
}