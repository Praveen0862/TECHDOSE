import java.util.*;
public class RadixSort {
    int max(int arr[],int n)
    {
        int large=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        RadixSort s=new RadixSort();
        int large=s.max(arr,n);
        int digits=(int)(Math.log(large)/Math.log(10));
        for(int i=0;i<=digits;i++)
        {
            int []hash=new int[10];
            for(int j=0;j<n;j++)
            {
                int index=(arr[j]/(int)(Math.pow(10,i)))%10;
                hash[index]++;
            }
            for(int k=1;k<10;k++)
            {
                hash[k]+=hash[k-1];
            }
            int ans[]=new int[arr.length];
            for(int l=arr.length-1;l>=0;l--)
            {
                int ind=(arr[l]/((int)Math.pow(10,i)))%10;
                ans[--hash[ind]]=arr[l];
            }
            arr=ans;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
