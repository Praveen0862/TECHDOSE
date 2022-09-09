import java.util.*;
public class PalindromicStringOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int length = s.length();
		for (int i = 0; i < length/2; i++)
		{
		    if (s.charAt(i) != s.charAt(length-1-i))
		    {
		        System.out.println("Not Palindrome");
		        System.exit(0);
		    }
		}
		System.out.println("Palindrome");
	}
}
