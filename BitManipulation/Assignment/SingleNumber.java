class Solution {
    public int singleNumber(int[] nums) {
        int n = 0,length = nums.length;
        for (int i = 0; i < length; i++)
        {
            n ^= nums[i];
        }
        return n;
    }
}
