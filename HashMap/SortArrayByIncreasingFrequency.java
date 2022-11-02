class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            set.add(entry.getValue());
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int arr[] = new int[nums.length];
        int index = 0;
        for (int i : list)
        {
            ArrayList<Integer> newList = new ArrayList<>();
            for (Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                if (i == entry.getValue())
                {
                    newList.add(entry.getKey());
                }
            }
            Collections.sort(newList,Collections.reverseOrder());
            for (int j : newList)
            {
                for (int k = 0; k < i; k++)
                {
                    arr[index++] = j;
                }
            }
        }
        return arr;
    }
}
