class Solution {
    public boolean findSubarrays(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length-1; i++)
        {
            int sum = nums[i] + nums[i+1];
            for (int j = i+1; j < length-1; j++)
            {
                if (sum == nums[j] + nums[j+1])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
