import java.util.*;

public class SelectionSort
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];
        for (int i = 0;i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++)
        {
            int minInd = i;
            for (int j = i+1; j < N; j++)
            {
                if (arr[j] < arr[minInd])
                {
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        for (int j = 0; j < N; j++)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
