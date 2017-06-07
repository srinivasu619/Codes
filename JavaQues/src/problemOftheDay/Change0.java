package problemOftheDay;

import java.util.Scanner;

public class Change0 {
	public static void makeRowsCols0(int [][]input) {
		// Write your code here
		int previ=-1,prevj=-1;
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[0].length;j++)
			{
				if(input[i][j]==0)
				{	
					if(i!=previ&&j!=prevj)
					{
						for(int k=0;k<input.length;k++)
						{
							input[k][j]=0;
						}
						for(int k=0;k<input[0].length;k++)
						{
							input[i][k]=0;
						}
						previ=i;
						prevj=j;
						break;
					}
				}
			}
		}
	}
	public static int [][] inp(int m,int n)
	{
		int input[][]=new int[m][n];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				input[i][j]=sc.nextInt();
			}
			
		}
		return input;
	}
	public static void print(int input[][])
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[0].length;j++)
			{
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int input[][]=inp(m, n);
		print(input);
		makeRowsCols0(input);
		System.out.println();
		System.out.println();
		System.out.println();
		print(input);
	}

}
