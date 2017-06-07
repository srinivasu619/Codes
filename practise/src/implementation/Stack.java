package implementation;

public class Stack<T> {
	private Node<T> top;
	private int size;
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return getSize()==0;
	}
	public T getTopData()
	{
		if(top==null)
		{
			try
				{
					throw new StackeEmptyException();
				}
			catch (StackeEmptyException e) {}
		}
		return top.retData();
	}
	public void push(T data)
	{
		Node<T> newNode=new Node<T>(data);
		if(top==null)
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
		}
		size++;
	}
	public T pop()
	{
		if(top==null)
		{
			try
			{
				throw new StackeEmptyException();
			}
			catch (StackeEmptyException e) {}
		}
		T temp=top.retData();
		top=top.next;
		size--;
		return temp;
	}
}
