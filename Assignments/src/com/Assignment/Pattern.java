package com.Assignment;

public class Pattern {
	static void pattern1()
	{
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++)
			{
				System.out.print("1");
			}
			System.out.print("\n");
		}
	}
	static void pattern2()
	{	System.out.println("1");
	for(int i=1;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if(j==0||j==i)
			{
				System.out.print(i);
			}
			else
				System.out.print("0");
		}
		System.out.print("\n");
	}
	}
	static void pattern3()
	{
		System.out.println("1");
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i)
				{
					System.out.print("1");
				}
				else
					System.out.print("2");
			}
			System.out.print("\n");
		}
	}
	static void pattern4()
	{
		for(int i=1;i<=5;i++){
			int c=1;
			for(int j=0;j<=5-i;j++)
			{	
				System.out.print(c);
				c++;
			}
			System.out.print("\n");
		}
	}
	static void pattern5()
	{
		for(int i=5;i>=1;i--){
			int c=5;
			for(int j=1;j<=5;j++)
			{	
				if(i==j)
					System.out.print("*");
				else
					System.out.print(c);
				c--;
			}
			System.out.print("\n");
		}
	}
	static void pattern6()
	{
		for(int i=1;i<=5;i++)	
		{
			for(int j=0;j<=5-i;j++)
			{
				if(i%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
		{
			switch(i)
			{
			case 1:	System.out.println("Pattern "+i+"\n");
					pattern1();
					break;
			case 2:System.out.println("Pattern "+i+"\n");
					pattern2();
					break;
			case 3:System.out.println("Pattern "+i+"\n");
					pattern3();
					break;
			case 4:System.out.println("Pattern "+i+"\n");
					pattern4();
					break;
			case 5:System.out.println("Pattern "+i+"\n");
					pattern5();
					break;
			case 6:System.out.println("Pattern "+i+"\n");
					pattern6();
					break;

			}
		}
	}

}
