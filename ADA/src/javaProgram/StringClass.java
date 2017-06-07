package javaProgram;

public class StringClass {
	String test;
	int length;
	public StringClass(String test) {
		this.test=test;
		this.length=test.length();
	}

	public boolean equals(StringClass t2)
	{
		if(this.test.length()!=t2.test.length())
		{
			return false;
		}
		else
		{
			for(int i=0;i<this.length;i++)
			{
				if(this.test.charAt(i)!=t2.test.charAt(i))
				{
					return false;
				}
			}
			return true;
		}
	}
	public StringClass substring(int start,int last)
	{
		String s="";
		for(int i=start;i<last;i++)
		{
			s+=this.test.charAt(i);
		}
		StringClass newString=new StringClass(s);
		return newString;
	}
	public void trim()
	{
		String s="";
		int i;
		for(i=0;i<this.length;i++)
		{
			if(this.test.charAt(i)!=' ')
			{
				break;
			}
		}
		int j;
		for(j=i;j<this.length;j++)
		{
			if(this.test.charAt(j)==' '&&j==this.length-1)
			{
				break;
			}
			else
			{
				s+=this.test.charAt(j);
			}
		}
		this.test=s;
		this.length=s.length();
	}
}
