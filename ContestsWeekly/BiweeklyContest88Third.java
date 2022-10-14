class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int a = 0;
        int len1 = nums1.length,len2 = nums2.length;
        if (len1%2 ==0 && len2%2 == 0)
        {
            return 0;
        }
        for (int i = 0; i < len1; i++)
        {
            for (int j = 0; j < len2; j++)
            {
                a = a^nums1[i]^nums2[j];
            }
        }
        return a;
    }
}
