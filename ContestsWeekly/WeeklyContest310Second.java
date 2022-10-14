class Solution {
    public int partitionString(String s) {
        HashSet<Character> h = new HashSet<Character>();
        int length = s.length(),count = 0;
        for (int i = 0; i < length; i++)
        {
            if (h.contains(s.charAt(i)))
            {
                h.clear();
                count++;
            }
            h.add(s.charAt(i));
            
        }
        return count+1;
    }
}
