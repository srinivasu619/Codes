package queues;

import linked_list.Node;

public class Queue<T>{
	private Node<T> front,rear;
	private int size;
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public T Front()
	{
		if(front==null)
			try {
				throw new QueueEmptyException();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		return front.data;
	}
	public void enque(T data)
	{
		Node<T> newnode=new Node<T>(data);
		if(front==null&&rear==null)
		{
			front=rear=newnode;
		}
		rear.next=newnode;
		rear=newnode;
		size++;
	}
	public T deque()
	{
		if(front==null)
			try {
				throw new QueueEmptyException();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}

		T temp = front.data;
		if(front==rear)
		{
			front=rear=null;
		}
		else 
			front=front.next;
		size--;
		return temp;
	}

}
