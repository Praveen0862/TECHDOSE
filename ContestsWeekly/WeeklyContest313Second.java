class Solution {
    public int maxSum(int[][] grid) {
        int r = grid.length,c = grid[0].length;
        int max = 0;
        for (int i = 0; i < r-2; i++)
        {
            for (int j = 0; j < c-2; j++)
            {
                int sum = 0;
                for (int m = i; m <= i+2; m++)
                {
                    for (int n = j ; n <= j+2; n++)
                    {
                        if (m == i || m == i+2 || (m == i+1 && n == j+1))
                        {
                            sum += grid[m][n];
                        }
                        //System.out.print(grid[m][n] + " ");
                    }
                    //System.out.println(sum);
                    if (sum > max)
                    {
                        max = sum;
                    }
                }
                //System.out.println();
            }
        }
        return max;
    }
}
