package trees;

import java.util.Scanner;

import queues.Queue;

public class BinaryTreeUse2 {
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
	//1 2 3 -1 5 6 7 -1 -1 -1 -1 -1 -1 
	public static void levelOrderTraversal(BinaryTreeNode<Integer> root)
	{
		Queue<BinaryTreeNode<Integer>> qparent=new Queue<>(),qchild=new Queue<>();
		qparent.enque(root);
		int level=0;
		while(!qparent.isEmpty()||!qchild.isEmpty())
		{
			int levelNode=0;
			while(!qparent.isEmpty())
			{
				BinaryTreeNode<Integer> currNode=qparent.deque();
				if(currNode.left!=null)
				{
					//print+=currNode.left.data+",";
					//System.out.print(currNode.left.data+" ");
					qchild.enque(currNode.left);
				}
				if(currNode.right!=null)
				{
					//print+=currNode.right.data;
					//System.out.print(currNode.right.data);
					qchild.enque(currNode.right);
				}
				//System.out.print(currNode.data+" ");
				levelNode++;
			}
			System.out.println("LEVEL "+level+" NODES: "+levelNode);
			Queue<BinaryTreeNode<Integer>> temp=qparent;
			qparent=qchild;
			qchild=temp;
			//System.out.println();
			level++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> node=input();
		print(node);
		levelOrderTraversal(node);
	}

}
