import java.util.*;
public class BucketSort {
    int getMax(int arr[],int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    void sort(int arr[],int n)
    {
        int max=getMax(arr,n);
        int bucket[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            bucket[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<=max;i++)
        {
            while(bucket[i]>0)
            {
                arr[j++]=i;
                bucket[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        BucketSort s=new BucketSort();
        s.sort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
