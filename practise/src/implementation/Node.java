package implementation;

public class Node<T> {
	private T data;
	public Node<T> next;
	public Node(T data) {
		this.data=data;
	}
	public T retData()
	{
		return this.data;
	}
}
