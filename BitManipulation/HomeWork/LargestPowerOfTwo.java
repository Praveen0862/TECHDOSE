import java.util.*;

public class LargestPowerOfTwo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int bitCount = 0;
		while (a > 0)
		{
		    a = a >> 1;
		    bitCount++;
		}
		System.out.println(1 << (bitCount - 1));
	}
}
