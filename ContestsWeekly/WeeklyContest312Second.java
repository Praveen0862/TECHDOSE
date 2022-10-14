class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0,count = 0,result = 0;
        for (int i : nums)
        {
            max = Math.max(i,max);
        }
        for (int i : nums)
        {
            if (i == max)
            {
                count++;
            }
            else
            {
                count = 0;
            }
            result = Math.max(result,count);
        }
        return result;
    }
}
