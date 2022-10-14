class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int length = heights.length;
        for (int i = 0; i < length; i++)
        {
            for (int j = i+1; j < length; j++)
            {
                if (heights[i] < heights[j])
                {
                    int h = heights[i];
                    heights[i] = heights[j];
                    heights[j] = h;
                    String s = names[i];
                    names[i] = names[j];
                    names[j] = s;
                }
            }
        }
        return names;
    }
}
