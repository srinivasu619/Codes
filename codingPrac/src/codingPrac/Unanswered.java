package codingPrac;
public class Unanswered {
	public static void substring(String s,String[] A,int index)
	{
		//System.out.println(index);

		if(index>=s.length())
		{
			for(int i=0;i<A.length;i++)
			{
				System.out.println(A[i]);
			}
			return;
		}
		String output[]=new String[2*A.length];
		for(int i=0;i<A.length;i++)
		{
			output[i]=A[i];
		}
		for(int i=A.length;i<output.length;i++)
		{
			output[i]=A[i-A.length]+s.charAt(index);
		}

		substring(s, output, index+1);

	}
	public static void sub(String s,String output)
	{
		if(s.length()==0)
		{
			System.out.println(output);
			return;
		}
		//System.out.println(output);
		sub(s.substring(1), output+s.substring(0, 1));
		sub(s.substring(1), output);

	}
	public static String fragment(String s,int index)
	{
		String aux="";
		for(int i=0;i<s.length();i++)
		{
			if(i!=index)
			{
				aux+=s.charAt(i);
			}
		}
		return aux;
	}
	public static void permutations(String S,String output)
	{
		if(S.length()==1)
		{
			System.out.println(output+S);
			return;
		}
		for(int i=0;i<S.length();i++)
		{
			String aux=fragment(S, i);
			permutations(aux, output+S.charAt(i));
		}
	}
	public static void subset(int A[],int B[],int index)
	{
		if(index>A.length-1)
		{
			for(int i=0;i<B.length;i++)
			{
				System.out.print(B[i]);
			}
			System.out.println();
			return;
		}
		int b[]=new int [B.length+1];
		for(int i=0;i<B.length;i++)
		{
			b[i]=B[i];
		}
		b[B.length]=A[index];
		subset(A, B, index+1);
		subset(A, b, index+1);
		
	}
	public static void subsettok(int A[],int B[],int index,int k)
	{
		if(index>A.length-1)
		{
			int sum=0;
			for(int i=0;i<B.length;i++)
			{
				sum+=B[i];
			}
			if(sum==k)
			{
				for(int i=0;i<B.length;i++)
				{
					System.out.print(B[i]);
				}
				System.out.println();
			}
			return;
		}
		int b[]=new int [B.length+1];
		for(int i=0;i<B.length;i++)
		{
			b[i]=B[i];
		}
		b[B.length]=A[index];
		subsettok(A, b, index+1,k);
		subsettok(A, B, index+1,k);
	}
	public static String reverse(String A,int index)
	{
		if(index>=A.length())
		{
			return "";
		}
		return reverse(A, index+1)+A.charAt(index);
	}
	
