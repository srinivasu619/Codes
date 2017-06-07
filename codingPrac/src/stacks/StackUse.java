package stacks;

import java.util.Scanner;

public class StackUse {
	public static void reverse(Stackll stack)
	{
		Stackll stack2=new Stackll();
		while(!stack.isempty())
		{
			System.out.println(stack.data());
			stack2.push(stack.data());
			stack.pop();
		}
		System.out.println("THE FIRST STACK SIZE"+stack.size());
		System.out.println("THE SECOND STACK SIZE"+stack2.size());
		while(!stack2.isempty())
		{
			System.out.println(stack2.data());
			stack2.pop();
		}
		/*String A;
		Scanner sc=new Scanner(System.in);
		A=sc.next();
		boolean flag=true;
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)=='{'||A.charAt(i)=='['||A.charAt(i)=='(')
			{
				stack.push(A.charAt(i));
			}
			if(A.charAt(i)=='}'||A.charAt(i)==']'||A.charAt(i)==')')
			{
				if(A.charAt(i)=='}')
				{
					if(stack.data()=='{')
					{
						stack.pop();
					}
					else
						flag=false;
				}
				if(A.charAt(i)==']')
				{
					if(stack.data()=='[')
					{
						stack.pop();
					}
					else
						flag=false;
				}
				if(A.charAt(i)==')')
				{
					if(stack.data()=='(')
					{
						stack.pop();
					}
					else
						flag=false;
				}
			}
			else
			{}
			if(!flag)
			{
				System.out.println("NOT BALANCED");
				return;
			}
		}
		if(flag)
		{
			if(!stack.isempty())
			{
				System.out.println("NOT BALANCED");
			}
			else
				System.out.println("BALANCED");
		}*/

	}
	public static void reverseStck(Stackll stack,Stackll helper)
	{
		if(stack.size()<=1)
		{
			return;
		}
		char temp=stack.pop();
		reverseStck(stack, helper);
		while(!stack.isempty())
		{
			helper.push(stack.pop());
		}
		stack.push(temp);
		while(!helper.isempty())
		{
			stack.push(helper.pop());
		}
	}
	public static void print(Stackll stack)
	{
		while(!stack.isempty())
		{
			System.out.print(stack.pop()+" ");
		}
	}
	public static void revitr(Stackll stack)
	{
		Stackll helper=new Stackll();
		int size=stack.size();
		for(int i=0;i<size;i++)
		{
			char temp=stack.pop();
			//System.out.println("\nTOP OF THE STACK: "+temp);
			for(int j=0;j< size-i-1;j++)
			{
				helper.push(stack.pop());
			}
			//System.out.println("\nHELPER");
			//print(helper);
			stack.push(temp);
			while(!helper.isempty())
			{
				stack.push(helper.pop());
			}
			//System.out.println("\nSTACK");
			//print(stack);
		}
		while(!stack.isempty())
		{
			System.out.println(stack.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackll stack=new Stackll(),helper;
		for(int i=0;i<4;i++)
		{
			System.out.println((char)(65+i));
			stack.push((char)(65+i));
		}
		
		/*helper=stack;
		while(!helper.isempty())
		{
			System.out.println(helper.pop());
		}*/
		revitr(stack);
	}

}
