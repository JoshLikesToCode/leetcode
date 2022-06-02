class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] tpose = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; ++i)
        {
            for(int j = 0; j < matrix[i].length; ++j)
            {
                tpose[j][i] = matrix[i][j];
            }
        }
        return tpose;
    }
}