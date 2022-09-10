import java.util.*;
public class CheckPerfectSquare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i;
		for (i = 0; i*i < N; i++);
		if (i*i == N)
		{
		    System.out.println("Yes");
		}
		else
		{
		    System.out.println("No");
		}
	}
}
