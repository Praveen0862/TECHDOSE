import java.util.*;

public class GcdAndLcm
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = gcd(a,b);
		System.out.println("GCD :" + g);
		int lcm = a*b/g;
		System.out.println("LCM :" + lcm);
	}
	
	public static int gcd(int a,int b)
	{
	    if (b == 0)
	    {
	        return a;
	    }
	    return gcd(b,a%b);
	}
}
