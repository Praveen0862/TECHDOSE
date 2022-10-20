class Solution {
    public String decodeMessage(String key, String message) {
        String cipher = "";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int len = key.length();
        for (int i = 0; i < len ; i++)
        {
            if (key.charAt(i) != ' ')
            {
                set.add(key.charAt(i));
            }
        }
        len = message.length();
        for (int i = 0; i < len; i++)
        {
            if (message.charAt(i) == ' ')
            {
                cipher += " ";
            }
            else
            {
                int ind = 0;
                for (char ch : set)
                {
                    if (ch == message.charAt(i))
                    {
                        break;
                    }
                    ind++;
                }
                cipher += (char)(ind+97);
            }
        }
        return cipher;
    } 
}
