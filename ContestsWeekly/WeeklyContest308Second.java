class Solution {
    public String removeStars(String s) {
        int length = s.length();
        char stack[] = new char[length];
        int index = -1;
        for (int i = 0; i < length; i++)
        {
            if (s.charAt(i) == '*')
            {
                index--;
            }
            else
            {
                stack[++index] = s.charAt(i);
            }
        }
        String w = "";
        for (int i = 0; i <= index;i++)
        {
            w += stack[i];
        }
        return w;
    }
}
