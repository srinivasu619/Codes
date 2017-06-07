package com.Assignment;

import java.util.*;
public class Solution {
    public static HashMap<Integer,Integer> map=new HashMap<>();
     public Solution() {
    	   map.put(0,0);
           map.put(1,1);
           map.put(2,2); 
	}
    public static int recurranceValue(int number)
    {
    	if(number==0)
    	{
    		return map.get(0);
    	}
    	if(number==1)
    	{
    		return map.get(1);
    	}
    	if(number==2)
    	{
    		return map.get(number);
    	}
        int first=number-1;
        int second=number-3;
        int sum=0;
        if(map.get(first)!=null)
        {
            sum+=2*map.get(first);
        }
        else
        {
            sum+=2*recurranceValue(first);
        }
        if(map.get(second)!=null)
        {
            sum+=3*map.get(second);
        }
        else
        {
            sum+=3*recurranceValue(second);
        }
        map.put(number,sum);
        return sum;
    }
    public static int equivalentSum(int arr[],int k)
    {
        int count=0,sum=0,itr=0;
        for(int i=0;i<arr.length-k;i++)
        {
            count+=arr[i];
            for(int j=i;j<i+itr;j++)
            {
                count+=arr[j];
            }
            sum+=recurranceValue(count);
            itr++;
        }
        return sum;
    }
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]=new int[k];
		for(int i=0;i<k;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println(equivalentSum(arr,k));*/
		System.out.println(recurranceValue(3));
		System.out.println(recurranceValue(4));
		System.out.println(recurranceValue(5));
		System.out.println(recurranceValue(6));
		System.out.println(recurranceValue(7));
	}

}