	public static String keyword(int number)
	{
		String word[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return word[number-2];
	}
	public static void keypad(int number,String output)
	{
		if(number==0)
		{
			System.out.println(output);
			return;
		}
		String key=keyword(number%10);
		for(int i=0;i<key.length();i++)
		{
			keypad(number/10, key.charAt(i)+output);
		}
	}
	public static void main2(int A[])
	{
		int left=0,right=0;
		for(int i=1;i<A.length;i++)
		{
			right+=A[i];
		}
		for(int i=1;i<A.length;i++)
		{
			if(left==right)
			{
				System.out.println("THE EQUILLIBRIUM INDEX: "+(i-1));
				break;
			}
			else
			{
				left+=A[i-1];
				right-=A[i];
			}
		}
	}
	public static String para(String S,int index,boolean f)
	{
		boolean flag=f;
		String aux="";
		if(index>S.length())
		{
			return "";
		}
		if(S.charAt(index)=='(')
		{
			aux+=S.charAt(index);
			flag=true;
		}
		else if(S.charAt(index)==')')
		{
			aux+=S.charAt(index);
			return aux;
		}
		else
		{
			if(flag)
			{
				aux+=S.charAt(index);
			}
		}
		//System.out.println("INDEX: " +index+" aux: "+aux+" flag: "+flag);
		return aux+para(S, index+1, flag);
}
	public static String[] codes(String number)
	{
		int length=0;
		if(number.length()==1)
		{
			String A[]=new String[1];
			int code=((int)((char)number.charAt(0)))-47;
			A[0]="";
			A[0]+=(char)(code+64);
			return A;
		}
		if(number.length()==2)
		{
			String A[]=new String[1];
			int code=((int)((char)number.charAt(0)))-47;
			A[0]="";
			A[0]+=(char)(code+64);
			return A;
		}
		//System.out.println(number);
		String output1[]=codes(number.substring(1));
		for(int i=0;i<output1.length;i++)
		{
			int code=((int)((char)number.charAt(0)))-47;
			output1[i]=(char)(code+64)+output1[i];
		}
		int inter_code=Integer.parseInt(number.substring(0, 2));
		if(inter_code<=26)
		{
			String output2[]=codes(number.substring(2));
			for(int j=0;j<output2.length;j++)
			{
				output2[j]=(char)(inter_code+64)+output2[j];
			}
			String output3[]=new String[output1.length+output2.length];
			for(int i=0;i<output1.length;i++)
			{
				output3[i]=output1[i];
			}
			for(int j=0;j<output2.length;j++)
			{
				output3[j+output1.length]=output2[j];
			}
			return output3;
		}
		else
		{	String output3[]=output1;
		return output3;}
	}
	public static int staircase(int n)
	{
		if(n==1||n==2||n==3)
		{
			switch(n)
			{
			case 1:return 1;
			case 2:return 2;
			case 3:return 4;
			}
		}
		return staircase(n-1)+staircase(n-2)+staircase(n-3);
}
	public static int power(int number,int pow)
    {
        if(pow==1)
            return number;
        int smallAns=power(number,pow/2);
        if(pow%2==0)
        {
            return smallAns*smallAns;
        }
        else
        {
            return smallAns*smallAns*number;
        }
    }
	public static int[] binaryConversion(int num){
		//write your code here
        int i=1;
        int size=power(2,i);
        while(size<num)
        {
            i++;
            size=power(2,i);
        }
        System.out.println(i);
        int arr[]=new int[i];
        int count=1;
        while(num!=0)
        {
            int rem=num%2;
            arr[arr.length-count]=rem;
            num=num/2;
            count++;
        }
        return arr;
	}
	public static void sortBinaryArray(int[] arr){
		//write your code here
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==1&&arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
            }
            else if(arr[i]==1&&arr[j]==1)
            {
                j--;
            }
            else if(arr[i]==0&&arr[j]==0)
            {
            	i++;
            }
            else{
            	i++;
            	j--;
            }
            
        }
        for(i=0;i<arr.length;i++)
    	{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String A[]=new String[1];
		//A[0]="";
		//substring("abc", A, 0);
		//sub("abc", "");
		//System.out.println(fragment("ABCD", 1));
		//permutations("ab", "");
		int A[]={4,3,1};
		int B[]=new int [0];
		//subset(A, B, 0);
		//subsettok(A, B, 0, 5);
		//keypad(23,"");
		int v[]={-7, 1, 5, 2, -4, 3, 0};
		//main2(v);
		//System.out.println(para("xyz(abasdac)12345", 0, false));
		//System.out.println(reverse("xyz", 0));
		//System.out.printlsn(staircase(10));
		/*String out[]=codes("1123");
		for(int i=0;i<out.length;i++)
		{
			System.out.println(out.length);
		}*/
		int a[]={1,1,0,1,0,1,0,0,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,0,1,1,0,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,0,1,1,0,1,1,1,0,0,0,0,1,1,1,1,1,0,0,1,0,1,0,1,0,0,1,0,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0,0,0,1,0,1,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,1,0,0,0,1,1,1,0,0,1,1,1,0,1,1,1,0,0,1,0,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1,1,1,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,0,1,1,1,0,0,0,1,0,1,0,1,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,0,1,1,0,0,1,1,0,0,1,1,0,1,0,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,1,1,0,1,0};
		sortBinaryArray(a);
		/*int arr[]=binaryConversion(165);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"");
		}*/
	}

}
