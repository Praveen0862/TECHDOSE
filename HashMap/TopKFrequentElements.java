class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        LinkedHashMap<Integer,Integer> link = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++)
        {
            if (map.containsKey(nums[i]))
            {
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            list.add(entry.getValue());
        }
        Collections.sort(list,Collections.reverseOrder());
        for (int i : list)
        {
            for (Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                if (entry.getValue() == i)
                {
                    link.put(entry.getKey(),i);
                }
            }
        }
        int arr[] = new int[k];
        int index = 0;
        for (Map.Entry<Integer,Integer> entry : link.entrySet())
        {
            arr[index] = entry.getKey();
            index++;
            if (index >= k)
            {
                return arr;
            }
        }
        return arr;
    }
}
