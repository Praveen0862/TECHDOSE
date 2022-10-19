class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length;
        int min = minimum(nums),count = 0;
        while (min > 0)
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] >= min)
                {
                    nums[i] -= min;
                }
            }
            min = minimum(nums);
            count++;
        }
        return count;
    }
    
    public int minimum(int[] nums)
    {
        int min = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (min == 0)
            {
                min = nums[i];
            }
            if (min > nums[i] && nums[i] > 0)
            {
                min = nums[i];
            }
        }
        return min;
    }
}
