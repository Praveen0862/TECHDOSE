class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length,len2 = nums2.length;
        int arr[] = new int[len1+len2];
        int index = 0,i = 0,j = 0;
        while (i < len1 && j < len2)
        {
            if (nums1[i] < nums2[j])
            {
                arr[index++] = nums1[i++];
            }
            else
            {
                arr[index++] = nums2[j++];
            }
        }
        while (i < len1)
        {
            arr[index++] = nums1[i++];
        }
        while (j < len2)
        {
            arr[index++] = nums2[j++];
        }
        if ((len1+len2)%2 == 1)
        {
            return arr[(len1+len2)/2]*1.0;
        }
        return (arr[(len1+len2)/2] + arr[(len1+len2)/2-1])*0.5; 
    }
}
