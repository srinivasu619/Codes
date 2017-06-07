package codingPrac;

public class Sort {
	public static <T extends CompareInterface<T>> void bubbleSort(T input[])
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length-i-1;j++)
			{
				if(input[j].compareTo(input[j+1])>0)
				{
					T temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle[]=new Vehicle[10];
		for(int i=0;i<10;i++)
		{
			vehicle[i]=new Vehicle();
			vehicle[i].price=200.0*(10-i);
		}
		bubbleSort(vehicle);
		for(int i=0;i<10;i++)
		{
			System.out.println(vehicle[i].price);
		}
	}

}
