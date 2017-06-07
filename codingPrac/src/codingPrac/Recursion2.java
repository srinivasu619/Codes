package codingPrac;

public class Recursion2 {
	public static void output(int arr[],int first,int last){
		System.out.print("ARRAY: ");
		for(int i=first;i<=last;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
public static void merge_sort(int num[],int first,int last)
{
	int mid;
	if(first<last)
	{
		mid=(first+last)/2;
		merge_sort(num, first, mid);
		//output(num, first, last);
		merge_sort(num, mid+1, last);
		//output(num, first, last);
		merge(num,first,mid,last);
	}
}
public static void merge(int arr[],int first,int mid,int last)
{
	int left[]=new int[mid-first+1];
	int right[]=new int[last-mid];
	for(int i=0;i<mid-first+1;i++)
	{
		left[i]=arr[first+i];
	}
	for(int i=0;i<last-mid;i++)
	{
		right[i]=arr[mid+1+i];
	}
	int i=0,j=0,k=first;
	while(i<mid-first+1&&j<last-mid)
	{
		if(left[i]>right[j])
		{
			arr[k]=left[i];
			i++;
		}
		else
		{
			arr[k]=right[j];
			j++;
		}
		k++;
	}
	while(i<mid-first+1)
	{
		arr[k]=left[i];
		i++;k++;
	}
	while(j<last-mid)
	{
		arr[k]=left[j];
		j++;k++;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={3,2,1};
		merge_sort(num, 0, 2);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}

}
