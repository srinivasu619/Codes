package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import linked_list.Node;
import queues.Queue;
import stacks.Stack;
//2 6 9 5 4 -1 3 -1 -1 -1 -1 -1 -1 
//6 2 12 1 5 10 18 -1 -1 -1 -1 -1 -1 -1 -1
//7 4 9 3 12 8 10 -1 -1 -1 -1 -1 -1 -1 -1
//8 2 3 7 5 9 11 -1 -1 -1 -1 -1 -1 -1 -1
//8 5 10 2 6 9 11 1 4 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
//10 6 15 -1 8 13 18 7 9 12 -1 -1 -1 -1 -1 -1 -1 -1 -1
//2 1 3 -1 -1 -1 -1 
class HeightPair<T>
{
	BinaryTreeNode<T> node;
	int height;
	int Diameter;
}
class PairLARGE<T>
{
	BinaryTreeNode<T> node;
	int largest;
	int smallest;
	boolean isBst;
}
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> input()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Root Data");
		int rootData=sc.nextInt();
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingNodes=new Queue<>();
		pendingNodes.enque(root);
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> currNode=pendingNodes.deque();
			//System.out.println("Enter the Left Child Data of "+currNode.data);
			int leftdata=sc.nextInt();
			if(leftdata!=-1)
			{
				BinaryTreeNode<Integer> leftNode=new BinaryTreeNode<Integer>(leftdata);
				currNode.left=leftNode;
				pendingNodes.enque(leftNode);
			}
			//System.out.println("Enter the Left Child Data of "+currNode.data);
			int rightdata=sc.nextInt();
			if(rightdata!=-1)
			{
				BinaryTreeNode<Integer> rightNode=new BinaryTreeNode<Integer>(rightdata);
				currNode.right=rightNode;
				pendingNodes.enque(rightNode);
			}
		}
		return root;
	}
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		String print=root.data+":";
		if(root.left!=null)
		{
			print+=root.left.data+",";
		}
		if(root.right!=null)
		{
			print+=root.right.data;
		}
		System.out.println(print);
		print(root.left);
		print(root.right);
	}
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int count=1;
		int left=height(root.left);
		int right=height(root.right);
		return left>=right?count+left:count+right;
	}
	public static BinaryTreeNode<Integer> findANode(BinaryTreeNode<Integer> root,int data)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==data)
		{
			return root;
		}
		BinaryTreeNode<Integer> left=findANode(root.left, data);
		if(left!=null)
		{
			return left;
		}
		BinaryTreeNode<Integer> right=findANode(root.right, data);
		if(right!=null)
		{
			return right;
		}
		return null;
	}
	public static int getLevelUtil(BinaryTreeNode<Integer> node, int data, int level) 
    {	
        if (node == null)
            return 0;
  
        if (node.data == data)
            return level;
  
        int downlevel = getLevelUtil(node.left, data, level + 1);
        if (downlevel != 0)
            return downlevel;
  
        downlevel = getLevelUtil(node.right, data, level + 1);
        return downlevel;
    }
	public static void mirror(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
		mirror(root.left);
		mirror(root.right);
	}
	public static void levelOrderPrint(BinaryTreeNode<Integer> root)
	{
		Queue<BinaryTreeNode<Integer>> qprint=new Queue<>();
		qprint.enque(root);
		System.out.println(root.data);
		while(!qprint.isEmpty())
		{
			BinaryTreeNode<Integer> currNode=qprint.deque();
			//String print=currNode.data;
			if(currNode.left!=null)
			{
				//print+=currNode.left.data+",";
				System.out.print(currNode.left.data+" ");
				qprint.enque(currNode.left);
			}
			if(currNode.right!=null)
			{
				//print+=currNode.right.data;
				System.out.print(currNode.right.data);
				qprint.enque(currNode.right);
			}
			//System.out.println(currNode.data);
			System.out.println();
		}
	}
	public static void levelOrderPrint1(BinaryTreeNode<Integer> root)
	{
		LinkedList<BinaryTreeNode<Integer>> qprint=new LinkedList<>();
		Stack<BinaryTreeNode<Integer>> qstack=new Stack<>();
		qprint.addLast(root);
		System.out.println(root.data);
		while(!qprint.isEmpty())
		{
			BinaryTreeNode<Integer> currNode=qprint.removeFirst();
			//System.out.println(currNode.data);
			qstack.push(currNode);
			//String print=currNode.data;
			if(currNode.right!=null)
			{
				//print+=currNode.right.data;
				//System.out.print(currNode.right.data);
				qprint.addLast(currNode.right);
			}
			if(currNode.left!=null)
			{
				//print+=currNode.left.data+",";
				//System.out.print(currNode.left.data+" ");
				qprint.addLast(currNode.left);
			}
			
			//System.out.println();
		}
		while(!qstack.isEmpty())
		{
			System.out.print(qstack.pop().data+" ");
		}
	}
	public static int diameter(BinaryTreeNode<Integer> root)
	{
		int max=1;
		if(root==null)
			return 0;
		int leftheight=height(root.left);
		int rightHeight=height(root.right);
		max+=leftheight+rightHeight;
		int leftHeightSub=diameter(root.left);
		int righHeightSub=diameter(root.right);
		if(max>leftHeightSub&&max>righHeightSub)
		{
			return max;
		}
		else if(max<leftHeightSub&&righHeightSub<leftHeightSub)
		{
			max=leftHeightSub;
			return max;
		}
		else
		{
			return righHeightSub;
		}

	}
	public static HeightPair<Integer> diameter2(BinaryTreeNode<Integer> root)
	{
		if(root==null){
			return new HeightPair<Integer>();
		}
		HeightPair<Integer> left=diameter2(root.left);
		HeightPair<Integer> right=diameter2(root.right);
		HeightPair<Integer> ans=new HeightPair<>();
		ans.height=Math.max(left.height, right.height)+1;
		ans.Diameter=Math.max(left.height+right.height+1,Math.max(left.Diameter, right.Diameter));
		return ans;
	}
	public static void printLeafNodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null&&root.right==null)
		{
			System.out.println(root.data);
			return;
		}
		printLeafNodes(root.left);
		printLeafNodes(root.right);
	}
	public static BinaryTreeNode<Integer> deleteAllLeaves(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		BinaryTreeNode<Integer> leftnode=deleteAllLeaves(root.left);
		BinaryTreeNode<Integer> rightnode=deleteAllLeaves(root.right);
		if(leftnode==null&&rightnode==null)
		{
			root=null;
		}
		return root;
	}
	public static boolean balanced(BinaryTreeNode<Integer> root)
	{
		int leftheight=height(root.left)-1;
		int rightheight=height(root.right)-1;
		if(Math.abs(leftheight-rightheight)>1)
			return false;
		return true;
	}
	public static void noSibling(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null||root.right==null)
		{
			System.out.println(root.data+" ");
		}
		noSibling(root.left);
		noSibling(root.right);
	}
	public static void Zig_ZagOrderTraversal(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack<BinaryTreeNode<Integer>> even=new Stack<>();
		Queue<BinaryTreeNode<Integer>> odd=new Queue<>();
		even.push(root);
		int count=0;
		while(!even.isEmpty()||!odd.isEmpty())
		{
			if(count%2==0)
			{
				//System.out.print("THE LEVEL "+count+"th: ");
				while(!even.isEmpty())
				{
					BinaryTreeNode<Integer> node=even.pop();
					if(node.left!=null)
						odd.enque(node.left);
					if(node.right!=null)
						odd.enque(node.right);
					System.out.print(node.data+" ");
				}
				System.out.println();
				count++;
			}
			else
			{
				//System.out.print("THE LEVEL "+count+"th: ");
				while(!odd.isEmpty())
				{
					BinaryTreeNode<Integer> node=odd.deque();
					if(node.left!=null)
						even.push(node.left);
					if(node.right!=null)
						even.push(node.right);
					System.out.print(node.data+" ");
				}
				System.out.println();
				count++;
			}
		}
	}
	public static ArrayList<Node<Integer>> levelWise(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return new ArrayList<>(); 
		}
		Queue<BinaryTreeNode<Integer>> qprint=new Queue<>(),qprintChild=new Queue<>();
		ArrayList<Node<Integer>> finalArrayList=new ArrayList<>();
		qprint.enque(root);
		int count=0;
		while(!qprint.isEmpty()||!qprintChild.isEmpty())
		{
				int qlength=qprint.size();
				for(int i=0;i<qlength;i++)
				{
					if(i==0)
					{
						BinaryTreeNode<Integer> node=qprint.deque();
						if(node.left!=null)
							qprintChild.enque(node.left);
						if(node.right!=null)
							qprintChild.enque(node.right);
						Node<Integer> temp=new Node<Integer>(node.data);
						finalArrayList.add(temp);
					}
					else
					{
						BinaryTreeNode<Integer> node=qprint.deque();
						if(node.left!=null)
							qprintChild.enque(node.left);
						if(node.right!=null)
							qprintChild.enque(node.right);
						
						Node<Integer> temp=new Node<Integer>(node.data),temp2;
						temp2=finalArrayList.get(count);
						while(temp2.next!=null)
						{
							temp2=temp2.next;
						}
						temp2.next=temp;
					}
				}
				while(!qprintChild.isEmpty())
				{
					qprint.enque(qprintChild.deque());
				}
				count++;
			}
		return finalArrayList;
	}
	/*public static boolean checkStructure(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2)
	{
		if(root1==null||root2==null)
		{
			return false;
		}
		if(root1.data!=root2.data)
		{
			return false;
		}
		if(height(root1)!=height(root2))
		{
			return false;
		}
		if(root1.left==null||root2.)
	}*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> levelWise1(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return new ArrayList<>(); 
		}
		Queue<BinaryTreeNode<Integer>> qprint=new Queue<>(),qprintChild=new Queue<>();
		ArrayList<Node<BinaryTreeNode<Integer>>> finalArrayList=new ArrayList<>();
		qprint.enque(root);
		int count=0;
		while(!qprint.isEmpty()||!qprintChild.isEmpty())
		{
				int qlength=qprint.size();
				for(int i=0;i<qlength;i++)
				{
					if(i==0)
					{
						BinaryTreeNode<Integer> node=qprint.deque();
						if(node.left!=null)
							qprintChild.enque(node.left);
						if(node.right!=null)
							qprintChild.enque(node.right);
						Node<BinaryTreeNode<Integer>> temp=new Node<>(node);
						finalArrayList.add(temp);
					}
					else
					{
						BinaryTreeNode<Integer> node=qprint.deque();
						if(node.left!=null)
							qprintChild.enque(node.left);
						if(node.right!=null)
							qprintChild.enque(node.right);
						
						Node<BinaryTreeNode<Integer>>temp=new Node<>(node),temp2;
						temp2=finalArrayList.get(count);
						while(temp2.next!=null)
						{
							temp2=temp2.next;
						}
						temp2.next=temp;
					}
				}
				while(!qprintChild.isEmpty())
				{
					qprint.enque(qprintChild.deque());
				}
				count++;
			}
		return finalArrayList;
	}
	public static BinaryTreeNode<Integer> leaf(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.left==null&&root.right==null)
		{
			return null;
		}
		if(root.left.left==null&&root.left.right==null)
		{
			root.left=null;
		}
		return root;
	}
	public static int binary_search(int A[],int start,int end,int ele)
	{
		if(start<=end)
		{
			int mid=start+(end-start)/2;
			if(A[mid]==ele)
				return mid;
			else if(A[mid]>ele)
				return binary_search(A, start, mid-1, ele);
			else
				return binary_search(A, mid+1, end, ele);
		}
		return -1;
	}
	public static BinaryTreeNode<Integer> makingTree1(int pre[],int in[],int startpre,int endpre,int startin,int endin)
	{
		if (startin>endin||startpre>endpre) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(pre[startpre]);
		int index=find(in, startin, endin, pre[startpre]);
		root.left=makingTree1(pre, in, startpre+1, startpre+1+(index-startin-1), startin, index-1);
		root.right=makingTree1(pre, in, startpre+1+(index-startin), endpre, index+1, endin);
		return root;
	}
	public static int find(int arr[],int start,int end,int ele)
	{
		for(int i=start;i<=end;i++)
		{
			if(arr[i]==ele){
				return i;
			}
		}
		return -1;
	}
	public static BinaryTreeNode<Integer> makingTree2(int post[],int in[],int startpost,int endpost,int startin,int endin)
	{
		if (startin>endin||startpost>endpost) {
			return null;
}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(post[endpost]);
		int index=find(in, startin, endin, post[endpost]);
		root.left=makingTree2(post, in, startpost, startpost+(index-(startin+1)), startin,index-1);
		root.right=makingTree2(post, in, startpost+(index-startin), endpost-1, index+1, endin);
		return root;
	}
	public static void printZiGZAG(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack<BinaryTreeNode<Integer>> odd=new Stack<>();
		Stack<BinaryTreeNode<Integer>> even=new Stack<>();
		odd.push(root);
		int count=1;
		while(!(odd.isEmpty()&&even.isEmpty()))
		{
			if(count%2==0)
			{
				while(!even.isEmpty())
				{
					BinaryTreeNode<Integer> node=even.pop();
					if(node.right!=null)
						odd.push(node.right);
					if(node.left!=null)
						odd.push(node.left);
					
					System.out.print(node.data+" ");
				}
				System.out.println();
				count++;
			}
			else
			{
				while(!odd.isEmpty())
				{
					BinaryTreeNode<Integer> node=odd.pop();
					if(node.left!=null)
						even.push(node.left);
					if(node.right!=null)
						even.push(node.right);
					System.out.print(node.data+" ");
				}
				System.out.println();
				count++;
			}
		}
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		// Write your code here
		Queue<BinaryTreeNode<Integer>> qprint=new Queue<>();
		qprint.enque(root);
		int count=1,curr=1;
		while(!qprint.isEmpty())
		{
			count=curr;
			curr=0;
			for(int i=0;i<count;i++)
			{	
				BinaryTreeNode<Integer> node=qprint.deque();
				if(node.left!=null)
				{
					qprint.enque(node.left);
					curr++;
				}
				if(node.right!=null)
				{
					qprint.enque(node.right);
					curr++;
				}
				System.out.print(node.data+" ");
			}
			System.out.println();
		}
	}
	public static void printL(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Queue<BinaryTreeNode<Integer>> qprint=new Queue<>();
		qprint.enque(root);
		while(!qprint.isEmpty())
		{
			Queue<BinaryTreeNode<Integer>> childe=new Queue<>();
			while(!qprint.isEmpty())
			{
				BinaryTreeNode<Integer> node=qprint.deque();
				System.out.print(node.data+" ");
				if(node.left!=null)
				{
					childe.enque(node.left);
				}
				if(node.right!=null)
				{
					childe.enque(node.right);
				}
			}
			System.out.println();
			while(!childe.isEmpty())
			{
				qprint.enque(childe.deque());
			}
		}
	}
	public static void printSibling(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		if(root.left==null&&root.right!=null)
		{
			System.out.println(root.right.data);
		}
		if(root.left!=null&&root.right==null)
		{
			System.out.println(root.left.data);
			}
		printSibling(root.left);
		printSibling(root.right);
	}
	public static BinaryTreeNode<Integer> leafDel(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.left==null&&
				root.right==null)
		{
			return null;
		}
		root.left=leafDel(root.left);
		root.right=leafDel(root.right);
		return root;
	}
	public static void printRangeElements(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		if(root==null)
		{
			return;
		}
		if(root.data<k1)
		{
			printRangeElements(root.right, k1, k2);
		}
		else if(root.data>k2)
		{
			printRangeElements(root.left, k1, k2);
		}
		else
		{
			if(root.data>k1&&root.data<k2)
			{
				System.out.println(root.data);
			}
			printRangeElements(root.left, k1, k2);
			printRangeElements(root.right, k1, k2);
			
		}
		
	}
	public static BinaryTreeNode<Integer> findANode1(BinaryTreeNode<Integer> root,int inf)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==inf)
		{
			return root;
		}
		else if(root.data>inf)
		{
			return findANode1(root.left, inf);
		}
		else
		{
			return findANode1(root.right, inf);
		}
	}
	public static int large(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data.intValue(), Math.max(large(root.left), large(root.right)));
	}
	public static int small(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data.intValue(), Math.max(small(root.left), small(root.right)));
	}
	public static boolean checkBST(BinaryTreeNode<Integer> Node)
	{
		if(Node==null)
			return true;
		boolean left=checkBST(Node.left);
		if(!left)
			return left;
		boolean right=checkBST(Node.right);
		if(!right)
			return right;
		int leftL=large(Node.left);
		int rightS=small(Node.right);
		if(Node.data.intValue()>leftL&&Node.data.intValue()<rightS)
		{
			return true;
		}
		return false;
	}
	public static boolean checkBST1(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		if(root==null)
		{
			return true;
		}
		if(!(root.data>k1&&root.data<k2))
		{
			return false;
		}
		boolean leftDEC=checkBST1(root.left, k1, root.data);
		if(!leftDEC)
			return false;
		boolean rightDEC=checkBST1(root.right,root.data,k2);
		if(!rightDEC)
			return false;
		return true;
	}
	public static ArrayList<BinaryTreeNode<Integer>> path(BinaryTreeNode<Integer> root,int ele)
	{
		if(root.data==ele)
		{
			ArrayList<BinaryTreeNode<Integer>> Ar=new ArrayList<>();
			Ar.add(root);
			return Ar;
		}
		BinaryTreeNode<Integer> LEFTnode=findANode1(root.left, ele);
		BinaryTreeNode<Integer> RIGHTnode=findANode1(root.right, ele);
		ArrayList<BinaryTreeNode<Integer>> sub;
		if(LEFTnode==null&&RIGHTnode!=null)
		{
			sub=path(root.right, ele);
		}
		else if(RIGHTnode==null&&LEFTnode!=null)
		{
			sub=path(root.left, ele);
		}
		else
		{
			return new ArrayList<BinaryTreeNode<Integer>>();
		}
		sub.add(0, root);
		return sub;
	}
	public static Node<Integer> SortedLinkedList(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		Node<Integer> head=new Node<Integer>(root.data),chead=null;
		Node<Integer> leftHead=SortedLinkedList(root.left);
		Node<Integer> righthead=SortedLinkedList(root.right);
		if(leftHead==null&&righthead!=null)
		{
			head.next=righthead;
			chead=head;
		}
		else if(leftHead!=null&&righthead==null)
		{
			Node<Integer> temp=leftHead;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=head;
			chead=leftHead;
		}
		else if(leftHead!=null&&righthead!=null)
		{
			Node<Integer> temp=leftHead;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=head;
			head.next=righthead;
			chead=leftHead;
		}
		else
		{
			chead=head;
		}
		return chead;
	}
	public static  BinaryTreeNode<Integer> makingTree3(int in[],int startin,int endin)
	{
		if(startin>endin)
		{
			return null;
		}
		int rootIndex=(endin+startin)/2;
		//System.out.println(rootIndex);
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(in[rootIndex]);
		root.left=makingTree3(in, startin, rootIndex-1);
		root.right=makingTree3(in, rootIndex+1, endin);
		return root;
	}
	public static BinaryTreeNode<Integer> LCA(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==k1||root.data==k2)
		{
			return root;
		}
		BinaryTreeNode<Integer> leftNode=LCA(root.left, k1, k2);
		BinaryTreeNode<Integer> rightNode=LCA(root.right, k1, k2);
		if(leftNode!=null&&rightNode==null)
		{
			return leftNode;
		}
		else if(leftNode==null&&rightNode!=null)
		{
			return rightNode;
		}
		else if(leftNode!=null&&rightNode!=null)
		{
			return root;
		}
		else
		{
			return null;
		}
	}
	public static BinaryTreeNode<Integer> LCABST(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==k1||root.data==k2)
		{
			return root;
		}
		if(root.data<k1&&root.data<k2)
		{
			BinaryTreeNode<Integer> node=LCABST(root.right, k1, k2);
			return node;
		}
		else if(root.data>k1&&root.data>k2)
		{
			BinaryTreeNode<Integer> node=LCABST(root.left, k1, k2);
			return node;
		}
		else
		{
			return root;
		}
	}
	public static void doubleTree(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=node;
		node.left=temp;
		doubleTree(temp);
		doubleTree(root.right);
		
	}
	public static BinaryTreeNode<Integer> rootGive(BinaryTreeNode<Integer> root,int p)
	{
		if(root==null)
		{
			return null;
		}
		/*if(root.left.data==p||root.right.data==p)
		{
			return root;
		}*/
		if(root.left!=null&&root.right!=null)
		{
			if(root.left.data==p||root.right.data==p)
			{
				return root;
			}
		}
		if(root.left!=null)
		{
			if(root.left.data==p)
			{
				return root;
			}
		}
		if(root.right!=null)
		{
			if(root.right.data==p)
			{
				return root;
			}
		}
		BinaryTreeNode<Integer> leftRes=rootGive(root.left, p);
		BinaryTreeNode<Integer> rightRes=rootGive(root.right, p);
		if(leftRes!=null)
		{
			return leftRes;
		}
		else
		{
			return rightRes;
		}
	}
	public static int distance(BinaryTreeNode<Integer> root,int ele)
	{
		if(root==null)
		{
			return 0;
		}
		BinaryTreeNode<Integer> LEFTnode=findANode1(root.left, ele);
		BinaryTreeNode<Integer> RIGHTnode=findANode1(root.right, ele);
		if(LEFTnode==null&&RIGHTnode!=null)
		{
			return 1+distance(root.right, ele);
		}
		else if(LEFTnode!=null&&RIGHTnode==null)
		{
			return 1+distance(root.left, ele);
		}
		else
		{
			return 0;
		}
		
	}
	public static boolean checkCousins(BinaryTreeNode<Integer> root,int p,int q)
	{
		if(root==null)
		{
			return false;
		}
		int firstSize=getLevelUtil(root, p, 0);
		int SecondSize=getLevelUtil(root, q, 0);
		System.out.println(firstSize);
		System.out.println(SecondSize);
		if(firstSize!=SecondSize)
		{
			//System.out.println("WRONG LEN");
			return false;
		}
		int firstroot=rootGive(root, p).data;
		int Secroot=rootGive(root, q).data;
		if(firstroot==Secroot)
		{
			//System.out.println("SAME PARENT");
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=input();
		//print(root);
		//System.out.println(height(bnode));
		/*BinaryTreeNode<Integer> val=findANode(bnode, 15);
		if(val!=null)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");*/
		//mirror(bnode);
		//print(bnode);
		//levelOrderPrint(root);
		//System.out.println(diameter(bnode));
		//	System.out.println("LEAF NODES");
		//printLeafNodes(bnode);
		/*System.out.println("AFTER DELETION");
		BinaryTreeNode<Integer>node=deleteAllLeaves(root);
		print(node);*/
		//System.out.println(balanced(root));
		//System.out.println("NO SIBLING NODES");
		//noSibling(root);
		//Zig_ZagOrderTraversal(root);
		/*ArrayList<Node<BinaryTreeNode<Integer>>> rec=levelWise1(root);
		int count=0;
		for(Node<BinaryTreeNode<Integer>> node: rec)
		{
			Node<BinaryTreeNode<Integer>> temp=node;
			System.out.print("THE LEVEL "+count+"th:");
			while(temp!=null)
			{
				System.out.print(temp.data.data+" ");
				temp=temp.next;
			}
			System.out.println();
			count++;
		}*/
		//BinaryTreeNode<Integer> node=leaf(root);
		//print(node);
		//int pre[]={1 ,2, 3, 4, 15, 5, 6, 7, 8,10 ,9 ,12},in[]={4 ,15, 3, 2, 5, 1, 6, 10, 8, 7, 9, 12};
		/*//int[] in= { 4, 2, 5, 1, 6, 3, 7 };
		1 2 3 4 15 5 6 7 8 10 9 12
4 ,15, 3, 2, 5, 1, 6, 10, 8, 7, 9, 12
		int[] post = { 4, 5, 2, 6, 7, 3, 1 };*/
		//BinaryTreeNode<Integer>node=makingTree1(pre, in, 0, pre.length-1, 0, in.length);
		//BinaryTreeNode<Integer> node=makingTree2(post, in, 0,post.length-1,0,in.length-1);
		//print(node);
		//printZiGZAG(root);
		//printLevelWise(root);
		//printSibling(root);
		//print(leafDel(root));
		//printL(root);
		//printRangeElements(root, 7, 20);
		//System.out.println(checkBST(root));
		//System.out.println(checkBST1(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		/*ArrayList<BinaryTreeNode<Integer>> finalArr=path(root, 5);
		System.out.println("1.SIZE"+finalArr.size());
		for(BinaryTreeNode<Integer> node:finalArr)
		{
			System.out.print(node.data+" ");
		}
		System.out.println();
		finalArr=path(root, 3);
		System.out.println("1.SIZE"+finalArr.size());
		for(BinaryTreeNode<Integer> node:finalArr)
		{
			System.out.print(node.data+" ");
		}
		System.out.println();
		finalArr=path(root, 8);
		System.out.println("1.SIZE"+finalArr.size());
		for(BinaryTreeNode<Integer> node:finalArr)
		{
			System.out.print(node.data+" ");
		}
		System.out.println();
		finalArr=path(root, 11);
		System.out.println("1.SIZE"+finalArr.size());
		for(BinaryTreeNode<Integer> node:finalArr)
		{
			System.out.print(node.data+" ");
		}
		System.out.println();
		finalArr=path(root, 20);
		System.out.println("1.SIZE"+finalArr.size());
		for(BinaryTreeNode<Integer> node:finalArr)
		{
			System.out.print(node.data+" ");
		}*/
		/*Node<Integer> node=SortedLinkedList(root);
		System.out.println();
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		int in[]={1,2,3,4,5,6,8,9,10,11};
		print(makingTree3(in, 0, in.length-1));*/
		/*BinaryTreeNode<Integer> node=LCABST(root, 9, 12);
		//System.out.println(node.data);
		node=LCABST(root, 8, 9);
		System.out.println(node.data);
		node=LCABST(root, 13, 18);
		System.out.println(node.data);*/
		//doubleTree(root);
		//print(root);
		//System.out.println(checkCousins(root, 3, 5));
		levelOrderPrint1(root);
	}

}
