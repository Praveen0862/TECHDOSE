import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length ; i++)
		{
		    arr[i] = sc.nextInt();
		}
		for (int i = 1; i < length; i++)
		{
		    if (arr[i] < arr[i-1])
		    {
		        int j = i;
		        while (j > 0 && arr[j] < arr[j-1])
		        {
		            int temp = arr[j-1];
		            arr[j-1] = arr[j];
		            arr[j] = temp;
		            j--;
		        }
		    }
		}
		for (int j : arr)
		{
		    System.out.print(j + " ");
		}
	}
}
