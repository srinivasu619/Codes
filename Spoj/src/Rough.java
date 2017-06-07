public class Rough {
	static int gcd(int a, int b)
	{
	    if (a == 0)
	        return b;
	    return gcd(b%a, a);
	}
	public static int convert(String number)
	{
		boolean flag=false;
		String decimalNumber="";
		for(int i=0;i<number.length();i++)
		{
			if(flag)
			{
				decimalNumber+=number.charAt(i);
			}
			if(number.charAt(i)=='.')
			{
				flag=true;
			}
		}
		int GCD=0,num=Integer.parseInt(decimalNumber),den=(int)Math.pow(10, decimalNumber.length());
		while(GCD!=1)
		{
			GCD=gcd(num,den);
			if(GCD==1)
			{
				break;
			}
			num=num/GCD;
			den=den/GCD;
		}
		return den;
	}
	public static void main(String[] args) {
		System.out.println(convert("16.95"));
		System.out.println(convert("45.54"));
		System.out.println(convert("1.321"));
	}

}
