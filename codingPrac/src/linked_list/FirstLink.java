package linked_list;

import java.util.Scanner;

public class FirstLink {
	public static Node<Integer> insert()
	{
		Node<Integer> head=null;
		Node<Integer> tail=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE DATA:");
		int data=sc.nextInt();
		while(data!=-1)
		{
			Node<Integer> node=new Node<Integer>(data);
			if(head==null)
			{
				head=node;
				tail=node;
			}
			else
			{
				tail.next=node;
				tail=node;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> node)
	{
		Node<Integer> temp=node;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static Node<Integer> position(int pos,Node<Integer> node)
	{
		Node <Integer> head=node;
		int count=1;
		while(count!=pos)
		{
			count++;
			head=head.next;

		}
		return head;
	}
	public static void insertAtPos(int pos,Node<Integer> node,int data)
	{
		Node <Integer> temp=node;
		int count=1;
		if(pos==1)
		{
			Node<Integer> newnode=new Node<Integer>(data);
			newnode.next=node;
			node=newnode;
			print(node);
		}
		else
		{
			while((count+1)<pos)
			{
				//System.out.println("abc");
				count++;
				temp=temp.next;
			}

			Node<Integer> newnode=new Node<Integer>(data);
			newnode.next=temp.next;
			temp.next=newnode;
			print(node);
		}
	}
	public static void delete(int pos,Node<Integer> node)
	{
		Node<Integer> previous=node;
		Node<Integer> nextone=node.next;
		int count=1;
		if(pos==1)
		{
			node=node.next;
			print(node);
		}
		else
		{
			while(count+1<pos)
			{
				count++;
				if(previous.next==null)
				{
					System.out.println("Not enough elements.");
				}
				else
				{
					previous=previous.next;
					nextone=nextone.next;
				}
			}
			previous.next=nextone.next;
			print(node);
		}
	}
	public static int length(Node<Integer> node)
	{
		if(node==null)
		{
			return 0;
		}
		return 1+length(node.next);
	}
	public static boolean insert(Node<Integer> node,int pos,int data)
	{
		pos=pos-1;
		Node<Integer> temp=node;
		if(pos==0)
		{
			Node<Integer> newnode=new Node<Integer>(data);
			newnode.next=node;
			node=newnode;
			print(node);
			return false;
		}
		else if(pos==1)
		{
			Node<Integer> newnode=new Node<Integer>(data);
			newnode.next=temp.next;
			temp.next=newnode;
			//print(node);
			return true;
		}
	return true||(insert(temp.next, pos, data));
	}
	public static boolean delete(Node<Integer> node,int pos)
	{
		pos=pos-1;
		Node<Integer> temp=node;
		if(pos==0)
		{
			node=node.next;
			print(node);
			return false;
		}
		if(pos==1)
		{
			temp.next=(temp.next).next;
			return true;
		}
		return true||(delete(temp.next,pos));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=insert();
		print(head);
		Node <Integer> ele=position(3, head);
		//System.out.println("\nTHE DATA AT THE NODE IS:"+ele.data);
		//System.out.println(head.data);
		/*System.out.println("\nENTER THE DATA AND POSITION");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		int pos=sc.nextInt();
		insertAtPos(pos, head, data);*/
		//delete(1, head);
		//System.out.println(length(head));
		//boolean f=insert(head, 2, 4);
//		if(f)
		//print(head);
		boolean f=delete(head, 2);
		if(f)
		print(head);
		f=delete(head, 1);
		if(f)
		print(head);
	}

}
