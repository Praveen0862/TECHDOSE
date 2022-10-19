class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++)
        {
            if (i + rev(i) == num)
            {
                return true;
            }
        }
        return false;
    }
    
    public int rev(int n)
    {
        int dig = 0;
        while (n > 0)
        {
            dig = dig * 10 + n%10;
            n /= 10;
        }
        return dig;
    }

}
