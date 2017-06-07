package linked_list;

public class LL extends FirstLink{
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        Node<Integer> node=head,chead=head;
        if(M==0)
        {
            for(int i=0;i<N;i++)
            {
                node=node.next;
            }
            chead=node;
        }
        else
        {
            for(int i=1;i<M;i++)
            {
                node=node.next;
            }
            for(int i=0;i<N;i++)
            {
                if(node!=null)
                {
                	Node<Integer> temp=node.next;
                    node.next=temp.next;
                    temp.next=null;
                }
            }
        }
        Node<Integer> node1=skipMdeleteN(node.next, M, N);
        chead.next=node1;
        return chead;
	}
	public static Node<Integer> swapEveryPair(Node<Integer> head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node<Integer> node=head,nextNode=head.next,phead=null,prev=null;
        while(node!=null)
        {
        	
            if(prev==null)
            {
                head.next=nextNode.next;
                nextNode.next=head;
                prev=head;
                phead=nextNode;
            }
            else if(node.next==null)
            {
                return phead;
            }
            else
            {
                node.next=nextNode.next;
                prev.next=nextNode;
                nextNode.next=node;
                prev=node;
            }
            node=prev.next;
            if(node!=null)
            	nextNode=node.next;
        }
	return phead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=insert();
		//Node<Integer> node=skipMdeleteN(head, 1, 2);
		print(head);
		Node<Integer> node=swapEveryPair(head);
		print(node);
	}

}
