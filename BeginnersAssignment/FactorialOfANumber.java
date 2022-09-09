import java.util.*;
public class FactorialOfANumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(fact(a));
	}
	
	public static int fact(int a)
	{
	    if (a == 0 || a == 1)
	    {
	        return 1;
	    }
	    return a * fact(a-1);
	}
}
