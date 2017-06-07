package problemOftheDay;

import java.util.ArrayList;

public class MaximumSubArr {

	public static ArrayList<Integer> subArr(ArrayList<Integer> arr)
	{	
		ArrayList<Integer> test=new ArrayList<>();
		int i=0,prevsum=0,sum=0,start=0,end=0,prevStart=-1,prevEnd=-1,prevcount=0,count=0;
		while(i<arr.size())
		{
			if(arr.get(i)>=0)
			{
				end=i;
				sum+=arr.get(i);
				count++;
				i++;
			}
			else
			{
				if(sum>prevsum)
				{
					prevStart=start;
					prevEnd=end;
					prevsum=sum;
					prevcount=count;
				}
				else if(sum==prevsum)
				{
					if(count>prevcount)
					{
						prevStart=start;
						prevEnd=end;
						prevsum=sum;
						prevcount=count;
					}
				}
				sum=0;
				count=0;
				i++;
				start=end=i;
			}
			if(sum>prevsum)
			{
				prevStart=start;
				prevEnd=end;
			}
			else if(sum==prevsum)
			{
				if(count>prevcount)
				{
					prevStart=start;
					prevEnd=end;
				}
			}
		}
		if(prevStart==0&&prevEnd==arr.size()-1)
		{
			if(arr.get(prevStart)>arr.get(prevEnd))
			{
				prevEnd-=1;
			}
			else
			{
				prevStart+=1;
			}
		}
		for(i=prevStart;i<=prevEnd;i++)
		{
			test.add(arr.get(i));
		}
		return test;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr1[]={-1,2,9,-7,2,3,-1,3,5};
		int arr1[]={-1,-1,-1};
		int arr2[]={10,11,98,34,2,0,75,47,41,97,22};
		int arr3[]={200,88,89,42,35,65,50,42,59,86,92,97,91,42,27,85,97,63,94,55,57};
		ArrayList<Integer> test=new ArrayList<>(),result;
		for(int i=0;i<arr1.length;i++)
		{
			test.add(arr1[i]);
		}
		result=subArr(test);
		for(Integer i:result)
		{
			System.out.print(i+" ");
		}
		/*System.out.println();
		for(int i=0;i<arr2.length;i++)
		{
			test.add(arr2[i]);
		}
		result=subArr(test);
		for(Integer i:result)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr3.length;i++)
		{
			test.add(arr3[i]);
		}
		result=subArr(test);
		for(Integer i:result)
		{
			System.out.print(i+" ");
		}
		//System.out.println();*/
	}

}
