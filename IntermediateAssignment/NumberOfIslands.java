class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0;i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (grid[i][j] == '1')
                {
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
    }
    
    public static void dfs(char[][] grid,int i,int j)
    {
        if (grid[i][j] == '1')
        {
            grid[i][j] = '0';
            if (i > 0)
            {
                dfs(grid,i-1,j);
            }
            if (i < grid.length - 1)
            {
                dfs(grid,i+1,j);
            }
            if (j > 0)
            {
                dfs(grid,i,j-1);
            }
            if (j < grid[0].length - 1)
            {
                dfs(grid,i,j+1);
            }
        }
        
    }
}
