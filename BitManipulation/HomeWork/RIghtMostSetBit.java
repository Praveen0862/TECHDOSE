import java.util.*;

public class RightMostSetBit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int bitCount = 0;
		while (a > 0)
		{
		    if ((a&1) != 0)
		    {
		        System.out.println(1 << bitCount);
		        System.exit(0);
		    }
		    a = a >> 1;
		    bitCount++;
		}
	}
}
