class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len-1;
        while (i > 0)
        {
            if (nums[i] > nums[i-1])
            {
                break;
            }
            i--;
        }
        if (i == 0)
        {
            for (;i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                if (nums[i] > nums[j])
                {
                    int num = nums[i];
                    nums[i] = nums[j];
                    nums[j] = num;
                }
            }
        }
            return;
        }
        int j = len-1;
        while (j > i)
        {
            if (nums[j] > nums[i-1])
            {
                break;
            }
            j--;
        }

        int num = nums[i-1];
        nums[i-1] = nums[j];
        nums[j] = num;

        for (;i < len; i++)
        {
            for (j = i+1; j < len; j++)
            {
                if (nums[i] > nums[j])
                {
                    num = nums[i];
                    nums[i] = nums[j];
                    nums[j] = num;
                }
            }
        }
    }
}
