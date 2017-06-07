package hackerRank.ProjectEuler;

import java.util.Scanner;

public class Solution72 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int d=sc.nextInt();
			int count=0;
			for(int j=2;j<=d;j++)
			{
				for(int k=j+1;k<=d;k++)
				{
					if((k%j)!=0)
					{
						System.out.println(j+" and "+k);
						count++;
					}
				}
			}
			System.out.println(count+(d-1));
		}
	}

}
