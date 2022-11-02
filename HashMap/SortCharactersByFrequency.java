class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            set.add(entry.getValue());
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        String sr = "";
        for (int i : list)
        {
            for (Map.Entry<Character,Integer> entry : map.entrySet())
            {
                if (entry.getValue() == i)
                {
                    for (int j = 0; j < i; j++)
                    {
                        sr += (char)entry.getKey();
                    }
                }
            }
        }
        return sr;
    }
}
