class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1,high = m*n;
        while (low < high)
        {
            int mid = low + (high-low)/2;
            int lessValCount = 0;
            for (int i = 1; i <= m; i++)
            {
                lessValCount += (Math.min(mid/i,n));
            }
            //System.out.println(mid + " " + lessValCount);
            if (lessValCount >= k)
            {
                high = mid;
            }
            else
            {
                low = mid+1;
            }
            //System.out.println(low + " " + high);
        }
        return low;
    }
}
