class Solution {
    public int edgeScore(int[] edges) {
        int len = edges.length;
        long hash[] = new long[len];
        for (int i = 0 ; i < len; i++)
        {
            hash[edges[i]] += i; 
        }
        int maxInd = 0;
        long max = 0;
        for (int i = 0 ;i < len; i++)
        {
            if (hash[i] > max)
            {
                max = hash[i];
                maxInd = i;
            }
        }
        return maxInd;
    }
}
