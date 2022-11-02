class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length,max = 0,maxNum = 0;
        for (int i = 1; i < len; i++)
        {
            if (nums[i-1] == key)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                if (map.get(nums[i]) > max)
                {
                    max = map.get(nums[i]);
                    maxNum = nums[i];
                }
            }
        }
        return maxNum;
    }
}
