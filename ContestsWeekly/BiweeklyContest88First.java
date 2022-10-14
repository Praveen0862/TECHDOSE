class Solution {
    public boolean equalFrequency(String word) {
        int len = word.length();
        int hash[] = new int[26];
        int max = 0,min = len;
        for (int i = 0; i < len; i++)
        {
            hash[word.charAt(i)-97]++;
        }
        for (int k = 0; k < 26; k++)
        {
            if (hash[k] > 0)
            {
                hash[k]--;
                if (isAllSame(hash))
                {
                    return true;
                }
                hash[k]++;
            }
        }
        return false;
    }
    
    public boolean isAllSame(int []hash)
    {
        int same = 0;
        int i = 0;
        for (i = 0;i < 26; i++)
        {
            if (hash[i] > 0)
            {
                same = hash[i];
                break;
            }
        }
        for (int j = i+1; j < 26; j++)
        {
            if (hash[j] != 0 && hash[j] != same)
            {
                return false;
            }
        }
        return true;
    }
}
