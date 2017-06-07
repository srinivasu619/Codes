package codingPrac;
import java.util.Scanner;

public class Pattern1 {

	public static void main(Stringuse[] args) {
		// TODO Auto-generated method stub
		int n=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO. OF LINES");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+"\t");
				c=c+1;
			}
			System.out.print("\n");
		}
		sc.close();

	}

}
