package tool;

import java.util.Scanner;

public class Arrayunsolved {
	public static void merge_sort(int arr[])
	{
		if(arr.length<=1)
		{
			return;
		}
		int mid=arr.length/2;
		int left[]=new int[mid];
		int right[]=new int [arr.length-mid];
		for(int i=0;i<left.length;i++)
		{
			left[i]=arr[i];
		}
		for(int i=mid;i<arr.length;i++)
		{
			right[i-mid]=arr[i];
		}
		merge_sort(left);
		merge_sort(right);
		merge(left,right,arr);
	}
	public static void merge(int first[],int second[],int third[])
	{
		int i=0,j=0,k=0;
		while(i<first.length&&j<second.length)
		{
			if(first[i]<=second[j])
			{
				third[k]=first[i];
				i++;
			}
			else
			{
				third[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length)
		{
			third[k]=first[i];
			i++;k++;
		}
		while(j<second.length)
		{
			third[k]=second[j];
			j++;k++;
		}
	}

public static int  binarySearch(int A[],int ele)
{
	int start=0,last=A.length-1,result=-1;
	while(start<=last)
	{
		int mid=start+(last-start)/2;
		if(A[mid]==ele)
		{
			result=mid;
			last=mid-1;
		}
		else if(A[mid]>ele)
		{
			last=mid-1;
		}
		else
		{
			start=mid+1;
		}
	}
	return result;
}
public static void ArrayIntersection(int arr1[],int arr2[])
{
	merge_sort(arr1);
	merge_sort(arr2);
	int big[],small[];
	if(arr1.length>arr2.length)
	{
		big=arr1;
		small=arr2;
	}
	else
	{
		big=arr2;
		small=arr1;
	}
	//ut(big);
	//out(small);
	int prevpos=Integer.MIN_VALUE;
	for(int i=0;i<small.length;i++)
	{
		int pos=binarySearch(big, small[i]);
		if(pos!=-1&&pos!=prevpos)
		{
			System.out.print(small[i]+" ");
			prevpos=pos;
		}
		
	}
}
public static int [] input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE SIZE:");
	int size=sc.nextInt();
	int A[]=new int[size];
	for(int i=0;i<size;i++)
	{
		A[i]=sc.nextInt();
	}
	return A;
}
public static void out(int A[])
{
	for(int i=0;i<A.length;i++)
	{
		System.out.print(A[i]+" ");
	}
	System.out.println();
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]=input();
		int B[]=input();
		ArrayIntersection(A, B);
	}

}
