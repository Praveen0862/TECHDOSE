class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = intervals[0][0],end = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i[] : intervals)
        {
            if (i[0] <= end)
            {
                end = Math.max(i[1],end);
            }
            else
            {
                list.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        list.add(new int[]{start,end});
        int [][]arr = new int[list.size()][];
        int ind = 0;
        for (int []i : list)
        {
            arr[ind++] = i;
        }
        return arr;
    }
}
