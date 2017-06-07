package stacks;

public class Minuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getmin Amin=new Getmin();
		int A[]={3,5,2,1,1,-1};
		for(int i=0;i<A.length;i++)
		{
			Amin.minpush(A[i]);
			System.out.println("MIN AT the point is:"+Amin.getminimum());
		}
		Amin.pop();
		Amin.pop();
		Amin.pop();
		System.out.println("MIN AT the point is:"+Amin.getminimum());
		Amin.minpush(-90);
		System.out.println("MIN AT the point is:"+Amin.getminimum());
	}

}
