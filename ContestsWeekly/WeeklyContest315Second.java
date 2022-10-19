class Solution {
    public int countDistinctIntegers(int[] nums) {
        int len = nums.length;
        int arr[] = new int[2*len];
        for (int i = 0; i < nums.length; i++)
        {
            arr[i*2] = nums[i];
            int num = nums[i],dig = 0;
            while (num > 0)
            {
                dig = (dig * 10) + (num%10);
                num /= 10;
            }
            arr[i*2+1] = dig;
        }
        Arrays.sort(arr);
        int i = 0,count = 0;
        while (i < 2*len)
        {
            count++;
            while (i < 2*len-1 && arr[i] == arr[i+1])
            {
                i++;
            }
            i++;
        }
        return count;
    }
}
