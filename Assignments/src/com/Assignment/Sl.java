package com.Assignment;

public class Sl {
	public static int steps1(int number,int p,int q)
	{
		int steps=0;
		while(number!=0)
		{
			if(p==1&&q==1)
			{
				return number;
			}
			int curr1=p,curr2=q,prev1=0,prev2=0;
			if(q==1&&p!=1)
			{
				while(curr1<=number)
				{
					prev1=curr1;
					curr1=curr1*p;
				}
				number-=prev1;
				System.out.println(prev1);
				if(number<p)
				{
					return steps+1+number;
				}
			}
			else if(p==1&&q!=1)
			{
				while(curr2<=number)
				{
					prev2=curr2;
					curr2=curr2*q;
				}
				System.out.println(prev2);
				number-=prev2;
				if(number<q)
				{
					return steps+1+number;
				}
			}
			else
			{
				while(curr1<=number)
				{
				prev1=curr1;
				curr1=curr1*p;
				}
				while(curr2<=number)
				{
					prev2=curr2;
					curr2=curr2*q;
				}
			
			//System.out.println(prev1+"   "+prev2);
			if(prev1>prev2)
			{
				number-=prev1;
			}
			else
				number-=prev2;
			
			}
			steps++;
		}
		return steps;
	}
	public static void main(String a[])
	{
		System.out.println(steps1(52 ,3 ,1));
	}
}
