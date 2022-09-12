import java.util.*;
public class PrimeNumbersFromOneToN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 2)
		{
		    System.out.println("NO PRIME NUMBERS");
		}
		else
		{
		    boolean prime[] = new boolean[N+1];
		    Arrays.fill(prime,true);
		    for (int i = 2; i*i < N; i++)
		    {
		        if (prime[i] == true)
		        {
		            for (int j = i*i; j <= N; j+=i)
		            {
		                prime[j] = false;
		            }
		        }
		    }
		
    		for (int i = 2; i <= N; i++)
    		{
    		    if (prime[i] == true)
    		    {
    		        System.out.println(i);
    		    }
    		}
		}
	}
}
