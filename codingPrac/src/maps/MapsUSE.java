package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapsUSE {
	public static void inter1(int arr1[],int arr2[])
	{
		HashMap<Integer, Integer> map=new HashMap<>();

		for(int a:arr1)
		{	Integer count=map.get(a);
		if(count==null)
		{
			map.put(a, 1);
		}
		else
		{
			map.put(a, count+1);
		}
		}
		for(int a:arr2)
		{
			Integer dec=map.get(a);
			if(dec!=null)
			{
				if(dec!=0)
				{
					System.out.println(a);
					map.put(a, dec-1);
				}
			}
		}
	}
	public static int[] dup(int arr1[])
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int a:arr1)
		{	Integer count=map.get(a);
		if(count==null)
		{
			map.put(a, 1);
		}
		}
		int arr[]=new int[map.size()];
		return arr;
	}
	public static void PairZero(int arr[])
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int a:arr)
		{	
			Integer count=map.get(a);
			if(count==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, count+1);
			}
		}
		for(int a:arr)
		{
			if(a!=0)

			{
				Integer itr=map.get(-a);
				if(itr!=null)
				{
					if(map.get(a)!=0)
					{
						for(int i=0;i<itr;i++)
						{
							if(a>0)
								System.out.println(-a+" "+a);
							else
								System.out.println(a+" "+-a);
						}
						map.put(a, map.get(a)-1);
					}
				}
			}
		}

	}
	public static void check(String S,int N)
	{
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<S.length();i++)
		{
			int code=S.charAt(i);
			char a=' ';
			if(code>=65&&code<=90)
			{
				a=(char)(code+32);
			}
			else
			{
				a=S.charAt(i);
			}
			Integer count=map.get(a);
			if(count==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, count+1);
			}
		}
		if(map.size()<=N)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		
	}
	public static void uniqueChar(String S)
	{
		HashMap<Character, Integer> str=new HashMap<>();
		for(int i=0;i<S.length();i++)
		{
			char a=S.charAt(i);
			Integer dec=str.get(a);
			if(dec==null)
			{
				str.put(a, 1);
			}
			else
			{
				str.put(a, dec+1);
			}
		}
		System.out.println(str.size());
	}
	public static void PairDiff(int arr[],int k)
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int a:arr)
		{	
			Integer count=map.get(a);
			if(count==null)
			{
				map.put(a, 1);
			}
			else
			{
				map.put(a, count+1);
			}
		}
		for(int a:arr)
		{
			Integer itr=map.get(k+a);
			if(itr!=null)
			{
				if(map.get(a)!=0)
				{
					for(int i=0;i<itr;i++)
					{
						System.out.println(k+a+" "+a);
					}
					map.put(a, map.get(a)-1);
				}
			}
		}
	}
	public static void duplicateLL()
	{
		
	}
	public static int[] input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY:");
		int size=sc.nextInt();
		int inp[]=new int[size];
		for(int i=0;i<size;i++)
		{
			inp[i]=sc.nextInt();
		}

		return inp;
	}
	public static void window(int arr[],int k)
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<=arr.length-k;i++)
		{
			for(int j=i;j<=i+k-1;j++)
			{
				Integer dec=map.get(arr[j]);
				if(dec==null)
				{
					map.put(arr[j],1);
				}
			}
			System.out.println(map.size());
			map=new HashMap<>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={4,5,6,7,8,1};
		int arr2[]={1,1};
		//inter1(arr1, arr2);
		//int arr[]={-2,2,2,-2};
		//PairZero(arr);
		//check("HelloWorld", 6);
		//uniqueChar("aabbccddeeffffffffffffffffff");
		//PairDiff(arr1, 2)
		int arr[]={20 ,70, 36, 27, 10, 5 ,60 ,98 ,23 ,70, 61, 24, 31, 98, 92, 14, 69, 13 ,51, 78, 4};
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		window(arr, k);
	}

}
