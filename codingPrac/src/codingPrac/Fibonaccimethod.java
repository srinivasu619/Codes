package codingPrac;
import java.util.Scanner;
public class Fibonaccimethod {

	public static void series(int first,int second,int number)
	{
		int third;
		while(first<number)
		{
			third=first+second;
			System.out.println(first);
			first=second;
			second=third;
			
			
		}

	}
	public static boolean check(int first,int second,int number)
	{
		int third;
		while(first<=number)
		{
			if(first==number)
			{
				return true;
			}
			//System.out.println(third);
			third=first+second;
			//System.out.println(first);
			first=second;
			second=third;
			
			
		}
		return false;
	}
	public static void main(Stringuse[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,number;
		boolean status;
		System.out.println("ENTER THE NUMBER");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println("First function");
		series(first, second, number);
		System.out.println("Second function");
		status=check(first, second, number);
		if(status)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

}
