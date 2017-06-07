package codingPrac;
import java.util.Scanner;
public class Array {
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
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void aux(int arr[])
	{
		int sum=0,max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}

		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("THE SUM OF THE NUMBER IS: "+sum);
		System.out.println("THE LARGEST NUMBER IS: "+max);
	}
	public static void selection_sort(int []arr)
	{
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
		int temp=arr[i];
		arr[i]=min;
		arr[pos]=temp;
		output(arr);
		}
		

	}
	public static void insertion_sort(int arr[])
	{
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{int temp=arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]<arr[j])
				{
					pos=j;
				}
				output(arr);
			}
			for(int k=i;k<pos;k--)
			{
				arr[k]=arr[k-1];
			}
			arr[pos]=temp;
		}

	}
	public static int linear_Search(int []arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
		int number=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
				return i;
		}
		System.out.println("ELEMENT NOT FOUND");
		return 0;
	}
	public static void reverse(int []arr)
	{
		for(int i=0;i<arr.length/2;i++)
		{
			int temp;
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		output(arr);
	}
	public static void bubble_sort(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		output(arr);

	}
	public static void pathsum(int arr1[],int arr2[])
	{
		int i=0,j=0,sum1=0,sum2=0,finalSum=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				sum1+=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				sum2+=arr2[j];
				j++;
			}
			else
			{
				System.out.println("1:"+sum1);
				System.out.println("2:"+sum2);
				if(sum1>sum2)
				{
					finalSum+=sum1+arr1[i];
				}
				else
				{
					finalSum+=sum2+arr1[i];
				}
				sum1=sum2=0;
				i++;
				j++;
			}
		}
		if(sum1>sum2)
		{
			finalSum+=sum1;
		}
		else
		{
			finalSum+=sum2;
		}
		System.out.println(finalSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=input();
		//output(arr);
		/*	aux(arr);
		int i=linear_Search(arr);
	if(i!=0)
			System.out.println(i);
		reverse(arr);*/
		//selection_sort(arr);
		//bubble_sort(arr);
		//insertion_sort(arr);
		int arr1[]={2,3,4,6,8,10,15};
		int arr2[]={0,1,3,5,6,10,11,12};
		pathsum(arr1, arr2);
	}

}
