class Solution {
    public void sortColors(int[] nums) {
        int low = 0,high = nums.length-1,mid = 0,num;
        while (mid <= high)
        {
            if (nums[mid] == 2)
            {
                num = nums[high];
                nums[high] = nums[mid];
                nums[mid] = num;
                high--;
            }
            else if (nums[mid] == 1)
            {
                num = nums[low];
                nums[low] = nums[mid];
                nums[mid] = num;
                mid++;
            }
            else
            {
                num = nums[low];
                nums[low] = nums[mid];
                nums[mid] = num;
                low++;
                mid++;
            }
        }
    }
}
