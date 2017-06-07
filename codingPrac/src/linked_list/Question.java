package linked_list;
import java.util.Scanner;
public class Question extends FirstLink{
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
	public static Node<Integer> merge(Node<Integer> ptr1,Node<Integer> ptr2)
	{
		Node <Integer> head=null,tail=null;
		if(ptr1==null)
		{
			return ptr2;
		}
		if(ptr2==null)
		{
			return ptr1;
		}

		while(ptr1!=null&&ptr2!=null)
		{
			if(ptr1.data>ptr2.data)
			{
				if(head==null&&tail==null)
				{
					head=tail=ptr2;
					ptr2=ptr2.next;
				}
				else
				{
					tail.next=ptr2;
					tail=ptr2;
					ptr2=ptr2.next;
				}
			}
			else
			{
				if(head==null&&tail==null)
				{
					head=tail=ptr1;
					ptr1=ptr1.next;
				}
				else
				{
					tail.next=ptr1;
					tail=ptr1;
					ptr1=ptr1.next;
				}
			}
		}
		while(ptr1!=null)
		{
			tail.next=ptr1;
			tail=ptr1;
			ptr1=ptr1.next;
		}
		while(ptr2!=null)
		{
			tail.next=ptr2;
			tail=ptr2;
			ptr2=ptr2.next;
		}
		return head;
	}
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
	public static void build_heap(int arr[],int start,int end)
	{
		int mid=start+(end-start)/2;
		for(int i=mid-1;i>=start;i--)
		{
			max_heap(arr, i);
		}
	}
	public static void duplicates(Node<Integer> node)
	{
		if(node==null)
		{
			//Node<Integer> cptr=node;
			return;
		}
		Node<Integer> chead=node;

		int data=chead.data;
		System.out.println("HEAD DATA "+data);
		Node<Integer> cptr=chead.next;
		System.out.println("NEXT DATA "+cptr.data);
		while((cptr).data==data&&chead!=null)
		{
			Node<Integer> temp1=cptr;
			cptr=cptr.next;
			chead.next=cptr;
			temp1.next=null;
			print(chead);
		}
		duplicates(cptr);
	}
	public static void duplicate2(Node<Integer> node)
	{
		Node<Integer> chead=node,cptr=node.next;
		while(cptr.next!=null)
		{
			Node<Integer> temp=cptr;
			if(cptr.data==chead.data)
			{
				chead.next=cptr.next;
				chead=cptr;
				cptr=cptr.next;
				temp.next=null;
			}
		}
	}
	public static Node<Integer> middle(Node<Integer> node)
	{
		Node<Integer> head=node,nexth=node;
		if(head==null||head.next==null)
		{
			return head;
		}
		while(nexth.next!=null&&nexth.next.next!=null)
		{
			head=head.next;
			nexth=nexth.next.next;
		}
		return head;
	}
	public static void mergeHalf(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Node<Integer> mid=middle(root);
		System.out.println(mid.data);
		Node<Integer> head1=root;
		Node<Integer> head2=mid.next,tail=null;
		System.out.println(head2.data);
		mid.next=null;
		root=null;
		while(head1!=null||head2!=null)
		{
			if(head1!=null)
			{
				if(root==null&&tail==null)
				{
					tail=root=head1;
				}
				else
				{
					tail.next=head1;
					tail=head1;
				}
				head1=head1.next;
			}
			if(head2!=null)
			{
				tail.next=head2;
				tail=head2;
				head2=head2.next;
			}
		}
		print(root);
	}
	public static void reverse(Node<Integer> node)
	{
		Node<Integer> chead=node,temp=node,head1=null;
		while(chead!=null)
		{
			if(head1==null)
			{
				chead=temp.next;
				temp.next=null;
				head1=temp;
				temp=chead;
			}
			else
			{
				chead=temp.next;
				temp.next=head1;
				head1=temp;
				temp=chead;
			}
		}
		print(head1);
	}
	public static Node<Integer> reverse2(Node<Integer> node)
	{
		Node<Integer> cnode=node;
		if(node.next==null)
		{
			return node;
		}
		Node<Integer> nextH=reverse2(cnode.next),temp1=nextH;

		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		temp1.next=cnode;
		cnode.next=null;
		return nextH;
	}
	public static void max_heap(int arr[],int i)
	{
		int left=(2*i)+1,right=(2*i)+2;
		int largest=i;
		if(left<arr.length&&arr[left]>arr[i])
		{
			largest =left;
		}
		if(right<=arr.length&&arr[right]>arr[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			max_heap(arr, largest);
		}


	}
	public static void printARR(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void heap_sort(int arr[])
	{
		build_heap(arr, 0, arr.length-1);
		printARR(arr);
		for (int i=0;i<arr.length; i++)
		{
			int temp=arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[0];
			arr[0]=temp;
			max_heap(arr, i);
		}
	}
	public static int posOfNode(Node<Integer> head,Node<Integer> ptr)
	{
		Node<Integer> node=head;
		int count=1;
		while(node.next!=ptr)
		{
			count++;
			node=node.next;
		}
		return count;
	}
	public static Node<Integer> swap(Node<Integer> head,Node<Integer> ptr1,Node<Integer> ptr2)
	{
		Node<Integer> node=head;
		if(ptr1==node)
		{
			if(ptr1.next==ptr2)
			{
				Node<Integer> cpt=ptr2.next;
				node=ptr2;
				ptr1.next=cpt;
				node.next=ptr1;
			}
			else
			{
				Node<Integer> prev,temp=node;
				prev=position(posOfNode(head, ptr2), node);
				node=node.next;
				temp.next=null;
				prev.next=temp;
				temp.next=ptr2.next;
				ptr2.next=node;
				node=ptr2;
			}
		}
		else if(ptr1.next==ptr2)
		{
			Node<Integer> cpt2=ptr2.next,prev1;
			int prevPos1=posOfNode(node, ptr1);
			prev1=position(prevPos1, node);
			ptr1.next=cpt2;
			prev1.next=ptr2;
			ptr2.next=ptr1;
		}
		else
		{
			Node<Integer> cpt1=ptr1.next,cpt2=ptr2.next,prev1,prev2;
			int prevPos1=posOfNode(node, ptr1),prevPos2=posOfNode(node, ptr2);
			//System.out.println(prevPos1);
			prev1=position(prevPos1, node);
			prev2=position(prevPos2, node);
			ptr1.next=cpt2;
			ptr2.next=cpt1;
			prev1.next=ptr2;
			prev2.next=ptr1;
		}
		//print(node);
		return node;
	}
	public static void bubbleSort(Node<Integer> node)
	{
		Node<Integer> head=node,ptr1,ptr2;
		int a=length(node);
		for(int i=0;i<a;i++)
		{
			ptr1=head;
			ptr2=ptr1.next;
			int count=2;
			for(int j=i+1;j<a;j++)
			{	//System.out.println("i: "+i+" j: "+j);
				if(ptr1.data>ptr2.data)
				{
					head=swap(head, ptr1, ptr2);
					print(head);
				}
				ptr1=position(count, head);
				ptr2=ptr1.next;
				count++;
			}
		}
	}
	public static Node<Integer> min(Node<Integer> node)
	{
		int min=Integer.MAX_VALUE;
		Node<Integer> cptr=node,temp=null;
		while(cptr!=null)
		{
			if(min>cptr.data)
			{
				temp=cptr;
				min=cptr.data;
			}
			cptr=cptr.next;
		}
		return temp;
	}
	public static void Selection_Sort(Node<Integer> node)
	{
		int length=length(node);
		Node<Integer> head=node;
		for(int i=1;i<=length;i++)
		{
			Node<Integer> cnode=position(i, head),mincptr=min(cnode);
			//System.out.println(mincptr.data);
			if(cnode!=mincptr)
				head=swap(head, cnode, mincptr);
			print(head);
		}
	}
	public static void rotate(Node<Integer> head,int rotations)
	{
		for(int i=0;i<rotations;i++)
		{
			Node<Integer> chead=head,temp=chead.next;
			while(temp.next!=null)
			{
				chead=chead.next;
				temp=temp.next;
			}
			chead.next=null;
			temp.next=head;
			head=temp;
			//System.out.println("Head "+chead.data+" temp "+temp.data);
			print(head);
		}
	}
	public static void kReverse(Node<Integer> head,int k)
	{
		Node<Integer> node=position(k, head),head1,head2;
		//System.out.println(node.data);
		head1=node.next;
		node.next=null;
		head2=node=reverse2(head);
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=head1;
		print(head2);
	}
	public static void printReverse(Node<Integer> head)
	{
		for(int i=length(head);i>=1;i--)
		{
			System.out.print(position(i, head).data+" ");
		}
	}
	public static Node<Integer> newReverse(Node<Integer> node)
	{	
		Node<Integer> cnode=node;
		if(node.next==null)
		{
			Node<Integer> newnode=new Node<Integer>((node.next).data);
			return newnode;
		}
		Node<Integer> nextH=reverse2(cnode.next),temp1=nextH;

		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		temp1.next=new Node<Integer>(cnode.data);
		return nextH;
	}
	public static boolean pallindrome(Node<Integer> head)
	{
		Node<Integer> mid=middle(head),head1=head,head2=newReverse(mid.next);
		while(head1!=mid||head2!=null)
		{
			if(head1.data!=head2.data)
			{
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return true;
	}
	public static void Swap(Node<Integer> head,int pos1,int pos2)
	{
		Node<Integer> node=head;
		if(pos1==1)
		{
			Node<Integer> ptr2=position(pos2, node),prev=position(pos2-1, node),temp=node;
			node=node.next;
			temp.next=null;
			prev.next=temp;
			temp.next=ptr2.next;
			ptr2.next=node;
			node=ptr2;
		}
		//print(node);
		else if(pos2-pos1==1)
		{
			Node<Integer> ptr1=position(pos1, node),ptr2=position(pos2, node),prev1=position(pos1-1, node),nt2=ptr2.next;
			ptr1.next=nt2;
			prev1.next=ptr2;
			ptr2.next=ptr1;
		}
		else
		{
			Node<Integer> ptr1=position(pos1, node),ptr2=position(pos2, node),prev1=position(pos1-1, node),prev2=position(pos2-1, node),nt1=ptr1.next,nt2=ptr2.next;
			ptr1.next=nt2;
			ptr2.next=nt1;
			prev1.next=ptr2;
			prev2.next=ptr1;
		}
		print(node);
	}
	public static void evenOdd(Node<Integer> node)
	{
		int length=length(node);
		Node<Integer> chead=node,temp=position(length, node);
		while(chead!=temp)
		{
			System.out.println("Front "+chead.data+" LaSt "+temp.data);
			if(chead.data%2==1&&temp.data%2==1)
			{
				chead=chead.next;
			}
			else if(chead.data%2==1&&temp.data%2==0)
			{
				chead=chead.next;
				length=length-1;
				temp=position(length,node);
			}
			else if(chead.data%2==0&&temp.data%2==0)
			{
				length=length-1;
				temp=position(length, node);
			}
			else
			{	Node<Integer> ctp=chead.next;
			node=swap(node,chead,temp);
			chead=ctp;
			length=length-1;
			temp=position(length,node);
			}
			print(node);
		}

	}
	public static void insertionSort(Node<Integer> node)
	{
		int length=length(node);
		Node<Integer> chead=node;
		for(int i=1;i<=length;i++)
		{
			for(int j=i;j>1;j--)
			{
				Node<Integer> cnode=position(j, chead),prev=position(j-1, chead);
				if(cnode.data<prev.data)
					chead=swap(chead,prev, cnode);
			}
		}
		print(chead);
	}
	public static void SelectionREC(Node<Integer> node)
	{
		if(node!=null)
		{
			return;
		}
		Node<Integer> mincptr=min(node);
		if(mincptr!=node)
		{
			swap(node,node,mincptr);
		}
		SelectionREC(node.next);
	}
	public static Node<Integer> merge_Sort(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		Node<Integer> mid=middle(head),head2,head1,head3;
		head3=mid.next;
		mid.next=null;
		head1=merge_Sort(head);
		head2=merge_Sort(head3);

		return merge(head1,head2);
	}
	public static void sortinc(Node<Integer> head)
	{
		Node<Integer> chead=head;
		int a=length(head);
		while(chead!=null)
		{

		}
	}
	public static Node<Integer> append(Node<Integer> root, int n) {
        int length=length(root);
        Node<Integer> tmp=root,newHead=null;
        for(int i=0;i<length-n-1;i++)
        {
            tmp=tmp.next;
        }
        newHead=tmp.next;
        tmp.next=null;
        tmp=newHead;
        while(tmp.next!=null)
        {
            tmp=tmp.next;
        }
        tmp.next=root;
        return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ENTER THE DATA");
		Node<Integer> head=insert();
		print(head);
		//System.out.println("ENTER THE DATA");
		//Node<Integer> head2=insert();
		//print(head2);
		//print(merge(head, head2));
		int arr[]={4,3,5,1,2};
		//heap_sort(arr);
		//		printARR(arr);
		//duplicates(head);
		//print(head);
		//System.out.println(middle(head).data);
		//Node<Integer> head1=reverse2(head);
		//print(head1);
		//rotate(head,2);
		//kReverse(head, 2);
		//printReverse(head);
		//System.out.println(pallindrome(head));
		//System.out.println(pallindrome(head));
		//print(newReverse(head));
		//Swap(head, 3, 4);
		//Node<Integer>ptr1=position(1, head),ptr2=position(6, head);
		//swap(head, ptr1, ptr2);
		//System.out.println(ptr1.data);
		//bubbleSort(head);
		//Selection_Sort(head);
		//System.out.println(min(head).data);
		//print(swap1(head, ptr1, ptr2));
		//evenOdd(head);
		//insertionSort(head);
		//SelectionREC(head);
		//print (head);
		//print(merge_Sort(head));
		//print(append(head, 2));
		//mergeHalf(head);
	}

}
