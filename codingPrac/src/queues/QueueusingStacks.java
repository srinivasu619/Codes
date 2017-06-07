package queues;

import stacks.Stack;

public class QueueusingStacks<T> {
	Stack<T> stack1=new Stack<>(),stack2=new Stack<>();
	public boolean isEmpty()
	{
		return stack1.isEmpty()&&stack2.isEmpty();
	}
	public void enque(T data)
	{
		stack1.push(data);
	}
	public T deque()
	{
		if(this.isEmpty())
		{
			try
			{
				throw new QueueEmptyException();
			}
			catch(QueueEmptyException q)
			{}
		}
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
