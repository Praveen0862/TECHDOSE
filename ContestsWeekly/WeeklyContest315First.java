class Solution {
    public int findMaxK(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int i = len-1;
        while (i >= 0)
        {
            for (int j = 0; j < i; j++)
            {
                if (nums[i] == nums[j]*-1)
                {
                    return nums[i];
                }
            }
            i--;
        }
        return -1;
    }
}
