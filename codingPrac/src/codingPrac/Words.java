package codingPrac;

public class Words {
	public static char alphabets(String number)
	{
		int code=Integer.parseInt(number);
		char alpha=(char)(code+96);
		return alpha;
	}
	public static char alphabets(char number)
	{
		int code=(int)number;
		char alpha=(char)((code-48)+96);
		return alpha;
	}
	public static String [] words(String number)
	{
		if(number.length()==1)
		{
			String A[]=new String[1];
			A[0]=""+alphabets(number);
			return A;
		}
		if(number.length()==2)
		{
			/*String A[]=new String[1];
			A[0]=""+alphabets(number);
			return A;*/
			String output1[]=words(number.substring(1));
			for(int i=0;i<output1.length;i++)
			{
				output1[i]=alphabets(number.charAt(0))+output1[i];
			}
			if(Integer.parseInt(number)<=26)
			{
				String output2[]=new String[2];
				output2[0]=output1[0];
				output2[1]=""+alphabets(number);
				return output2;
			}
			else
				return output1;
		}
		String output1[]=words(number.substring(1));
		for(int i=0;i<output1.length;i++)
		{
			output1[i]=alphabets(number.charAt(0))+output1[i];
		}
		int inter_code=Integer.parseInt(number.substring(0, 2));
		if(inter_code<=26)
		{

			String output2[]=words(number.substring(2));
			for(int i=0;i<output2.length;i++)
			{
				output2[i]=alphabets(number.substring(0, 2))+output2[i];
			}
			String output3[]=new String[output1.length+output2.length];
			for(int i=0;i<output1.length;i++)
			{
				output3[i]=output1[i];
			}
			for(int i=0;i<output2.length;i++)
			{
				output3[output1.length+i]=output2[i];
			}
			return output3;
		}
		else
		{
			String output3[]=new String[output1.length];
			for(int i=0;i<output1.length;i++)
			{
				output3[i]=output1[i];
			}
			return output3;
		}
	}
	public static void words(String number,String output)
	{
		if(number.length()==1)
		{
			System.out.println(alphabets(number)+output);
			return;
		}
		if(number.length()==2)
		{
			words(number.substring(0,1),alphabets(number.charAt(1))+output);
			if(Integer.parseInt(number)<=26)
				{System.out.println(alphabets(number)+output);}
			else
				return;
			return;
		}
		words(number.substring(0,number.length()-1),alphabets(number.charAt(number.length()-1))+output);
		String a=number.substring(number.length()-2, number.length());
		if(Integer.parseInt(a)<=26)
			{words(number.substring(0,number.length()-2),alphabets(number.substring(number.length()-2, number.length()))+output);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A[]=words("1127");
		/*for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}*/
		words("1131","");
	}

}
