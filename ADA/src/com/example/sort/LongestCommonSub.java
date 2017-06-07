package com.example.sort;

public class LongestCommonSub {
	public static int longestSub(String A,String B)
	{
		int lengthMatrix[][]=new int [A.length()+1][B.length()+1];
		for(int i=0;i<A.length();i++)
		{
			for(int j=0;j<B.length();j++)
			{
				if(A.charAt(i)==B.charAt(j))
				{
					lengthMatrix[i+1][j+1]=lengthMatrix[i][j]+1;
				}
				else
				{
					int small =max(lengthMatrix[i][j+1], lengthMatrix[i+1][j]);
					lengthMatrix[i+1][j+1]=max(small, lengthMatrix[i][j]);
				}
			}
		}
		for(int i=1;i<lengthMatrix.length;i++)
		{
			for(int j=1;j<lengthMatrix[0].length;j++)
			{
				System.out.print(lengthMatrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("LONGEST SUBSTRING:"+commSub(A, B, lengthMatrix));
		return lengthMatrix[A.length()][B.length()];
	}
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static int Lcs(String A,String B,int endA,int endB)
	{
		if(endA==0||endB==0)
		{
			return 0;
		}
		if(A.charAt(endA-1)==B.charAt(endB-1))
		{
			//System.out.print(A.charAt(endA-1)+" ");
			return 1+Lcs(A, B, endA-1, endB-1);
		}
		else
		{
			return max(Lcs(A, B, endA-1, endB), Lcs(A, B, endA, endB-1));
		}
	}
	public static String commSub(String A,String B,int m[][])
	{
		int i=A.length(),j=B.length();
		String aux="";
		while(m[i][j]!=0)
		{
			if(A.charAt(i-1)==B.charAt(j-1))
			{
				//System.out.print(A.charAt(i-1)+" ");
				aux=A.charAt(i-1)+aux;
				i--;
				j--;
			}
			else
			{
				if(m[i][j-1]>m[i-1][j])
				{
					j--;
				}
				else
				{
					i--;
				}
			}
		}
		return aux;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="abac",B="aba";
		int endA=A.length(),endB=B.length();
		//System.out.println(Lcs(A, B, endA, endB));
		System.out.println(longestSub(A, B));
	}

}
