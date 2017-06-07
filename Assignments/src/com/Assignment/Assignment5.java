package com.Assignment;
import java.util.Scanner;
public class Assignment5 {
	public static String revWord(String word)
	{
		String s="";
		for(int i=word.length()-1;i>=0;i--)
		{
			s+=word.charAt(i);
		}
		return s;
	}
	public static void question1()
	{
		System.out.println("ENTER THE STRING");
		String test,s="";
		int i;
		Scanner sc=new Scanner(System.in);
		test=sc.next();
		for( i=1;i<test.length();i++)
		{
			if(test.charAt(i-1)!=test.charAt(i))
			{
				//System.out.println(i-1);
				s+=test.charAt(i-1);
			}
		}
		s+=test.charAt(i-1);
		System.out.println("THE FINAL STRING IS: "+s);
	}
	public static void question2()
	{
		int check[]=new int[26];
		String test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextLine();
		for(int i=0;i<test.length();i++)
		{
			int code=(int)test.charAt(i);
			//System.out.println(code);
			if(code>=97&&code<=122)
				{
				int diff=code-97;
				check[diff]+=1;
				}
		}
		int pos=0,max=Integer.MIN_VALUE;
		for(int i=0;i<check.length;i++)
		{
			if(check[i]>max)
			{
				max=check[i];
				pos=i;
			}
		}
		System.out.println("THE ELEMENT IS : "+(char)(pos+97)+" occurring: "+max);
		
	}
	public static void question3()
	{
		String [] sentence=new String[10];
		System.out.println("ENTER THE SENTENCE:");
		Scanner sc=new Scanner(System.in);
		int i=0;
		sentence[i]=sc.next();
		while(sentence[i].charAt(0)!='.'||sentence[i].charAt(sentence[i].length()-1)!='.')
		{
			i++;
			sentence[i]=sc.next();
		}
		
		for(int j=0;j<i-1;j++)
		{
			for(int k=0;k<i-j-2;i++)
			{
				if(sentence[k+1]==null)
				break;
				if(sentence[k].length()>sentence[k+1].length())
				{	
					String temp=sentence[k+1];
					sentence[k+1]=sentence[k];
					sentence[k]=temp;
				}
			}
		}
		System.out.println("THIS STRING IS: ");
		for(int j=0;j<sentence.length;j++)
		{
			if(sentence[j]==null)
				break;
			System.out.print(sentence[j]+"  ");
			
		}
		
		
	}
	public static void question4()
	{
		String s="",test;
		int pos=0;
		Scanner sc=new Scanner(System.in);
		test=sc.nextLine();
		for(int i=0;i<test.length();i++)
		{
			if(test.charAt(i)==' '||i==test.length()-1)
			{
				if(i==test.length()-1)
				{
					s+=revWord(test.substring(pos,i+1));
				}
				else
				{s+=revWord(test.substring(pos,i+1));
				pos=i;
				}
			}
		}
		System.out.println("THE STRING IS:"+s);
	}
	public static void question6()
	{
		String s="",test;
		char ch;
		int count=1;
		Scanner sc=new Scanner(System.in);
		test=sc.nextLine();
		s+=ch=test.charAt(0);
		for(int i=1;i<test.length();i++){
			if(test.charAt(i)==ch)
			{
				count++;
			}
			else
			{
				s+=count;
				ch=test.charAt(i);
				s+=ch;
				count=1;
			}
		}
		s+=count;
		System.out.println("THE FINAL STRING IS : "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question4();
	}

}
