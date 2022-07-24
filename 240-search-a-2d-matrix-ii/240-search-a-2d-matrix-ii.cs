public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        int a = matrix.Length - 1;
        int b = 0;
        while(a >= 0 && b < matrix[0].Length)
        {
            if(matrix[a][b] > target)
                a--;
            else if(matrix[a][b] < target)
                b++;
            else
                return true;
        }
        return false;
    }
}