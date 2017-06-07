package codingPrac;

public class Test1 {
	public static String replace(String input){
		// Write your code here
		String aux="",pi="3.14";
		int index=0,i=0;
		System.out.println(input);
		if(input.length()==1)
		{
			String no="";
			no+=input.charAt(0);
			return no;
		}
		if((i+1)<input.length())
		{
			if(input.charAt(i)=='p'&&input.charAt(i+1)=='i')
			{
				aux+=pi;
				index=i+1;
			}
			else
			{
				aux+=input.charAt(i);
			}
		}
		else
		{
			aux+=input.charAt(i);
		}
		System.out.println("aux"+"   "+aux);
		return aux+replace(input.substring(index+1,input.length()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word=replace("piip");
		System.out.println(word);

	}

}
