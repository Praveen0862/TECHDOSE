class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int len = s.length();
        int i = 0;
        while (i < len)
        {
            int j = i+1,dist = 0;
            while (j < len && s.charAt(i) != s.charAt(j))
            {
                j++;
                dist++;
            }
            int ascii = s.charAt(i);
            if (j < len && distance[ascii-97] != dist)
            {
                return false; 
            }
            i++;
        }
        return true;
    }
}
