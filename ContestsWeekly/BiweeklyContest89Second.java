class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int len = queries.length;
        int arr[] = new int[len];
        int val = (int)Math.pow(10,9)+7;
        int nu = n,size = 0;
        while (nu > 0)
        {
            if ((nu&1) == 1 )
            {
                size++;
            }
            nu = nu >> 1;
        }
        int powers[] = new int[size];
        nu = n;
        int index = 0;
        int nume = 1;
        while (nu > 0)
        {
            if ((nu&1) == 1)
            {
                powers[index] = nume;
                index++;
            }
            nume *= 2;
            nu = nu >> 1;
        }
        for (int i = 0; i < len; i++)
        {
            long num = 1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++)
            {
                num = num * (powers[j]);
            }
            arr[i] = (int)(num)%val;
        }
        return arr;
    }
}
