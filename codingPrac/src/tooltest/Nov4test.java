package tooltest;

public class Nov4test {
	public static void revChar(String str)
	{
		char arr[]=str.toCharArray();
		int i=0,j=str.length()-1;
		while(i<=j)
		{
			int startCode=(int)arr[i];
			int endcode=(int) arr[j];
			if((startCode<97||startCode>120)&&(endcode<97||endcode>120)){
				i++;j--;
			}
			else if(startCode<97||startCode>120)
			{
				i++;
			}
			else if(endcode<97||endcode>120)
			{
				j--;
			}
			else
			{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		String finalString="";
        for(i=0;i<arr.length;i++)
        {
            finalString+=arr[i];
        }
        System.out.println(finalString);
	}
	public static int sumDigits(int number){
		// Write your code here
        if(number/10==0)
        {
            return number;
        }
        int sum=0;
        while(number!=0)
        {
            int digit=number%10;
            sum+=digit;
            number=number-digit;
            number=number/10;
        }
        return sumDigits(sum);
	}
	public static void main(int number)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
