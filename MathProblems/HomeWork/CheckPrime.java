import java.util.*;
public class CheckPrime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 2; i * i <= N; i++)
		{
		    if (N%i == 0)
		    {
		        System.out.println("Not Prime");
		        System.exit(0);
		    }
		}
		System.out.println("Prime");
	}
}
