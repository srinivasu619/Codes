package com.Assignment;

import java.util.Scanner;

public class Assignment4 {
	public static int[] intersection(int A[],int B[])
	{
		int k=0,c[]=new int[10];
		for(int i=0;i<A.length;i++)
		{int flag=1;
		for(int j=0;j<B.length;j++)
		{
			if(A[i]==B[j])
			{
				flag=0;
				B[j]=0;
			}
		}
		if(flag==0)
		{
			c[k]=A[i];
			A[i]=0;
			k++;
		}
		}
		return c;
	}
	public static void question2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=intersection(a,b);
		System.out.println("THE INTERSECTION IS:");
		int i=0;
		while(c[i]!=0)
		{
			System.out.print(c[i]+" ");
			i++;
		}
	}
	public static void question3()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int max=0,pos=0,size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++)
		{
			max=a[i];
				for(int j=i+1;j<size;j++)
				{
					if(a[j]>max)
					{
						max=a[j];
						pos=j;
					}
				}
				int temp=a[i];
				a[i]=max;
				a[pos]=temp;

		}
		System.out.println("THE SECOND LARGEST VALUE IS:"+max);
	}
	public static void question4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter The number");
		int number=sc.nextInt();
		for(int i=0;i<size;i++)
		{	int diff1=number-a[i];
			if(diff1>=1)
			{
				for(int j=i+1;j<size;j++)
				{	int diff2=diff1-a[j];
					if(diff2>=0)
					{
						for(int k=j+1;k<size;k++)
						{
							if(diff2==a[k])
							{
								System.out.println("THE REQUIRED PAIR IS Where number:"+number+"("+a[i]+","+a[j]+","+a[k]+")");
							}
						}
					}
				}
			}
		}
	}
	public static void question5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int j=0;j<size;j++)
		{
			a[j]=sc.nextInt();
		}
		int nextzero=0,nexttwo=size-1,i=0;
		while(i<nexttwo)
		{
			//System.out.println(i);
			if(a[i]==1)
			{
				i++;
			}
			else if(a[i]==0)
			{
				int temp=a[i];
				a[i]=a[nextzero];
				a[nextzero]=temp;
				i++;
				nextzero++;
			}
			else if(a[i]==2)
			{
				int temp=a[i];
				a[i]=a[nexttwo];
				a[nexttwo]=temp;
				nexttwo--;
			}
		}
		for(int j=0;j<size;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
	public static void question6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int rot=0,size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=size-1;i>0;i--)
		{
			if(a[i]<a[i-1])
			{
				rot=i;
				break;
			}
		}
		System.out.println("THE No. OF CLOCKWISE ROTATIONS :"+rot);
	}
	public static int Sum(int A[],int start,int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
			sum+=A[i];
		return sum;
	}
	public static void question7()
	{
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int flag=0,size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(;k<size-1;k++)
		{
			if(Sum(a,0,k)==Sum(a,k,size-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("THE EQUILLIBRIUM ELEMENTS IS: "+k);
		else
			System.out.println("THERE IS NO EQUILLIBRIUM ELEMENT");
		
	}
	public static void question8()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int flag=0,size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public static void main(String args[])
	{
		question3();
	}
}
