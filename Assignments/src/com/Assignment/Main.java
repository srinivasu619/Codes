package com.Assignment;
import java.util.*;
public class Main {
	public static HashMap<Integer, Integer> map=new HashMap<>();
	public Main() {
		map.put(0, 0);
		map.put(1, 1);
		map.put(2, 2);
	}
	public static int recurranceRelation(int number)
	{
		//System.out.println(map.get(1));
		for(int i=3;i<=number;i++)
		{
			int first=map.get((i-1));
			int second=map.get(i-3);
			int term=2*first+3*second;
			map.put(i, term);
		}
		return map.get(number);
	}
	public static int equivalentSum(int arr[],int k)
    {
        int sum=0;
        for(int t=0;t<k;t++)
        {	
        	for(int i=0;i<arr.length-t;i++)
        	{
        		int count=arr[i];
        		for(int j=i+1;j<=i+t;j++)
        		{
        			count+=arr[j];
        		}
        		//System.out.println(count);
        		sum+=recurranceRelation(count);
        	}
        }
        return (int)(sum%(Math.pow(10, 9)+7));
        //return sum;
    }
	public static void main(String args[]) {
		// Write your code here
		Main m=new Main();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        //System.out.println(N);
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(equivalentSum(arr, N));
	}
}
