import java.util.Scanner;

public class SpojQuestions {
	public static int[] createArray(int number)
	{	
		String temp=""+number;
		int arr[]=new int[temp.length()];
		int itr=arr.length-1;
		while(number!=0)
		{
			arr[itr]=number%10;
			number=number/10;
			itr--;
		}
		return arr;
	}
	public static int nextPallindrome(int number)
	{
		int arr[]= createArray(number);
		if(arr.length%2==0)
		{
			int leftMid=arr[arr.length/2-1];
			int rightMid=arr[arr.length/2];
			if(leftMid>rightMid)
			{
				arr[arr.length/2]=leftMid;
				for(int i=1;i<arr.length/2;i++)
				{
					arr[arr.length/2+i]=arr[arr.length/2-i-1];
				}
			}
			else
			{
				int newMiddle =arr[arr.length/2-1]+1;
				arr[arr.length/2-1]=newMiddle%10;
				int carry=newMiddle/10;
				for(int i=arr.length/2-2;i>=0;i--)
				{
					int newNumber=arr[i]+carry;
					arr[i]=newNumber%10;
					carry=newNumber/10;
				}
				for(int i=0;i<arr.length/2;i++)
				{
					arr[arr.length/2+i]=arr[arr.length/2-i-1];
				}
			}
		}
		else
		{
			int middleElement=arr[arr.length/2]+1;
			arr[arr.length/2]=middleElement%10;
			int carry=middleElement/10;
			for(int i=arr.length/2-1;i>=0;i--)
			{
				int newNumber=arr[i]+carry;
					arr[i]=newNumber%10;
					carry=newNumber/10;
			}
			for(int i=0;i<arr.length/2;i++)
				{
					arr[arr.length/2+i+1]=arr[arr.length/2-i-1];
				}
		}
		number=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			number+=arr[i]*(int)Math.pow(10,i);
		}
		return number;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		for(int i=0;i<testCases;i++)
		{
			int number=sc.nextInt();
			System.out.println(nextPallindrome(number));
		}
	}
}
