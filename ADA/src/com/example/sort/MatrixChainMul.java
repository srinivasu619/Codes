package com.example.sort;

public class MatrixChainMul {
	public static void MatrixCalc(int numberM,int P[])
	{
		int Mcost[][]=new int[numberM][numberM],kindex[][]=new int[numberM][numberM];
		for(int i=0;i<Mcost.length;i++)
		{
			for(int j=0;j<Mcost[0].length;j++)
			{
				
				if(i<j)
				{
					int min=Integer.MAX_VALUE;
					int mink=-1;
					for(int k=i;k<j;k++)
					{
						int currmin=Mcost[i][k]+Mcost[k+1][j]+P[i]*P[k+1]*P[j+1];
						if(currmin<min)
						{
							min=currmin;
							mink=k+1;
						}
					}
					Mcost[i][j]=min;
					kindex[i][j]=mink;
				}
			}
		}
		for(int i=0;i<Mcost.length;i++)
		{
			System.out.println(i+"th row");
			for(int j=0;j<Mcost[0].length;j++)
			{
				System.out.print(Mcost[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<Mcost.length;i++)
		{
			System.out.println(i+"th row");
			for(int j=0;j<Mcost[0].length;j++)
			{
				System.out.print(kindex[i][j]+" ");
			}
			System.out.println();
		}
		printpara(kindex, 0, kindex.length-1);
	}
	public static void printpara(int s[][],int i,int j)
	{
		if(i==j)
		{	System.out.println("A:"+i);
			return;
		}
		
		else
		{
			System.out.println("(");
			printpara(s, i+1, s[i][j]);
			printpara(s, s[i][j]+1, j);
			System.out.println(")");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P[]={1,2,3,4};
		MatrixCalc(3, P);
	}

}
