import java.util.*;
public class FactorsOfANumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int i;
		for (i = 1 ; i * i < N; i++)
		{
		    if (N%i == 0)
		    {
		        factors.add(i);
		        factors.add(N/i);
		    }
		}
		if (i*i == N)
		{
		    factors.add(i);
		}
		Collections.sort(factors);
		System.out.println("Factors : ");
		for (int j : factors)
		{
		    System.out.println(j);
		}
	}
}
