import java.util.*;
public class SwapTwoNumbersWithoutThirdVariable
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swaping : "+ a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swaping : " + a + " " + b);
	}
}
