class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int []arr = new int[2];
        for (int i = 0; i < length; i++)
        {
            for (int j = i+1; j < length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
