package stacks;

import linked_list.Node;

public class Stackll {
	private Node<Character> top;
	int size=0;
	public int size()
	{
		return size;
	}
	public boolean isempty()
	{
		return size()==0;
	}
	public char data()
	{
		if(top==null)
			return ' ';
		return top.data;
	}
	public void push(char data)
	{
		Node<Character> newnode=new Node<Character>(data);
		if(top==null)
		{
			top=newnode;
		}
		else
		{	newnode.next=top;
			top=newnode;
		}
		size++;
	}
	public char pop()
	{
		if(top==null)
			return ' ';
		char topn=top.data;
		top=top.next;
		size--;
		return topn;
	}

}
