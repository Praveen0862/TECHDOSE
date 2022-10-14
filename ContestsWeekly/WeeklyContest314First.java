class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int len = logs.length;
        int max = logs[0][1],maxId = logs[0][0];
        for (int i = 1; i < len; i++)
        {
            int diff = logs[i][1]-logs[i-1][1];
            if (diff > max)
            {
                max = diff;
                maxId = logs[i][0];
            }
            else if (diff == max)
            {
                maxId = Math.min(maxId,logs[i][0]);
            }
        }
        return maxId;
    }
}
