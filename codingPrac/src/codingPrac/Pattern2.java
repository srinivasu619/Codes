package codingPrac;
import java.util.Scanner;
public class Pattern2 {

	public static void main(Stringuse[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO OF LINES");
		N=sc.nextInt();
		for(int i=0;i<=N;i++)
		{
			for(int j=0;j<N-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(i+k);
			}
			for(int j=i-2;j>=0;j--)
			{
				System.out.print(i+j);
				//System.out.print("\t");
			}
			System.out.println("\n");
		}
		sc.close();

	}

}
