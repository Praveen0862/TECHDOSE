class Solution {
    public int countTime(String t) {
        int chances = 1;
        char time[] = t.toCharArray();
        if (time[0] == '?' && time[1] == '?')
        {
            chances *= 24;
        }
        else if (time[0] == '?' && time[1] <= '3')
        {
            chances *= 3;
        }
        else if (time[0] == '?')
        {
            chances *= 2;
        }
        if (time[1] == '?' && (time[0] == '0' || time[0] == '1'))
        {
            chances *= 10;
        }
        else if (time[1] == '?' && time[0] == '2')
        {
            chances *= 4;
        }
        if (time[3] == '?' && time[4] == '?')
        {
            chances *= 60;
        }
        else if (time[3] == '?')
        {
            chances *= 6;
        }
        else if (time[4] == '?')
        {
            chances *= 10;
        }
        return chances;
    }
}
