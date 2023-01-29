class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length,c = matrix[0].length;
        int num;
        for (int i = 0; i < r;i++)
        {
            for (int j = i+1;j < c; j++)
            {
                num = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = num;
            }
        }
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c/2; j++)
            {
                num = matrix[i][j];
                matrix[i][j] = matrix[i][c-1-j];
                matrix[i][c-1-j] = num;
            }
        }
    }
}
