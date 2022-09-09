import java.util.*;
public class MeanMedianModeOfAnArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int []arr = new int[N];
		for (int i = 0; i < N; i++)
		{
		    arr[i] = sc.nextInt();
		    sum += arr[i];
		}
		System.out.printf("Mean : %.2f%n",sum*1.0/N);
		Arrays.sort(arr);
		if (N%2 == 1)
		{
		    System.out.println("Median : " + arr[N/2]);
		}
		else
		{
		    System.out.printf("Median : %.2f%n" , (arr[(N/2) -1] + arr[(N/2)]) * 0.5);
		}
		
		int mode = 0;
		int i = 0;
		while (i < N)
		{
		    int count = 0,j = i+1;
		    while (j < N && arr[i] == arr[j])
		    {
		        count++;
		        j++;
		    }
		    if (count > mode)
		    {
		        mode = count;
		    }
		    i = j;
		}
		i = 0;
		System.out.print("Mode : ");
		while (i < N)
		{
		    int count = 0,j = i+1;
		    while (j < N && arr[i] == arr[j])
		    {
		        count++;
		        j++;
		    }
		    if (count == mode)
		    {
		        System.out.print(arr[i] + " ");
		    }
		    i = j;
		}
	}
}
