package com.Assignment;
import java.util.Scanner;
import java.lang.Math;
public class Assignment2b {
	static public int sum(int n)
	{
		return (n*(n+1))/2;
	}	
	static public int prod(int n)
	{	int prod1=1;
	for(int  i=1;i<=n;i++)
	{
		prod1*=i;
	}
	return prod1;
	}
	static void question1()
	{
		int number;
		String choice;
		System.out.println("ENTER THE NUMBER:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println("SUM OR PRODUCT?");
		choice=sc.next();
		sc.close();
		switch(choice)
		{
		case "sum":System.out.println("THE SUM IS "+sum(number));
		break;
		case "product":System.out.println("THE PRODUCT IS "+prod(number));
		break;
		}			
	}
	static void question2()
	{
		for(int i=1;i<20;i++)
		{
			int a=3*i+2;
			if(a%4!=0)
				System.out.println(a+" ");
		}
	}
	static void question3()
	{
		Scanner sc=new Scanner(System.in);
		int number,que;
		String binary="",r="";
		System.out.println("ENTER THE NUMBER:");
		number=sc.nextInt();
		que=number;
		while(que!=0)
		{
			binary+=que%2;
			que=que/2;
		}
		for(int i=binary.length()-1;i>=0;i--)
		{
			r+=binary.charAt(i);
		}
		sc.close();
		System.out.println("THE BINARY CONVERSION OF THE NUMBER IS :"+r);

	}
	static void question4()
	{
		Scanner  sc=new Scanner(System.in);
		int number,rem=0,sum=0,i=0;
		System.out.println("ENTER THE BINARY NUMBER:");
		number=sc.nextInt();
		sc.close();
		while(number!=0)
		{	
			rem=number%10;
			sum+=rem*Math.pow(2,i);
			number=number/10;
			i++;
		}
		System.out.println("THE DECIMAL BASE CONVERSION OF THE NUMBER IS:"+sum);
	}
/*	static void question5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		double number;
		int n;
		number=sc.nextDouble();
		System.out.println("THE INTEGER PART IS:"+(int)Math.sqrt(number));
		System.out.print("ENTER THE NO OF DECIMAL PLACES: ");
		n=sc.nextInt();
		sc.close();
		String s="%."+n+"f";
		System.out.println("THE SQUARE ROOT OF THE NUMBER IS:");
		System.out.printf(s,Math.sqrt(number));
	}*/
	static void question6()
	{
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int n,inc=0,flag=1;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
				inc++;
			else
				break;
		}
		System.out.println(inc);
		if(inc>=1&&inc<n)
		{
			for(int i=inc;i<n-1;i++)
			{
				if(a[i]<a[i+1])
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else
			System.out.println("NO");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int ch;
		System.out.println("ENTER THE CHOICE");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:question1();
		break;
		case 2:question2();
		break;
		case 3:question3();
		break;
		case 4:question4();
		break;
		//case 5:question5();
		//break;
		case 6:question6();
		break;
		
		}
	}

}
