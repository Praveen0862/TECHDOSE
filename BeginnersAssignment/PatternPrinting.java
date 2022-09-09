import java.util.*;
public class PatternPrinting
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++)
		{
		    for (int j = 0; j <= i; j++)
		    {
		        System.out.print(j+1);
		    }
		    System.out.println();
		}
		for (int i = N; i > 0; i--)
		{
		    for (int j = i; j > 0; j--)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
