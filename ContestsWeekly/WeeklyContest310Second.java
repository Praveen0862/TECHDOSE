class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int i = 0,max = 0,length = nums.length,element = -1;
        while (i < length)
        {
            if (nums[i]%2 == 0)
            {
                int j = i+1;
                while (j < length && nums[i] == nums[j])
                {
                    j++;
                }
                if (j-i > max)
                {
                    max = j-i;
                    element = nums[i];
                }
                i = j-1;
            }
            i++;
        }
        return element;
    }
}
