package codingPrac;

import java.util.HashMap;

public class TextProcessing {
	public static int StringMatch(String s1,String s2)
	{
		int j=0;
		boolean flag=true;
		for(int i=0;i<s1.length() - s2.length();i++)
		{
			j=i;
			flag=true;
				for(;j<=i+s2.length()-1;j++)
				{
					if(s1.charAt(j)!=s2.charAt(j-i))
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					return i;
				}
		}
		return -1;
	}
	public static int StringMatchBoyerMore(String s1,String s2)
	{
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<s2.length();i++)
		{
			map.put(s2.charAt(i), i);
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringMatch("abcdbadeg", "bad"));
	}

}
