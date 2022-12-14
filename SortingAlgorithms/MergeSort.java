import java.util.*;
public class MergeSort {
    void Merge(int arr[],int l,int m,int r)
    {
        int n1=m+1-l;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            R[i]=arr[m+1+i];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1&&j<n2)
        {
            if(L[i]<=R[j])arr[k++]=L[i++];

            else arr[k++]=R[j++];
        }
        while(i<n1)
        {
            arr[k++]=L[i++];
        }
        while(j<n2)
        {
            arr[k++]=R[j++];
        }
    }
    void Sort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            Sort(arr,l,m);
            Sort(arr,m+1,r);
            Merge(arr,l,m,r);
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		MergeSort ob=new MergeSort();
		ob.Sort(arr,0,arr.length-1);
		for(int i=0;i<n;i++)
        	{
            		System.out.print(arr[i]+" ");
        	}
	}
}
