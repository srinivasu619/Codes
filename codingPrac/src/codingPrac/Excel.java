package codingPrac;
import java.util.Scanner;
public class Excel {
	public static void numeral(String s)
	{
		int num=0,length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			int code=(int)s.charAt(i);
			int diff=code-64;
			//System.out.println(diff);
			num+=diff*Math.pow(26,length-i-1);
		}
		System.out.println(num);
	}
	public static void rev(int num)
	{
		int count=0,que=0;
		String col_name="";
		while(Math.pow(26,count)<num)
		{
			count++;
		}
		//System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			que=num/(int)Math.pow(26,i);
			col_name+=(char)(que+64);
			num=num%(int)Math.pow(26,i);
		}
		System.out.println(col_name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		int number;
		System.out.println("ENTER THE COLUMN NAME:");
		s=sc.next();
		System.out.println("ENTER THE COLUMN NO. :");
		number=sc.nextInt();
		rev(number);
		sc.close();
	}

}
