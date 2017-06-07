package tool;

import java.util.Scanner;

public class Array3 {
	public static int binary_search(int A[],int start,int end,int ele)
	{
		if(start<=end)
		{
			int mid=start+(end-start)/2;
			if(A[mid]==ele)
				return mid;
			else if(A[mid]>ele)
				return binary_search(A, start, mid-1, ele);
			else
				return binary_search(A, mid+1, end, ele);
		}
		return -1;
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
	public static void output(int[] arr)
	{System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
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

	public static void rotate(int[] arr, int d) {
		// Write your code here
		for(int i=0;i<d;i++)
		{   int temp=arr[0];
		for(int j=0;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=temp;
		}
	}
	public static void pushZerosAtEnd(int[] arr,int a,int b){
		//write your code here
		int posfirstZero=a,posfirstNoZero=b;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				posfirstZero=i;
				break;
			}
		}
		for(int i=posfirstZero+1;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{

			}
		}

	}
	/*public static int findUnique(int[] arr){
		//Write your code here
		merge_sort(arr);
		int i=0,j=i+1;
		while(i<arr.length&&j<arr.length-1)
		{
			//if(arr[i])
		}
	}*/
	public static void sumPositiveNegative(int[] arr){
		//write your code here
		int pos=0,neg=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				pos+=arr[i];
			else
				pos+=arr[i];
		}
		System.out.print(pos+"\n"+neg);
	}
	public static int  duplicates(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				return arr[i];
			}
		}
		return -1;
	}
	public static void inter(int A[],int B[])
	{
		int arr1[],arr2[];
		if(A.length>B.length)
		{
			arr1=B;
			arr2=A;
		}
		else
		{
			arr1=A;
			arr2=B;
		}
		merge_sort(arr1);
		for(int i=0;i<arr2.length;i++)
		{
			int result=binary_search(arr1, 0, arr1.length-1, arr2[i]);
			if(result!=-1)
			{
				System.out.print(arr2[i]+" ");
			}
		}
	}
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		//write your code here
		int small[],big[],C[],i=0,j=0,carry=0,sum=0;
		if(arr1.length>arr2.length)
		{	
			small=arr2;
			big=arr1;
			i=small.length-1;
			j=big.length-1;
		}
		else
		{
			small=arr1;
			big=arr2;
			i=small.length-1;
			j=big.length-1;
		}
		C=new int[big.length+1];
		for(int k=1;k<C.length;k++)
		{
			C[k]=big[k-1];
		}
		int k=C.length-1;
		while(i>=0)
		{
			sum=small[i]+big[j]+carry;
			C[k]=sum%10;
			carry=sum/10;
			i--;j--;k--;
		}
		//System.out.println(i+" "+j+" "+k);
		while(j>=0)
		{
			sum=big[j]+carry;
			C[k]=sum%10;
			carry=sum/10;
			j--;k--;
		}
		C[k]=carry;
		if(C[k]!=0)
			return C;
		else
		{
			int D[]=new int [C.length-1];
			for(int l=0;l<D.length;l++)
			{
				D[l]=C[l+1];
			}
			return D;
		}
		
	}
	public static void sortBinaryArray(int[] arr){
		//write your code here
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==1&&arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
            }
            else if(arr[i]==1&&arr[j]==1)
            {
                j--;
            }
            else if(arr[i]==0&&arr[j]==0)
            {
            	i++;
            }
            else{
            	i++;
            	j--;
            }
            
        }
        int zeros=0,ones=0;
        for(i=0;i<arr.length;i++)
    	{
        	if(arr[i]==0)
        		zeros++;
        	else
        		ones++;
			System.out.print(arr[i]+" ");
		}
        System.out.println("\n"+zeros+" "+ones);
	}
	public static void pairSum(int[] arr, int num){
		//write your code here
        int i=0,j=arr.length-1;
    	while(j>i)
		{
			int diff=num-arr[i];
			if(diff>arr[j])
				i++;
			else if(diff==arr[j])
			{
				System.out.println(arr[i]+" "+arr[j]);
				i++;
				j=arr.length-1;
			}
			else
				j--;
		}
	}
	public static void selectionSort(int[] arr){
		//write your code here
        int pos=0;
        for(int i=0;i<arr.length;i++)
        {int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++)
            {
                if(min>arr[j])
                    {
                        min=arr[j];
                        pos=j;
                    }
            }
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=input();
		/*sumPositiveNegative(arr);
	int arr1[]=input();
	sumPositiveNegative(arr1);
	int arr2[]=input();
	sumPositiveNegative(arr2);*/
		//merge_sort(arr);
		//output(arr);
		//System.out.println(duplicates(arr));
		//System.out.println(arr[arr.length-2]);
		//rotate(arr,264);
		//output(arr);
		//merge_sort(arr);
		//pushZerosAtEnd(arr);
		int arr1[]=input();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		/*int arr2[]=input();
		//		inter(arr1, arr2);
		int c[]=sumOfTwoArrays(arr1, arr2);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}*/
		//sortBinaryArray(arr1);
		//selectionSort(arr1);
		pairSum(arr1, num);
		
	}

}
