import java.util.*;

public class BubbleSort
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length ; i++)
		{
		    arr[i] = sc.nextInt();
		}
		for (int i = 0; i < length; i++)
		{
		    for (int j = 0; j < length-1-i; j++)
		    {
		        if (arr[j] > arr[j+1])
		        {
		            int temp = arr[j+1];
		            arr[j+1] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		for (int j : arr)
		{
		    System.out.print(j + " ");
		}
	}
}
