class Solution {
    public int hammingDistance(int x, int y) {
        int n = x^y;
        int dist = 0;
        while (n > 0)
        {
            if ((n&1) == 1)
            {
                dist++;
            }
            n = n >> 1;
        }
        return dist;
    }
}
