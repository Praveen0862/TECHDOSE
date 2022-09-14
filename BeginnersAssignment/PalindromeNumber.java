class Solution {
    public boolean isPalindrome(int x) {
        int num = x,n = 0;
        while (num > 0)
        {
            n = n * 10 + (num%10);
            num /= 10;
        }
        return x==n;
    }
}
