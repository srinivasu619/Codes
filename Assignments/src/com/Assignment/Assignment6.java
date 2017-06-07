package com.Assignment;

public class Assignment6 {

	public static int question1(int first,int times)
	{
		if(times==1)
		{
			return first;
		}
		return first+question1(first,times-1);
	}
	public static int question2(int number)
	{
		int count=0;
		if(number==0)
		{
			return count;
		}
		if(number%10==0)
		{
			count=1;
		}
		return count+question2(number/10);

	}
	public static int question3(int number)
	{
		if(number<10)
			return number;
		return (number%10)+question3(number/10);
	}
	public static int question4(int A[],int index)
	{
		if(index>=A.length)
			return 0;
		return A[index]+question4(A, index+1);
	}
	public static double question5(int num)
	{
		
		if(num==0)
			return 1;
		//	System.out.println(num+"  "+Math.pow(0.5,num));
		return Math.pow(0.5,num)+question5(num-1);
	}
	public static boolean pall(String s,int index)
	{
		boolean flag=true;
		if(index<s.length()/2)
		{
			
			if(s.charAt(index)==s.charAt(s.length()-index-1))
				flag=true;
			else
				flag= false;
			return flag&&(pall(s,index+1));
		}
		else
			return flag;
		
	}
	public static String question7(String s,int index)
	{
		if(index>=s.length())
		{
			return "";
		}
		String aux="",pi="3.14";
		if(s.charAt(index)=='x')
		{
			aux="x";
		}
		if(s.charAt(index)=='p')
		{
			if(s.charAt(index+1)=='i')
				aux=pi;
			else
				aux="p";
		}
		if(s.charAt(index)=='i')
		{
			if(s.charAt(index-1)=='p')
				aux="";
			else
				aux="i";
		}
		return aux+question7(s, index+1);
	}
	public static String question8(String s,int index)
	{
		if(index>=s.length())
			return "";
		String aux="";
		if(s.charAt(index)!='x')
		{
			aux+=s.charAt(index);
		}
		return aux+question8(s,index+1);
	}
	public static int number(String s,int index)
	{
		if(index>=s.length())
			return 0;
		int code=(int)s.charAt(index);
		int diff=code-48;
		return (int)((diff*Math.pow(10.0, s.length()-index-1))+number(s,index+1));
	}
	public static boolean question10(String s,String w,int index)
	{
		boolean flag=true;
		if(s.length()!=w.length())
			return false;
		if(index<s.length())
		{
			if(s.charAt(index)!=w.charAt(w.length()-index-1))
			{
				flag=false;
			}
			return flag&&question10(s,w,index+1);
		}
		return flag;
	}
	public static String question11(String s,int index)
	{
		if(index>=s.length())
			return "";
		String aux="";
		if(index==0)
			aux+=s.charAt(index);
		else if(s.charAt(index)==s.charAt(index-1))
		{
			aux+="*"+s.charAt(index);
		}
		else
		{
			aux+=s.charAt(index);
		}
		return aux+question11(s, index+1); 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number=question1(20, 3);
		//System.out.println(number);
		int number=question2(0);
		System.out.println(number);
		//int number=question3(12345);
		//System.out.println(number);
		//int A[]={1,2,3,4,5,6};
		//int sum=question4(A,0);
		//System.out.println(sum);
		//double series=question5(3);
		//System.out.println(series);
		//boolean response=pall("manam",0);
		//System.out.println(response);
		//String response=question7("pipi",0);
		//System.out.println(response);
		//String response=question8("xx",0);
		//System.out.println(response);
		//System.out.println(number("123694", 0));
		//System.out.println(question10("SHERA","AREHSA",0));
		//System.out.println(question11("aaaa", 0));
	}

}
