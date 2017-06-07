package problemOftheDay;
import java.util.Stack;

public class Brackets {
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
        Stack<String> brackets=new Stack<>();
        //ArrayList<String> arr=new ArrayList<>();
        String exp="";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='(')
            {
                brackets.push("(");
            }
            else if(input.charAt(i)==')')
            {
                if(brackets.peek().length()>1)
                {
                    if(brackets.peek().charAt(0)=='(')
                    {
                    	brackets.pop();
                    }
                    else
                    {
                    	return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(input.charAt(i)==' ')
            {
            	
            }
            else
            {
            	if(brackets.isEmpty())
            	{
            		String a=""+input.charAt(i);
            		brackets.push(a);
            	}
            	else if(brackets.peek().charAt(0)=='(')
                {
            		String op=brackets.pop();
            		brackets.push(op+input.charAt(i));
                }
            }
            if(!brackets.isEmpty())
        	{
            	System.out.println(brackets.peek());
        	}
        }
        if(brackets.isEmpty())
        	return true;
        else
        	return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub F F T
		String s1="(a + (b*c))* (d * ( f * j))";
		String s2="(a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) ";
		String s3="(a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j())) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( (f * j))) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) + (d * ( f * j)) + ()";
		//System.out.println(checkRedundantBrackets("((a+b))"));
		//System.out.println(checkRedundantBrackets(s2));
		System.out.println(checkRedundantBrackets(s3));
	}

}
