package com.Assignment;
import java.util.Scanner;
public class Assignment3 { 
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void question2()
	{
		int prod=1,a[]={1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			prod*=a[i];
		}
		System.out.println("THE PRODUCT OF THE ARRAY IS: "+prod);
	}
	public static void question3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size/2;i++)
		{
			int temp=a[i];
			a[i]=a[size-i-1];
			a[size-i-1]=temp;
		}
		display(a);
		sc.close();
	}
	public static void question4()
	{
		Scanner sc=new Scanner(System.in);
		int pos_sum=0,neg_sum=0;
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]>0)
			{
				pos_sum+=a[i];
			}
			else
			{
				neg_sum+=a[i];
			}
		}
		sc.close();
		System.out.println("THE SUM OF THE NEGATIVE ELEMENTS: "+neg_sum);
		System.out.println("THE SUM OF THE POSITIVE ELEMENTS: "+pos_sum);
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

	public static void question5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		merge_sort(a);
		System.out.println("ENTER THE NUMBER: ");
		int number=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int diff=number-a[i];
			if(diff>0)
			{
				for(int j=i;j<size;j++)
				{
					if(diff==a[j])
					{
						//System.out.println("THE REQUIRED PAIR IS Where number:"+number+"("+a[i]+","+a[j]+")");
						System.out.println(a[i]+" "+a[j]);
					}
				}
			}
		}
		sc.close();
	}
	public static void question6()
	{
		
	}
	public static void question7()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			int flag=1;
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("The first number which has no duplicate"+a[i]);
				break;
			}
		}
	}
	public static void question8()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<size;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
	}
	public static void question9()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int count=0,size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==0)
				count++;
		}
		for(int i=0;i<size;i++)
		{
			if(i<count)
			{
				a[i]=0;
			}
			else
			{
				a[i]=1;
			}
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question5();
	}

}
