package codingPrac;

public class Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=26;i++)
		{
			char c=(char)(96+i);
			for(int j=0;j<i;j++)
			{
				System.out.print(c);
			}
			System.out.print(" ");
		}
	}

}
