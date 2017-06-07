package codingPrac;

import java.util.Scanner;

public class Complexity {
	public static int power (int a,int b)
	{
		if(b==1)
			return a;
		int smallans=power(a,b/2);
		if(b%2==0)
			return smallans*smallans;
		else 
			return smallans*smallans*a;		
	}
	public static int[] input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY:");
		int size=sc.nextInt();
		int inp[]=new int[size];
		for(int i=0;i<size;i++)
		{
			inp[i]=sc.nextInt();
		}

		return inp;
	}
	public static void pair(int arr[],int k)
	{
		int i=0,j=arr.length-1;
		while(j>i)
		{
			int diff=k-arr[i];
			if(diff>arr[j])
				i++;
			else if(diff==arr[j])
			{
				System.out.println(arr[i]+" "+arr[j]);
				i++;
				j--;
			}
			else
				j--;
		}
	}
public static void inter()
{
	int A[]={2,3,4};
	int B[]={3,4,6};
	int i=0,j=0;
	if(A.length<=B.length)
	{
		while(i<A.length)
		{
			System.out.println(i+" "+j);
			if((A[i]-B[j])==0)
			{
				System.out.println(A[i]);
				i++;
				j++;
			}
			else if((A[i]-B[j])<0)
				i++;
			else
				j++;
		}
	}
}
public static int cr(int A[],int start,int end)
{
	if(start>end)
	{
		return -1;
	}
		int mid=start+(end-start)/2;
		//System.out.println(mid);
		if(A[mid+1]>A[mid]&&A[mid]<A[mid-1])
		{//System.out.println(mid);
			return mid;
		}
		else if(A[start]<A[mid])
			return cr(A,mid+1,end);
		else
			return cr(A,start,mid-1);
	
}
public static void quickSort(int arr[],int start,int end)
{
	if(start>=end)
		return;
	int pos=part(arr, start, end);
	quickSort(arr, start, pos-1);
	quickSort(arr, pos+1, end);
	
}
public static int partition(int A[],int start,int end)
{
	int count=0,pivot_pos=start,pivot=A[start];
	for(int i=start+1;i<=end;i++)
	{
		if(A[i]<pivot)
		{
			count++;
		}
	}
	pivot_pos=start+count;
	int temp=A[pivot_pos];
	A[pivot_pos]=A[start];
	A[start]=temp;
	int i=start,j=end;
	while(i<pivot_pos&&j>pivot_pos)
	{
		if(A[i]>A[pivot_pos]&&A[j]<A[pivot_pos])
		{
			temp=A[j];
			A[j]=A[i];
			A[i]=temp;
		}
		else if(A[i]>A[pivot_pos]&&!(A[j]<A[pivot_pos]))
		{
			j--;
		}
		else
			i++;
	}
	return pivot_pos;
	
}
public static int part(int A[],int start,int end)
{
	int pivot_pos=start, pivot=A[end];
	for(int i=start;i<end;i++){
		if(A[i]<=pivot)
		{
			int temp=A[i];
			A[i]=A[pivot_pos];
			A[pivot_pos]=temp;
			pivot_pos++;
		}
	}
	int temp=A[pivot_pos];
	A[pivot_pos]=pivot;
	A[end]=temp;
	return pivot_pos;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(power(3, 2));
		int arr[]=input();
		pair(arr,80);
		//inter();*/
		System.out.println(cr(arr,0,arr.length-1));
		//quickSort(arr1, 0, arr1.length-1);
		/*for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}*/
	}

}
