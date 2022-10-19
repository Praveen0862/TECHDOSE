class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(suits);
        if (suits[0] == suits[4])
        {
            return "Flush";
        }
        int hash[] = new int[14];
        int max = 0;
        for (int i = 0; i < 5; i++)
        {
            hash[ranks[i]]++;
            if (hash[ranks[i]] > max)
            {
                max = hash[ranks[i]];
            }
        }
        if (max >= 3)
        {
            return "Three of a Kind";
        }
        if (max >= 2)
        {
            return "Pair";
        }
        return "High Card";
    }
}
