class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> arr = new ArrayList<>();
        int n = matrix.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        return arr.get(k-1);
    }
}
