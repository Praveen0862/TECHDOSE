class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int maxR[] = new int[len], maxL[] = new int[len];
        int r = 0,l = 0;
        for (int i = 0; i < len; i++)
        {
            maxL[i] = l;
            if (l < height[i])
            {
                l = height[i];
            }
            maxR[len-1-i] = r;
            if (r < height[len-1-i])
            {
                r = height[len-1-i];
            }
        }
        int water = 0;
        for (int i = 0; i < len; i++)
        {
            int min = Math.min(maxR[i],maxL[i]);
            min -= height[i];
            if (min > 0)
            {
                water += min;
            }
        }
        return water;
    }
}
