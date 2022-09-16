class Solution {
    public int mySqrt(int x) {
        int start = 1,end = x;
        if (x == 0)
        {
            return 0;
        }
        while (true)
        {
            int mid = start + (end-start)/2;
            if (mid > x/mid) 
            {
                end = mid - 1;
            }
            else
            {
                if ((mid+1) > x/(mid+1)) return mid;
                else start = mid+1;
            }
        }
    }
}
