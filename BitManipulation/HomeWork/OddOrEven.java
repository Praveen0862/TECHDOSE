import java.util.*;

public class OddOrEven
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(((a&1) == 0) ? "EVEN" : "ODD");
	}
}
