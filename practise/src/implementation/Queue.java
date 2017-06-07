package implementation;

public class Queue<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return getSize()==0;
	}
	public T frontData()
	{
		return front.retData();
	}
	public void enque(T data)
	{
		Node<T> newNode=new Node<T>(data);
		if(front==null&&rear==null)
		{
			front=rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}
	public T deque()
	{
		if(front==null)
		{
			try
			{
				throw new QueueEmptyException();
			}
			catch (QueueEmptyException e) {
			}
		}
		T temp=frontData();
		front=front.next;
		size--;
		return temp;
	}
}	
