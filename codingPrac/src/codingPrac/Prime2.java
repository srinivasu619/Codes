package codingPrac;
import java.util.Scanner;
public class Prime2 {

	public static void main(Stringuse[] args) {
		// TODO Auto-generated method stub
		int end,flag=1;
		System.out.println("ENTER THE LAST NUMBER");
		Scanner sc=new Scanner(System.in);
		end=sc.nextInt();
		for(int i=2;i<=end;i++){
			
			flag = 1;
			for(int j=2;j<=(i/2);j++)
			{	
				if(i%j==0)
				{	
					flag=0;
					break;
				}
			}
			if(flag!=0)
				System.out.println("PRIME"+i);

		}
		sc.close();
	}

}
