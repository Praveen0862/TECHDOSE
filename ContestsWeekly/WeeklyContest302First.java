class Solution {
    public int[] numberOfPairs(int[] nums) {
        int hash[] = new int[101];
        int pair = 0,count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            hash[nums[i]]++;
        }
        for (int i = 0; i <= 100; i++)
        {
            pair += (hash[i]/2);
            count += (hash[i]%2);
        }
        int arr[] = new int[2];
        arr[0] = pair;
        arr[1] = count;
        return arr;
    }
}
