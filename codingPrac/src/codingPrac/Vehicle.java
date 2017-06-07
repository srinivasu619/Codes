package codingPrac;

public class Vehicle implements CompareInterface<Vehicle>{
	double price;
	@Override
	public int compareTo(Vehicle second) {
		// TODO Auto-generated method stub
		if(this.price>second.price)
		{
			return 1;
		}
		else if(this.price<second.price)
		{
			return -1;
		}
		else
			return 0;
	}
	
}
