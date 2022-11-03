class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int len = strs.length;
        String arr[] = new String[len];
        for (int i = 0; i < len; i++)
        {
            char []charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            arr[i] = String.copyValueOf(charArr);
        }
        int hash[] = new int[len];
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < len; i++)
        {
            if (hash[i] == 0)
            {
                List<String> myList = new ArrayList<>();
                myList.add(strs[i]);
                hash[i] = 1;
                for (int j = i+1; j < len; j++)
                {
                    if (hash[j] == 0 && arr[i].equals(arr[j]))
                    {
                        myList.add(strs[j]);
                        hash[j] = 1;
                    }
                }
                list.add(myList);
            }
        }
        return list;
    }
}
