class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> h = new LinkedHashSet<Character>();
        int length = s.length(), i = 0,max = 1;
        if (length == 0)
        {
            return 0;
        }
        while (i < length)
        {
            char ch = s.charAt(i);
            if (h.contains(ch) == true)
            {
                if (h.size() > max)
                {
                    max = h.size();
                }
                ArrayList<Character> set = new ArrayList<Character>(h);
                int index = set.indexOf(ch);
                i = i - (h.size()-index) + 1;
                h.clear();
            }
            else
            {
                h.add(ch);
                i++;
            }
            if (h.size() > max)
            {
                max = h.size();
            }
        }
        return max;
    }
}
