import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int pos = sc.nextInt();
		if (pos < 0) 
		{
		    System.out.println("INVALID POSITION");
		}
		else
		{
		    System.out.println( (a&(1 << (pos-1))) == 0 ? "NO" : "YES");
		}
	}
}
