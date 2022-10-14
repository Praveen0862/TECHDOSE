class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        Arrays.sort(nums);
        int len = nums.length;
        int arr[] = new int[m];
        for (int i = 0; i < m; i++)
        {
            int sum = queries[i],max = 0;
            for (int j = 0; j < len; j++)
            {
                sum -= nums[j];
                max++;
                if (sum < 0)
                {
                    sum += nums[j];
                    max--;
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}
