package stacks;

import linked_list.Node;

public class Stack <T>{
	private Node<T> top;
	private int size;
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public T topData()
	{
		if(top==null)
		{
			try
			{
				throw new StackEmptyException();
			}
			catch(StackEmptyException s)
			{}
		}
		return top.data;
	}
	public void push(T data)
	{
		Node<T> newnode=new Node<T>(data);
		newnode.next=top;
		top=newnode;
		size++;
	}
	public T pop()
	{
		if(top==null)
		{
			try
			{
				throw new StackEmptyException();
			}
			catch(StackEmptyException s)
			{}
		}	
			T temp=this.topData();
			top=top.next;
			size--;
			return temp;
			
	}

}
