class Solution {
    public int[][] largestLocal(int[][] grid) {
        int size = grid.length;
        int[][] mat = new int[size-2][size-2];
        for (int i = 0; i < size-2; i++)
        {
            for (int j = 0; j < size-2; j++)
            {
                int max = 0;
                for (int row = i; row < i+3; row++)
                {
                    for (int col = j; col < j+3; col++)
                    {
                        if (grid[row][col] > max)
                        {
                            max = grid[row][col];
                        }
                    }
                }
                mat[i][j] = max;
            }
        }
        return mat;
    }
}
