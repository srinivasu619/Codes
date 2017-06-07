package circularLinkedList;

import java.util.Scanner;

public class CircularLinkedListOperations {
	public CircularLinkedListNode insert()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		CircularLinkedListNode head=null,tail=null;
		while(data!=-1)
		{
			CircularLinkedListNode newNode=new CircularLinkedListNode(data);
			if(head==null&&tail==null)
			{
				head=tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
				tail.next=head;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public void printCircularLinkedList(CircularLinkedListNode head)
	{
		if(head==null)
		{
			return;
		}
		CircularLinkedListNode chead=head;
		do
		{
			System.out.print(chead.data()+" ");
			chead=chead.next;
		}while(chead!=head);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedListOperations opr=new CircularLinkedListOperations();
		CircularLinkedListNode headNode=opr.insert();
		opr.printCircularLinkedList(headNode);
	}

}
