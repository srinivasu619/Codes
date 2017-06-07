package stacks;

import queues.Queue;

public class StackUsingQueue<T> {
	Queue<T> Q1=new Queue<T>(),Q2=new Queue<T>();
	public boolean isEmpty()
	{
		return Q1.isEmpty()&&Q2.isEmpty();
	}
	public void push(T data)
	{
		if(!Q1.isEmpty()||this.isEmpty())
			Q1.enque(data);
		else
			Q2.enque(data);
	}
	public T pop()
	{
		T temp;
			if(this.isEmpty())
			{
				try
				{
					throw new StackEmptyException();
				}
				catch(StackEmptyException s)
				{}
			}
			if(!Q1.isEmpty())
			{
				//System.out.println("FIRST"+Q1.size());
				int a1=Q1.size();
				for(int i=0;i<a1-1;i++)
				{
					Q2.enque(Q1.deque());
				}
				temp=Q1.deque();
			}
			else
			{
				//System.out.println("SEC");
				int a2=Q2.size();
				for(int i=0;i<a2-1;i++)
				{
					Q1.enque(Q2.deque());
				}
				temp=Q2.deque();
			}
			return temp;
	}
	
}
