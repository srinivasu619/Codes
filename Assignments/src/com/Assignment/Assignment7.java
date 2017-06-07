package com.Assignment;

public class Assignment7 {
	public static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static String[] permutations(String s)
	{
		if(s.length()==0)
		{
			String a[]=new String [1];
			a[0]="";
			return a;
		}
		String output[]=permutations(s.substring(0, s.length()-1));
		String finalString[]=new String[fact(s.length())];
		int count=0;
		for(int i=0;i<finalString.length;i++)
		{
			finalString[i]=output[count]; 
			if((i+1)%s.length()==0)
			{
				count++;
			}

		}
		for(int i=0;i<finalString.length;i++)
		{	
			int count_pos=0,k=0;
			if(i%s.length()==0)
			{
				String aux="";
				aux+=s.charAt(s.length()-1)+finalString[i];
				finalString[i]=aux;

			}
			else if(i%s.length()==s.length()-1)
			{
				finalString[i]+=s.charAt(s.length()-1);
			}
			else
			{
				String aux="";
				while(k<finalString[i].length())
				{
					if(count_pos==(i%s.length()))
					{
						aux+=s.charAt(s.length()-1);
					}
					else{
						aux+=finalString[i].charAt(k);
						k++;
					}
					count_pos++;
				}
				finalString[i]=aux;
			}
		}
		return finalString;
	}
	public static String [] permutations1(String s){
		if(s.length()==0)
		{
			String a[]=new String [1];
			a[0]="";
			return a;
		}
		String output[]=permutations(s.substring(0, s.length()-1));
		String finalString[]=new String[fact(s.length())];
		int count=0;
		for(int i=0;i<output.length;i++)
		{
			for(int j=0;j<=output[0].length();j++)
			{
				finalString[count]=output[i].substring(0, j)+s.charAt(s.length()-1)+output[i].substring(j, output[i].length());
				count++;
			}
		}
		return finalString;
	}
	public static String[] permutation2(String s)
	{
		if(s.length()==1)
		{
			String a[]={s};
			return a;
		}
		int count=0;
		String finalString[]=new String[fact(s.length())];
		for(int i=0;i<s.length();i++)
		{
			String aux="";
			for(int j=0;j<s.length();j++)
			{	
				
				if(s.charAt(j)!=s.charAt(i))
				{
					aux+=s.charAt(j);
				}
				
			}
			String out[]=permutation2(aux);
			for(int k=0;k<out.length;k++)
			{
				finalString[count++]=s.charAt(i)+out[k];
			}
		
		}
		return finalString;
	}
	
	public static boolean String_check(String s)
	{
		boolean flag=true;
		//System.out.println(s);
		int i=0;
		if(s.length()==0)
			return flag;
		if(s.charAt(i)!='a')
			return false;
		else
		{
			if(s.length()>=3)
			{
				//System.out.println(s.substring(1,3));
				if(s.substring(1,3).equals("bb"))
				{
					//System.out.println(s.substring(3, s.length()));
					return flag&&String_check(s.substring(3, s.length()));
				}
			}
		}
		return flag&&String_check(s.substring(i+1, s.length()));
	}
	public static void display(int finalArray[][])
	{
		for(int i=0;i<finalArray.length;i++)
		{
			for(int j=0;j<finalArray[0].length;j++)
			{
				System.out.print(finalArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] subset(int A[],int index)
	{

		if(index==-1)
		{
			int a[][]=new int[1][A.length];
			for(int j=0;j<A.length;j++)
			{
				a[0][j]=-1;
			}
			return a;
		}
		int output[][]=subset(A, index-1);
	//	System.out.println("OUTPUT:");
	//	display(output);
		int final2d[][]=new int[2*output.length][A.length];
		int count=0;
		for(int i=0;i<final2d.length;i++)
			{
					for(int j=0;j<A.length;j++)
					{
						final2d[i][j]=output[i%output.length][j];
					}

			}
		//System.out.println("FINAL ARRAY(Copying)");
		//display(final2d);
		for(int i=output.length;i<final2d.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<A.length;j++)
			{
				if(final2d[i][j]==-1)
				{
					final2d[i][j]=A[index];
					flag=false;
				}
				if(!flag)
				{
					break;
				}
			}
		}
		//System.out.println("FINAL ARRAY(final)");
		//display(final2d);
		return final2d;
	}
	public static String[] codes(String s)
	{
		if(s.length()==1)
		{
			String aux="";
			aux+=(char)(Integer.parseInt(s)+96);
			String finalstring[]=new String[1];
			finalstring[0]=aux;
			return finalstring;
		}
		String out[]=codes(s.substring(0, s.length()-1));
		String finalString[]=new String [out.length+s.length()-1];
		for(int i=0;i<out.length;i++)
		{
			finalString[i]=out[i];
			String aux="";
			aux+=s.charAt(s.length()-1);
			finalString[i]+=(char)(Integer.parseInt(aux)+96);
		}
		for(int i=out.length;i<finalString.length;i++)
		{
			int number=Integer.parseInt(s.substring(s.length()-2, s.length()));
			if(number<26)
			{
				if(finalString[i]==null)
				{
					finalString[i]="";
				}
				for(int j=0;j<s.length()-2;j++)
				{
					
				}
				String aux="";
				aux+=(char)(number+96);
				finalString[i]+=aux;
			}
		}
		return finalString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String result[]=permutation2("abc");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}/*
		System.out.println(result.length);
		*///System.out.println(String_check("abb"));
		/*int num[]={0,1,2};
		int finalArray[][]=subset(num,2);
		for(int i=0;i<finalArray.length;i++)
		{
			for(int j=0;j<finalArray[0].length;j++)
			{
				System.out.print(finalArray[i][j]+" ");
			}
			System.out.println();
		}*/
		String finalStr[]=codes("1123");
		for(int i=0;i<finalStr.length;i++)
		{
			System.out.print(finalStr[i]+"   ");
		}
	}

}
