class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i < n-1; i++)
        {
            if (convertBase(n,i) == 0)
            {
                return false;
            }
        }
        return true;
    }
    public int convertBase(int n,int base)
    {
        int arr[] = new int[100];
        int index = 0;
        while (n > 0)
        {
            arr[index++] = n%base;
            n /= base;
        }
        for (int i = 0; i < index/2; i++)
        {
            if (arr[i] != arr[index-1-i])
            {
                return 0;
            }
        }
        return 1;
    }
}
