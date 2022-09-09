class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int i = 0;
        while (i < length)
        {
            int j = i+1;
            while (j < length && nums[i] == nums[j])
            {
                j++;
            }
            if (j == i+1)
            {
                return nums[i];
            }
            i = j;
        }
        return 0;
    }
}
