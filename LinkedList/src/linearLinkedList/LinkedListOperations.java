package linearLinkedList;

import java.util.Scanner;

public class LinkedListOperations {
	public LinkedListNode insert()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		LinkedListNode head=null,tail=null;
		while(data!=-1)
		{
			LinkedListNode newNode=new LinkedListNode(data);
			if(head==null&&tail==null)
			{
				head=tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public void printLinkedList(LinkedListNode head)
	{
		while(head!=null)
		{
			System.out.print(head.getData()+" ");
			head=head.next;
		}
	}
	public void getAlternateList(LinkedListNode head)
	{
		if(head==null)
		{
			return;
		}
		if(head.next==null)
		{
			return;
		}
		LinkedListNode headA=head,headB=headA.next,tailA=headA,tailB=headB,mainHead=null;
		boolean toggle=true;
		tailA.next=null;
		if(headB.next==null)
		{
			printLinkedList(headA);
			printLinkedList(headB);
			return;
		}
		mainHead=headB.next;
		tailB.next=null;
		while(mainHead!=null)
		{
			if(toggle)
			{
				tailA.next=mainHead;
				tailA=mainHead;
				mainHead=mainHead.next;
				tailA.next=null;
				toggle=false;
			}
			else
			{
				tailB.next=mainHead;
				tailB=mainHead;
				mainHead=mainHead.next;
				tailB.next=null;
				toggle=true;
			}
		}
		System.out.println("FINAL:");
		printLinkedList(headA);
		System.out.println();
		printLinkedList(headB);
	}
	public void mergeAlternate(LinkedListNode head1,LinkedListNode head2)
	{
		if(head1==null)
		{
			if(head2==null)
			{
				return;
			}
			else
			{
				System.out.println("REMIANING LIST");
				printLinkedList(head2);
			}
		}
		LinkedListNode mainhead=null,tail=null;
		while(head1!=null)
		{
			if(mainhead==null&&tail==null)
			{
				mainhead=tail=head1;
			}
			else
			{
				tail.next=head1;
				tail=head1;
			}
			head1=head1.next;
			tail.next=head2;
			tail=head2;
			head2=head2.next;
			tail.next=null;
		}
		printLinkedList(mainhead);
		System.out.println();
		printLinkedList(head2);
		
	}
	public LinkedListNode deleteXAfterY(LinkedListNode head,int x,int y)
	{
		if(head==null)
		{
			return head;
		}
		boolean flag=true;
		LinkedListNode chead=head;
		for(int i=1;i<y;i++)
		{
			if(chead!=null&&chead.next!=null)
			{
				//System.out.println(chead.getData());
				chead=chead.next;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			for(int i=1;i<=x;i++)
			{
				if(chead!=null&&chead.next!=null)
				{
					System.out.println(chead.next.getData());
					chead.next=(chead.next).next;
				}
				else
				{
					break;
				}
			}
		}
		//System.out.println("CHEAD:"+chead.getData()+" "+chead.next.getData());
		if(flag)
			chead.next=deleteXAfterY(chead.next, x, y);
		return head;
	}
	public LinkedListNode kGroupReverse(LinkedListNode head,int k)
	{
		if(head==null)
		{
			return null;
		}
		//1 2 3 4 5 6 -1
		LinkedListNode mainhead=null,tail=null;
		for(int i=0;i<k;i++)
		{	
			LinkedListNode chead=head,prev=null;
			for(int j=k-1;j>i;j--)
			{
				if(chead!=null)
				{
					prev=chead;
					chead=chead.next;
				}
				else
				{
					break;
				}
			}
			if(mainhead==null&&tail==null)
			{
				mainhead=tail=chead;
			}
			else
			{
				chead.next=tail.next;
				tail.next=chead;
				tail=chead;
			}
			if(prev!=null)
				prev.next=null;
		}
		tail.next=kGroupReverse(tail.next, k);
		return mainhead;
	}
	public LinkedListNode swapKthNode(LinkedListNode head,int K)
	{
		if(head==null)
		{
			return head;
		}
		LinkedListNode KCurr=head,KPrev=null;
		for(int i=1;i<K;i++)
		{
			if(KCurr==null)
			{
				return head;
			}
			else
			{
				KPrev=KCurr;
				KCurr=KCurr.next;
			}
		}
		LinkedListNode Kcurrent_next=KCurr.next;
		KCurr.next=head.next;
		KPrev.next=head;
		head.next=swapKthNode(Kcurrent_next, K);
		head=KCurr;
		return head;
	}

	 
	//1 2 3 4 5 6 7 8 9 10 -1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations opr=new LinkedListOperations();
		LinkedListNode node=opr.insert();
	}

}
