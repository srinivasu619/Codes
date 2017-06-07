package codingPrac;
import java.util.Scanner;
public class Prime {

	public static void check(int number)
	{	
		int flag=1;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
			System.out.println("NOT PRIME");
		else
			System.out.println("PRIME");
	}
	public static void main(Stringuse[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE:");
		number=sc.nextInt();
		check(number);
		sc.close();
	}

}
