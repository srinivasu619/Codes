package com.Assignment;
import java.util.Scanner;
import java.lang.Math;
public class Assignment2a {
	static void question1()
	{
		int firstSubject,secondSubject,thirdSubject,min,sum=0;
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name");
		name=sc.next();
		System.out.println("Enter the Three Subject Marks");
		firstSubject=sc.nextInt();
		secondSubject=sc.nextInt();
		thirdSubject=sc.nextInt();
		sc.close();
		sum=firstSubject+secondSubject+thirdSubject;
		if(firstSubject<=secondSubject&&firstSubject<=thirdSubject)
			min=firstSubject;
		else if(secondSubject<=firstSubject&&secondSubject<=thirdSubject)
			min=secondSubject;
		else
			min=thirdSubject;
		sum-=min;
		System.out.println("NAME: "+name);
		System.out.println("AVERAGE OF BEST TWO "+(double)(sum/2));
	}
	static void question2()
	{
		Scanner sc= new Scanner(System.in);
		String c;
		System.out.println("ENTER THE CHARACTER:");
		c=sc.next();
		sc.close();
		int code=c.charAt(0);
		if(code>=65&&code<=90)
			System.out.println("UPPER CASE");
		else if(code>=97&&code<=122)
			System.out.println("LOWER CASE");
		else
			System.out.println("NOT AN ALPHABET");
	}
	static void question3()
	{
		double t_sal,basic,hra,da,allow=0,pf;
		String c;char grade;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE BASIC");
		basic=sc.nextDouble();
		System.out.println("ENTER THE GRADE");
		c=sc.next();
		sc.close();
		hra=0.20*basic;
		da=0.5*basic;
		pf=0.11*basic;
		grade=c.charAt(0);
		if(grade=='A')
			allow=1700;
		if(grade=='B')
			allow=1500;
		if(grade=='C')
			allow=1300;
		t_sal=basic+hra+da+allow-pf;
		System.out.println("THE TOTAL SALARY IS: "+t_sal);
	}
	static void question4()
	{
		int a,b,c,determinant;
		System.out.println("ENTER THE VALUES Of a,b,and c in EQN:ax^2+bx+c");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		determinant=(b*b)-(4*a*c);
		double x,y;
		if(determinant==0)
		{
			System.out.println("ROOTS ARE RAL AND EQUAL");
			y=x=(-1*b)/(2*a);
			System.out.println("ROOTS ARE: "+x+" and "+y);
		}
		else if(determinant>0)
		{
			System.out.println("ROOTS ARE REAL AND DISTINCT");
			x=((-1*b)+Math.sqrt(determinant))/(2*a);
			y=((-1*b)-Math.sqrt(determinant))/(2*a);
			System.out.println("ROOTS ARE: "+x+" and "+y);
		}
		else
		{
			System.out.println("ROOTS ARE IMAGINARY");
		}
		
	}
	static void question5()
	{
		int sumEven=0,sumOdd=0,number,digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		number=sc.nextInt();
		while(number!=0)
		{
			digit=number%10;
			number=number/10;
			if(digit%2==0)
				sumEven+=digit;
			else
				sumOdd+=digit;
		}		sc.close();
		System.out.println("SUM OF THE EVEN DIGITS OF THE NUMBER: "+sumEven);
		System.out.println("SUM OF THE ODD DIGITS OF THE NUMBER: "+sumOdd);
	}
	static void question6()
	{
		int x,n,finalValue=1;
		System.out.println("Enter the Value of 'x' and 'n'");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
		{
			finalValue*=x;
		}
		System.out.println("The Final Value is: "+finalValue);
	}
	static void question7()
	{
		int number,digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		number=sc.nextInt();
		while(number!=0)
		{	
			digit*=10;
			digit+=number%10;
			number=number/10;
		}
		sc.close();
		System.out.println("REVERSE: "+digit);
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
		case 5:question5();
		break;
		case 6:question6();
		break;
		case 7:question7();
		break;
		}
	}

}
