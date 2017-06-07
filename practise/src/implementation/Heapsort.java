package implementation;

public class Heapsort {
	public void buildHeap(int arr[])
	{
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr, i,n);
		}
	}
	public void heapify(int arr[],int index,int n)
	{
		int left=2*index+1;
		int right=2*index+2;
		int largest=index;
		if(left<n&&arr[left]>arr[largest])
		{
			largest=left;
		}
		if(right<n&&arr[right]>arr[largest])
		{
			largest=right;
		}
		if(largest!=index)
		{
			exchange(arr,index,largest);
			heapify(arr, largest,n);
		}
	}
	private void exchange(int[] arr, int index, int largest) {
		// TODO Auto-generated method stub
		int temp=arr[index];
		arr[index]=arr[largest];
		arr[largest]=temp;
	}
	public void print(int arr[])
	{
		 for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i] + " ");
	        }
	}
	public void heap_sort(int arr[])
	{
		buildHeap(arr);
		print(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			exchange(arr, 0, i);
			heapify(arr, 0, i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []a1={4,1,3,2,16,9,10,14,8,7};
		 Heapsort hp=new Heapsort();
	        hp.heap_sort(a1);
	        System.out.println();
	        for(int i=0;i<a1.length;i++){
	            System.out.print(a1[i] + " ");
	        }
	}

}
