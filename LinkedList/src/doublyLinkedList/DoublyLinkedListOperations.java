package doublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListOperations {
	public void insert()
	{
		DoublyLinkedListNode head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1)
		{
			DoublyLinkedListNode newNode=new DoublyLinkedListNode(data);
			if(head==null&&tail==null)
			{
				head=tail=newNode;
			}
			else
			{
				newNode.back=tail;
				tail.front=newNode;
				tail=newNode;
			}
			data=sc.nextInt();
		}
		printForward(head);
		printBackward(tail);
	}
	private void printBackward(DoublyLinkedListNode tail) {
		// TODO Auto-generated method stub
		while(tail!=null)
		{
			System.out.print(tail.getData()+" ");
			tail=tail.back;
		}
		System.out.println();
	}
	private void printForward(DoublyLinkedListNode head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.print(head.getData()+" ");
			head=head.front;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListOperations opr=new DoublyLinkedListOperations();
		opr.insert();
	}

}
