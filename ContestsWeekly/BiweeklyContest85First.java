class Solution {
    public int minimumRecolors(String blocks, int k) {
        int length = blocks.length();
        int min = k;
        if (k == length)
        {
            int count = 0;
            for (int i = 0; i < length; i++)
            {
                if (blocks.charAt(i) == 'W')
                {
                    count++;
                }
            }
            return count;
        }
        for (int i = 0; i <= length-k; i++)
        {
            int count = 0;
            for (int j = i; j < i+k ; j++)
            {
                if (blocks.charAt(j) == 'W')
                {
                    count++;
                }
            }
            if (count < min)
            {
                min = count;
            }
        }
        return min;
    }
}
