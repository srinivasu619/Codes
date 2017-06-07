package codingPrac;

public class Recursion1 {
	public static int factorial(int n)
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static int fact(int num[])
	{
		int count=0,comp=num[0],sum=0;
		if(num.length==1)
		{
			return 0;
		}
		int num2[]=new int[num.length-1];
		for(int i=1;i<num.length;i++)
		{	num2[i-1]=num[i];
		if(num[i]>comp)
		{
			sum+=factorial(num.length-1);
		}
		}
			return sum+fact(num2);

	}
	public static int question2(int num[])
	{
		int count=1,pos;
		if(num.length==0)
			return 0;
		int num2[]=new int[num.length-1];
		for(int i=1;i<num.length;i++)
		{
			num2[i-1]=num[i];
		}
		if(num[0]==7)
			return 0;
		return count+question2(num2);
	}
	public static int question3(int num[],int index)
	{
		int pos=-1;
		boolean flag=false;
		if(index>=num.length)
			return 0;
		if(num[index]==7)
			pos=index;
		int a=question3(num, index+1);
		if(a>pos)
			return a;
		return pos;
	}
	public static int[] question4(int num[],int index)
	{
		
		if(index>=num.length)
			return new int[0];
		int output[]=question4(num, index+1);
		if(num[index]==7)
		{
			int A[]=new int[output.length+1];
			A[0]=index;
			for(int i=1;i<A.length;i++)
			{
				A[i]=output[i-1];
			}
			return A;
		}
			return output;
	}
	public static boolean Array_sort(int num[],int index)
	{
		boolean flag=true;
		if(index>=num.length)
			return flag;
		if((index+1)<num.length)
		{
			if(num[index]>num[index+1])
			{
				return false;
			}	
		}
		else
		return flag;
		return flag&&Array_sort(num, index+1);
	}
	public static void selection_sort(int A[],int index)
	{
		int low=index;
		if(index>=A.length)
			return;
		for(int i=index+1;i<A.length;i++)
		{
			if(A[low]>A[i])
			{
				low=i;
			}
		}
		int temp=A[low];
		A[low]=A[index];
		A[index]=temp;
		selection_sort(A, index+1);
	}
	public static int min_number(int num[],int index)
	{
		if(index>=num.length)
			return Integer.MAX_VALUE;
		int output=min_number(num, index+1);
		if(num[index]<output)
			return num[index];
		return output;
	}
	public static void bubble_sort(int num[],int index)
	{
		if(index<0)
			return;
		for(int i=0;i<index;i++)
		{
			if(num[i]>num[i+1])
			{
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		bubble_sort(num, index-1);
	}
	public static void insertion_sort(int num[],int index)
	{
		int pos=0;
		if(index>=num.length)
			return;
		for(int i=index;i>0;i--)
		{
			if(num[i]<num[i-1])
			{
				int temp=num[i];
				num[i]=num[i-1];
				num[i-1]=temp;
			}
		}
		insertion_sort(num, index+1);
	}
	public static void string_occurance(String s)
	{
		int count1=1,count2=0;
		String aux="",aux2="";
		for(int i=0;i<s.length();i++)
		{	aux="";
			aux+=s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{	
				aux2=aux;
				if((j+1)<=s.length())
				{
					aux2+=s.charAt(j);
					
					System.out.println(aux2+" ");
				}
				//System.out.println(aux2+" ");
			}
		}
	}
	public static String[] String_occurance1(String s)
	{
		if(s.length()==0)
		{
			String [] arr = new String[1];
			arr[0]="";
			
			return arr;
		}
		String output[]=String_occurance1(s.substring(0,s.length()-1));
		String finalString[]=new String[2*output.length];
		for(int i=0;i<output.length;i++)
		{
			finalString[i]=output[i];
		}
		for(int i=output.length;i<finalString.length;i++)
		{
			finalString[i]=output[i-output.length];
			finalString[i]+=s.charAt(s.length()-1);
		}
		return finalString;
	}
	public static void output(String arr[]){
		System.out.print("ARRAY: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void merge_sort(int arr[])
	{
		if(arr.length<=1)
		{
			return;
		}
		int mid=arr.length/2;
		int left[]=new int[mid];
		int right[]=new int [arr.length-mid];
		for(int i=0;i<left.length;i++)
		{
			left[i]=arr[i];
		}
		for(int i=mid;i<arr.length;i++)
		{
			right[i-mid]=arr[i];
		}
		merge_sort(left);
		merge_sort(right);
		merge(left,right,arr);
	}
	public static void merge(int first[],int second[],int third[])
	{
		int i=0,j=0,k=0;
		while(i<first.length&&j<second.length)
		{
			if(first[i]>=second[j])
			{
				third[k]=first[i];
				i++;
			}
			else
			{
				third[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length)
		{
			third[k]=first[i];
			i++;k++;
		}
		while(j<second.length)
		{
			third[k]=second[j];
			j++;k++;
		}
	}

	
public static String keyword(int number)
{
	String word[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	return word[number-2];
}
public static String[] keypad(String s)
{
	if(s.length()==0)
	{
		String A[]=new String [1];
		A[0]="";
		return A;
	}
	
	String key=keyword((int)((s.charAt(s.length()-1))-48));
	String output[]=keypad(s.substring(0, s.length()-1));
	output(output);
	String finalString[]=new String[output.length*key.length()];
	
	int count=0;
	for(int i=0;i<key.length();i++)
	{
		String aux="";
		aux+=key.charAt(i);
		for(int k=0;k<output.length;k++)
			{
				finalString[count+k]=output[k];
				finalString[count+k]+=aux;
			}
		count+=output.length;
		
	}
	return finalString;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num[]={2,3,3,2};
		//int result=fact(num);
		//System.out.println(result);
		/*int num[]={6,1,7,7,7};
		//System.out.println(question2(num));
		//System.out.println(question3(num, 0));
		int a[]=question4(num, 0);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}int num[]={1,2,3,7,6};
		System.out.println(Array_sort(num,0));*/
		//bubble_sort(num, num.length-1);
		//insertion_sort(num, 0);
		/*selection_sort(num, 0);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}*/
		//System.out.println(min_number(num,0));
		//String test="ABCD";
		//String fin[]=String_occurance1(test);
		/*for(int i=0;i<fin.length;i++)
		{
			System.out.print(fin[i]+" ");
		}
		//int first[]={2,6,9,10,12};
		//int second[]={1,5,8,11,13,16,17};
		//int third[]=new int[first.length+second.length];
		//merge(first, second, third);*/
		/*String [] finalS=keypad("23");
		for(int i=0;i<finalS.length;i++)
		{
			System.out.println(finalS[i]+" ");
		}*/
		/*int A[]={5,3,1};
		int B[]={4,2};
		int arr[]=new int[A.length+B.length];
		merge(A, B, arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		int arr[]={5,2,3,2,1};
		merge_sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
