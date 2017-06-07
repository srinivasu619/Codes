package hackerRank.ProjectEuler;

import java.util.*;

public class Solution63 {
	Stack<Character> stack1=new Stack<>();
	public static int power (int a,int b)
	{
		if(b==1)
			return a;
		int smallans=power(a,b/2);
		if(b%2==0)
			return smallans*smallans;
		else 
			return smallans*smallans*a;		
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=19;i++)
            {
            String s="";
            s+=power(i,number);
            if(s.length()>number)
                {
                break;
            }
            if(s.length()==number)
                {
                System.out.println(s);
            }
        }
    }
}
