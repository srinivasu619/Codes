package queues;

public class Queueuse {

	public static <T>void reverse(Queue<T> q)
	{
		if(q.size()==0)
		{
			return;
		}
		T temp=q.Front();
		q.deque();
		reverse(q);
		q.enque(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer>q1=new Queue<Integer>();
		 for(int i=0;i<5;i++)
		 {
			 q1.enque(i);
		 }
		// reverse(q1);
		 while(!q1.isEmpty())
		 {
			 System.out.println(q1.deque());
		 }
		 

	}

}
