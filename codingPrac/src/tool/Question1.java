package tool;

import java.util.Scanner;
//Username: acm16in2239
//Password: qzS0okS

public class Question1 {	
	
	public static int sum1(int number)
	{
		 int sum = 0;
	        int input = number;
	        while (input != 0) {
	            int lastdigit = input % 10;
	            sum += lastdigit;
	            input /= 10;
	        }
	 return sum;       
	}
	public static void question2()
	{
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int d=sc.nextInt();
			if(d%10==9)
			{
				System.out.println(sum1(d+1));
			}
			else
			{
				System.out.println(d+1);
			}
		}
	}
	public static void main(String[] args) {
		question2();
	}

}
