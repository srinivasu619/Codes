package com.example.sort;
import java.util.Scanner;
public class BinarySwitch {
	public static void decision()
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int binaryArr[]=new int[2];
			String binary=sc.next();
			for(int j=0;j<binary.length();j++)
			{
				if(binary.charAt(j)=='0')
				{
					binaryArr[0]++;
				}
				else
				{
					binaryArr[1]++;
				}
			}
			if(binaryArr[0]==1||binaryArr[1]==1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decision();

	}

}
