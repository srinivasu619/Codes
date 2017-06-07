package linked_list;

public class LLunanswered extends FirstLink{

	public static void SelectionSort(Node<Integer> node)
	{
		Node<Integer> chead=node,min,prevmin,prevhead=null,head=node;
		int n=length(node);
		for(int i=0;i<n-1;i++)
		{
			Node<Integer>cnode=chead.next,prevnode=chead;
			prevmin=prevhead;
			min=chead;
			int mindata=chead.data;
			while(cnode!=null)
			{
				if(cnode.data<mindata)
				{
					min=cnode;
					prevmin=prevnode;
				}
				prevnode=cnode;
				cnode=cnode.next;
			}
			if(min!=chead)
			{
				//System.out.println("true");
				Node<Integer> minnext=min.next;
				if(prevhead==null)
				{
					if(prevmin==chead)
					{
						 chead.next=minnext;
						 min.next=chead;
						 chead=min;
						 head=chead;
					}
					else
					{
						//System.out.println("FIRST");
						min.next=chead.next;
						chead.next=minnext;
						prevmin.next=chead;
						head=chead=min;
						//print(chead);
					}
				}
				else
				{
					if(prevmin==chead)
					{
						prevhead.next=min;
						chead.next=minnext;
						min.next=chead;
						chead=min;
					}
					else
					{
						min.next=chead.next;
						chead.next=minnext;
						prevmin.next=chead;
						prevhead.next=min;
						chead=min;
					}
				}
				prevhead=chead;
				chead=chead.next;
			}
			print(head);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=insert();
		print(head);
		SelectionSort(head);
	}

}
