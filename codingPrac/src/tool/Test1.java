package tool;
class A {
    int i;
    void display() {
        System.out.println(i);
    }
}    
class B extends A {
    int j;
    void display() {
        System.out.println(j);
    }
}    

public class Test1 {
	
	public static void print(int input[][])
	{
		 for(int i=0;i<input.length;i++)
	        {
	            for(int count=input.length-i;count>0;count--)
	            {
	                for(int j=0;j<input[0].length;j++)
	                {
	                    System.out.print(input[i][j]+" ");
	                }
	                System.out.println();
	            }
	        }
	}
	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
		if(input1.length()!=input2.length())
		{
			return false;
		}
        int arr[]=new int[26];
        for(int i=0;i<input1.length();i++)
        {
            arr[(int)(input1.charAt(i))-97]++;
        }
        for(int i=0;i<input2.length();i++)
        {
            arr[(int)(input2.charAt(i))-97]--;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
                return false;
        }
        return true;
	}
	public static void print1(int n,String out)
	{
		String aux="()";
		if(n==0)
		{
			System.out.println(out);
			return;
		}
		if(out=="")
		{
			out+=aux;
			print1(n-1, out);
		}
		else
		{
			for(int i=0;i<out.length();i++)
			{
				if(i+2<=out.length())
				{//System.out.println("INSIDE");
					if(out.substring(i, i+2).equals("()"))
					{
						//System.out.println("INSIDE");
						if(out.length()==2)
						{
							print1(n-1,out.substring(0,1)+aux+out.substring(1));
							print1(n-1,out.substring(0,2)+aux+out.substring(2));
						}
						else
						{
							if(i==0)
							{
								print1(n-1,out.substring(0,1)+aux+out.substring(i+1));
							}
							else
							{
								print1(n-1,out.substring(0,i)+aux+out.substring(i));
								print1(n-1,out.substring(0,i+1)+aux+out.substring(i+1));
							}
						}
					}
				}
			}
		}
	}
	public static void a(int ab)
	{
		++ab;
		System.out.println(ab);
	}
	
	public static void main(String args[])
	    {
		 //int input[][]={{1,2,3},{4,5,6},{7,8,9}};
		 //print(input);
		//System.out.println(isPermutation("abcde", "bad"));
		print1(3, "");
		//int b=9;
		//a(b);
		//System.out.println("B:"+b);
	    }
}
