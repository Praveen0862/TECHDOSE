class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE,minSum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                for (int k = j+1; k < len; k++)
                {
                    int sum = nums[i]+nums[k]+nums[j];
                    int diff = Math.abs(sum-target);
                    if (diff < minDiff)
                    {
                        minDiff = diff;
                        minSum = sum;
                    }
                }
            }
        }
        return minSum;
    }
}
