import java.util.*;
public class SecondMaximumInAnArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = 0,secondMax = 0;
		for (int i = 0; i < N; i++)
		{
		    arr[i] = sc.nextInt();
		    if (arr[i] > max)
		    {
		        secondMax = max;
		        max = arr[i];
		    }
		    else if (arr[i] > secondMax && arr[i] != max)
		    {
		       secondMax = arr[i];
		    }
		}
		System.out.println(secondMax);
	}
}
