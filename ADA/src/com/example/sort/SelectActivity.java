package com.example.sort;

public class SelectActivity {
	public static void selection_sort(int []arr,int arr1[])
	{
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{int min=Integer.MAX_VALUE;
		for(int j=i;j<arr.length;j++)
		{
			if(min>arr[j])
			{
				min=arr[j];
				pos=j;
			}

		}
		int temp=arr[i];
		int temp2=arr1[i];
		arr[i]=min;
		arr1[i]=arr1[pos];
		arr[pos]=temp;
		arr1[pos]=temp2;
		//output(arr);
		}
		

	}
	public static void ActivitySelect(int start[],int end[])
	{
		System.out.println("A1");
		int endTime=end[0];
		for(int i=1;i<start.length;i++)
		{
			if(endTime<start[i])
			{
				endTime=end[i];
				System.out.println("A"+(i+1));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[]={1,3,0,5,3,5,6,8,8,2,12};
		int end[]={4,5,6};
		ActivitySelect(start, end);
	}

}
