package codingPrac;
import java.util.Scanner;
import java.util.Vector;
public class Codechef {
	public static int sum(int A[],int left,int right)
	{
		int sum=0;
		for(int i=left-1;i<right;i++)
		{
			sum+=A[i];
		}
		return sum;
	}
	public static void roll()
	{
		Scanner sc=new Scanner(System.in);
		int N,Q,type,L,R;
		N=sc.nextInt();
		Q=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<Q;i++)
		{
			type=sc.nextInt();
			L=sc.nextInt();
			R=sc.nextInt();
			if(type==2)
				System.out.println(sum(A,L,R));
			else
			{
				A[L-1]+=1;
				A[R-1]+=1;
			}
		}
	}
	public static boolean isBalanced(String expression) {
		boolean flag=true;
		if(expression.length()==0)
			return flag;
		String aux="";
		if(expression.charAt(0)=='{'&&expression.charAt(expression.length()-1)=='}')
		{
			aux+=expression.substring(1, expression.length()-1);
		}
		else if(expression.charAt(0)=='('&&expression.charAt(expression.length()-1)==')')
		{
			aux+=expression.substring(1, expression.length()-1);
		}
		else if(expression.charAt(0)=='['&&expression.charAt(expression.length()-1)==']')
		{
			aux+=expression.substring(1, expression.length()-1);
		}
		else
		{
			return false;
		}
		return flag&&isBalanced(aux);
	}
	public static int numberNeeded(String first, String second) {
	      int alpha[]=new int[26];
	        int count =0;
	        for(int i=0;i<first.length();i++)
	            {
	            int code=((int)first.charAt(i))-97;
	            alpha[code]++;
	            }
	        for(int i=0;i<second.length();i++)
	            {
	            int code=((int)second.charAt(i))-97;
	            alpha[code]--;
	            }
	        for(int i=0;i<26;i++)
	            {
	            if(alpha[i]!=0)
	                {
	                count++;
	            }
	        }
	        return count;
	    }
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	public static void number(String a,String b)
	{
		String aux1="",aux2="";
		if(a.length()>b.length())
		{
			aux1=b;
			aux2=a;
		}
		else
		{
			aux1=a;
			aux2=b;
		}
		int alpha[]=new int[26];
		for(int i=0;i<aux1.length();i++)
		{
			int code=((int)aux1.charAt(i))-97;
			alpha[code]++;
		}
		output(alpha);
	}
	public static void output(int[] A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static boolean isAnagram(String a, String b) {

		// Complete the function by writing your code here.
		int alpha[]=new int[26];
		for(int i=0;i<a.length();i++)
		{
			int code=(int)(a.charAt(i));
			if(code>=65&&code<=90)
			{
				code=code-65;
			}
			else
				code=code-97;
			alpha[code]++;
		}
		output(alpha);
		for(int i=0;i<b.length();i++)
		{
			int code=(int)(b.charAt(i));
			if(code>=65&&code<=90)
			{
				code=code-65;
			}
			else
				code=code-97;
			alpha[code]--;
		}
		output(alpha);
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]>0)
				return false;
		}
		return true;

	}

	public static void main2() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();

		// Write your code here.
		String aux="",aux2="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			int code=s.charAt(i);
			if(!((code>=65&&code<=90)||(code>=97&&code<=122)))
			{
				if(aux!="")
				{
					aux2+=aux+"\n";
					count++;
					aux="";
				}
			}      
			else
			{
				aux+=s.charAt(i);
			}    

		}
		System.out.println(count);
		System.out.print(aux2);
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			boolean answer = isBalanced(expression);
			System.out.println(answer);
			if(answer)
				System.out.println("YES");
			else System.out.println("NO");
		}*/
		//System.out.println(isAnagram("anagram", "marganaa"));
		//main2();
		//System.out.println(isBalanced("{{[[(())]]}}"));
		//System.out.println(isBalanced("{[(])}"));
		//fcrxzwscanmligyxyvym
		//jxwtrhvujlmrpdoqbisbwhmgpmeoke
		
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        //System.out.println(numberNeeded(a,b));
        number(a, b);
	}


}
