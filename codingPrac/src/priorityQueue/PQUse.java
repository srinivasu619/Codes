package priorityQueue;

import java.util.Scanner;

public class PQUse {

	public static void K_Sorted(int[] arr,int k)
	{
		PQ<Integer> sorted=new PQ<>();
		for(int i=0;i<k;i++)
		{
			sorted.insertMIN(arr[i], arr[i]);
		}
		
		for(int i=k;i<arr.length;i++)
		{
			System.out.print(sorted.removeMIN()+" ");
			sorted.insertMIN(arr[i], arr[i]);
		}
		while(!sorted.isEmpty())
		{
			System.out.print(sorted.removeMIN()+" ");
		}

	}
	public static void K_smallest(int arr[],int k)
	{
		PQ<Integer> heap=new PQ<>();
		for(int i=0;i<k;i++)
		{
			heap.insertMAX(arr[i], arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]<heap.ele().priority)
			{
				heap.removeMAX();
				heap.insertMAX(arr[i], arr[i]);
			}
		}
		System.out.println(heap.ele().priority);
	}
	public static int [] input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void K_merge()
	{
		//Scanner sc=new Scanner(System.in);
		int arr1[]={1,3,5};
		int arr2[]={2,4,6};
		int arr3[]={-2,0,7};
		int arr4[]=new int[arr1.length+arr2.length+arr3.length];
		int firstIndex=0,secondIndex=0,thirdIndex=0,finalIndex=0;
		PQ<Integer> PQmerge=new PQ<>();
		PQmerge.insertMIN(1, arr1[0]);
		PQmerge.insertMIN(2, arr2[0]);
		PQmerge.insertMIN(3, arr3[0]);
		while(firstIndex!=arr1.length||secondIndex!=arr2.length||thirdIndex!=arr3.length)
		{
			PQNode<Integer> node=PQmerge.ele();
			if(node==null)
			{
				break;
			}
			System.out.println(node.priority);
			arr4[finalIndex]=node.priority;
			PQmerge.removeMIN();
			int arr=node.data;
			switch(arr)
			{
				case 1:if(firstIndex+1<arr1.length)
						{
							PQmerge.insertMIN(arr,arr1[++firstIndex]);
						}
						break;
				case 2:if(secondIndex+1<arr2.length)
						{
							PQmerge.insertMIN(arr,arr2[++secondIndex]);
						}
						break;
				case 3:if(thirdIndex+1<arr3.length)
						{
							//System.out.println(arr3[thirdIndex]);
							PQmerge.insertMIN(arr,arr3[++thirdIndex]);
						}
						break;
						
			}
			finalIndex++;
		}
		for(int i=0;i<arr4.length;i++)
		{
			System.out.print(arr4[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,0,4,1,3,6};
		//int arr[]={10,9,8,7,6,5,4,3,2,1};
		/*PQ<Integer> pq1=new PQ<>();
		for(int i:arr)
		{
			pq1.insertMIN(i, i);
		}
		while(!pq1.isEmpty())
		{
			System.out.println(pq1.removeMIN());
		}*/
		//K_Sorted(arr, 3);
		//K_smallest(arr, 3);
		K_merge();
	}

}
