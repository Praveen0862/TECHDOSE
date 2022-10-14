class Solution {
    public int longestContinuousSubstring(String s) {
        int length = s.length();
        int max = 0;
        for (int i = 0; i < length-max; i++)
        {
            int j = i+1;
            while (j < length && s.charAt(j-1)+1 == s.charAt(j))
            {
                j++;               
            }
            if (j-i > max)
            {
                max = j-i;
            }
        }
        return max;
    }
}
