class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++)
        {
            if (set.contains(s.charAt(i)))
            {
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return ' ';
    }
}
