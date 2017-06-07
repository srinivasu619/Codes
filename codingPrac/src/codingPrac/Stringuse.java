package codingPrac;
import java.util.Scanner;
public class Stringuse {

	public static boolean pallindrome(String input)
	{
		for(int i=0;i<input.length()/2;i++)
		{
			if(input.charAt(i)!=input.charAt(input.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}
	public static void insert()
	{
		String s="",r="";
		int wordcount=0;
		Scanner sc=new Scanner(System.in);
		r=sc.next();
		wordcount++;
		while(r.charAt(0)!='$'||r.charAt(r.length()-1)!='$')
		{
			s+=r+" ";
			//System.out.println(r);
			r=sc.next();
			wordcount++;
		}
		System.out.println("THE NO OF CHARACTERS :"+s.length());
		System.out.println("THE NO OF WORDS: "+(wordcount-1));
	}
	public static int words(String test)
	{
		int count=1;
		for(int i=0;i<test.length();i++)
		{
			if(test.charAt(i)==' ')
			{
				count++;
			}
		}
		return count;
	}
	public static void insert1()
	{
		String r="",s="";
		int wordcount=0,lines=0;
		Scanner sc=new Scanner(System.in);
		r=sc.nextLine();
		lines++;
		wordcount+=words(r);
		while(r.charAt(0)!='$')
		{
			s+=r;
			r=sc.nextLine();
			lines++;
			wordcount+=words(r);

		}
		System.out.println("THE NO OF CHARACTERS: "+s.length());
		System.out.println("THE NO OF LINES: "+(lines-1));
		System.out.println("THE NO OF WORDS: "+(wordcount-1));
	}
	public static void subpart(String input)
	{

		int length=1;
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<=input.length();j++)
			{
				System.out.println(input.substring(i, j));
			}

		}
	}
	public static void big2()
	{
		String s="",aux="",largest="";
		int large=Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();i++)
			{
				if(s.charAt(j)==s.charAt(j+1))
				{
					break;
				}
				else
				{
					s+=s.charAt(j);
				}
			}
			
		}
	}

	public static void min()
	{
		String test;
		int count=0,right=0,min=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		test=sc.nextLine();
		for(int i=0;i<test.length();i++)
		{

			if(test.charAt(i)==' '||i==test.length()-1)
			{//System.out.println(count);
				if(count<min)
				{
					min=count;
					right=i;

				}
				count=0;
			}
			count++;
		}
		//System.out.println(" RIGHT"+right);
		//System.out.println("MIN LENGTH"+min);
		System.out.println(test.substring((right-min+1),right+1 ));

	}
	public static String reverse(String inp)
	{
		String S="";
		for(int i=inp.length()-1;i>=0;i++)
		{
			S+=inp.charAt(i);
		}
		return S;
	}
	public static void rev()
	{
		String test,s="";
		Scanner sc=new Scanner(System.in);
		test=sc.nextLine();
		int pos=test.length();
		for(int i=test.length()-1;i>=0;i--)
		{
			if(test.charAt(i)==' '||i==0)
			{
				if(i==0)
				{
					s+=test.substring(i, pos)+" ";
				}
				else
				{s+=test.substring(i+1, pos)+" ";
				pos=i;
				}
			}		
		}
		System.out.println(" THE REVERSE IS: "+s);
	}
	public static void big()
	{
		String test,s="",largest="";
		int length=Integer.MIN_VALUE;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		test=sc.next();
		for(int i=0;i<test.length();i++)
		{
			s+=test.charAt(i);
			for(int j=i+1;j<test.length();j++)
			{flag=true;
			for(int k=0;k<s.length();k++)
			{
				//System.out.println("j " +test.charAt(j));
				if(test.charAt(j)==s.charAt(k))
				{
					flag=false;
					break;
				}
			}
			if(!flag)
				break;
			s+=test.charAt(j);
			}
			System.out.println(s);
			if(length<=s.length())
			{
				largest=s;
				length=s.length();
			}
			s="";

		}
		System.out.println("THE LARGEST SUBSTRING IS: "+largest);
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		//boolean result=pallindrome("NARESH");
		///System.out.println("THE RESULT: "+result);
		//insert1();
		//subpart("abcde");
		//min();
		//rev();
		big();
	}

}
