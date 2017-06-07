package codingPrac;

import java.util.Scanner;

public class Conversion {
	
	public static void convert(int min,int max,int step)
	{
		int curr=min;
		while(curr<=max)
		{
			int celciusValue=(int)((5.0/9)*(curr-32));
			System.out.println(curr+" "+celciusValue);
			curr=curr+step;
		}
	}
	public static void main(Stringuse[] args) {
		// TODO Auto-generated method stub
		int stepSize,minFahrenhietValue,maxFahrenhietValue;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STARTING VALUE");
		minFahrenhietValue=sc.nextInt();
		System.out.println("ENTER THE FINAL VALUE");
		maxFahrenhietValue=sc.nextInt();
		System.out.println("ENTER THE STEP SIZE:");
		stepSize=sc.nextInt();
		convert(minFahrenhietValue,maxFahrenhietValue,stepSize);
		sc.close();
		}

}
