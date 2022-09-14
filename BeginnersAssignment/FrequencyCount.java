import java.util.*;

public class FrequencyCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hash[] = new int[26];
		Arrays.fill(hash,0);
		String s = sc.next();
		int length = s.length();
		for (int i = 0; i < length; i++)
		{
		    hash[s.charAt(i)-97]++;
		}
		for (int i = 0; i < 26; i++)
		{
		    if (hash[i] > 0)
		    {
		        System.out.printf("%c : %d\n",i+97,hash[i]);
		    }
		}
	}
}
