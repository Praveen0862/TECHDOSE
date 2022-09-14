import java.util.*;

public class DigitsOfANUmber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hash[] = new int[10];
		Arrays.fill(hash,0);
		int num = sc.nextInt();
		while (num > 0)
		{
		    hash[num%10] = 1;
		    num /= 10;
		}
		for (int i = 0; i < 10 ;i++)
		{
		    if (hash[i] == 1)
		    {
		        System.out.println(i);
		    }
		}
	}
}
