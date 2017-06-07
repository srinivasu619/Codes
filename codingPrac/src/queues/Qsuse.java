package queues;

public class Qsuse {

	public static void main(String args[])
	{
		QueueusingStacks<Integer> q1=new QueueusingStacks<Integer>();
		for(int i=0;i<4;i++)
		{
			q1.enque(i);
		}
		while(!q1.isEmpty())
		{
			System.out.println(q1.deque());
		}
		for(int i=10;i<=40;i+=10)
		{
			q1.enque(i);
		}
		while(!q1.isEmpty())
		{
			System.out.println(q1.deque());
		}
		q1.enque(100);
		q1.enque(200);
		q1.enque(300);
		System.out.println(q1.deque());
		q1.enque(400);
		q1.enque(500);
		System.out.println(q1.deque());
		System.out.println(q1.deque());
	}
}
