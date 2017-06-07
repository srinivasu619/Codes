import java.util.*;
public class TransformtheExp {
	public static String reversePolishNotation(String input)
	{
		Stack<Character> stack=new Stack<>();
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('/',1);
		map.put('*',2);
		map.put('+',3);
		map.put('-',4);
		String finalExp="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)>='a'&&input.charAt(i)<='z')
			{
				finalExp+=input.charAt(i);
			}
			else if(input.charAt(i)==')')
			{
				if(!stack.isEmpty())
				{
					while(stack.peek()!='(')
					{
						finalExp+=stack.pop();
					}
					stack.pop();
				}
			}
			else if(input.charAt(i)=='/'||input.charAt(i)=='+'||input.charAt(i)=='*'||input.charAt(i)=='-')
			{
				if(map.get(stack.peek())!=null&&map.get(stack.peek())>map.get(input.charAt(i)))
				{
					Character c=stack.pop();
					stack.push(input.charAt(i));
					stack.push(c);
				}
				else
				{
					stack.push(input.charAt(i));
				}
			}
			else
			{
				stack.push(input.charAt(i));
			}
		}
		return finalExp;
	}
//(a+(b*c))
//	((a+b)*(z+x))
//((a+t)*((b+(a+c))^(c+d)))
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversePolishNotation("(a+(b*c))"));
		System.out.println(reversePolishNotation("((a+b)*(z+x))"));
		System.out.println(reversePolishNotation("((a+t)*((b+(a+c))^(c+d)))"));
	}

}
/*
 abc*+
ab+zx+*
at+bac++cd+^**/
