class Solution {
    public int firstUniqChar(String s) {
        int hash[] = new int[26];
        Arrays.fill(hash,0);
        int length = s.length();
        for (int i = 0 ;i < length; i++)
        {
            hash[s.charAt(i)-97]++;
        }
        for (int i = 0; i < length; i++)
        {
            if (hash[s.charAt(i)-97] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
