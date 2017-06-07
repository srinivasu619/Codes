package trees;

import java.util.Scanner;

import queues.Queue;
class fsLargest<T>
{
	TreeNode<T> node;
	T largest,secondLargest;
}
//6 3 9 7 5 2 4 3 0 1 2 0 0 0        6 3 5 7 9 2 3 4 0 0 0 0 0
public class TreeUse {

	public static TreeNode<Integer> input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ROOT DATA");
		int rootData=sc.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> q1=new Queue<>();
		q1.enque(root);
		while(!q1.isEmpty())
		{
			TreeNode<Integer> current=q1.deque();
			//System.out.println("ENTER THE CURRENT NODE CHILD:");
			int noofChilds=sc.nextInt();
			for(int i=0;i<noofChilds;i++)
			{
//				System.out.println("Enter the data of the "+i+"th child");
				int currdata=sc.nextInt();
				TreeNode<Integer> currnode=new TreeNode<Integer>(currdata);
				current.children.add(currnode);
				q1.enque(currnode);
			}
		}
		return root;
	}
	public static void output(TreeNode<Integer> root)
	{

		Queue<TreeNode<Integer>> qprint=new Queue<>();
		qprint.enque(root);
		while(!qprint.isEmpty())
		{	
			TreeNode<Integer> currnode=qprint.deque();
			String print=currnode.data+":";
			for(TreeNode<Integer> node:currnode.children)
			{
				print+=node.data+",";
				qprint.enque(node);
			}
			System.out.println(print);
		}
	}
	public static int count(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int countOfNode=1;
		for(TreeNode<Integer> node:root.children)
		{
			countOfNode+=count(node);
		}
		return countOfNode;
	}
	public static int sum (TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int sumofNode=root.data;
		for(TreeNode<Integer> node:root.children)
		{
			sumofNode+=sum(node);
		}
		return sumofNode;
	}
	public static int largestNo(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int largest=root.data;
		for(TreeNode<Integer> node:root.children)
		{
			int data=largestNo(node);
			if(largest<data)
			{
				largest=data;
			}
		}
		return largest;
	}
	public static int height(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int count=1,largestH=0;
		for(TreeNode<Integer> node:root.children)
		{
			int c=height(node);
			if(c>=largestH)
			{
				largestH=c;
			}
		}
		return count+largestH;
	}
	public static int  largestthanX(TreeNode<Integer> root,int x)
	{
		if(root==null)
		{
			return 0;
		}
		int rootdata=root.data,count=0;
		for(TreeNode<Integer> node:root.children)
		{
			count+=largestthanX(node, x);
		}
		if(rootdata>x)
		{
			System.out.println(rootdata);
			count++;
		}
		return count;
	}
	/*public static int secondLargest(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int numCount=largestthanX(root, root.data);
		for(TreeNode<Integer> node:root.children)
		{
			//numCount=largestthanX(node, x);
		}
	}*/
	public static void depthNodes(TreeNode<Integer> root,int k)
	{
		if(k==0)
		{
			System.out.println(root.data+" ");
			return;
		}
		for(TreeNode<Integer> node:root.children)
		{
			depthNodes(node, k-1);
		}
		
	}
	public static Pair<Integer> larSum(TreeNode<Integer> root)
	{
		Pair<Integer> pair=new Pair<>();
		pair.treenode=root;
		int maxSum=root.data;
		for(TreeNode<Integer> node:root.children)
		{
			maxSum+=node.data;
		}
		pair.sumWithChild=maxSum;
		for(TreeNode<Integer> node:root.children)
		{
			Pair<Integer> maxChild=larSum(node);
			if(maxChild.sumWithChild>pair.sumWithChild)
			{
				pair=maxChild;
			}
		}
		return pair;
	}
	public TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
	{
		TreeNode<Integer> maxNode=root;
		int maxSum=root.data;
		for(TreeNode<Integer> node:root.children)
		{
			maxSum+=node.data;
		}
		for(TreeNode<Integer> node:root.children)
		{
			TreeNode<Integer> maxChidNode=maxSumNode(node);
			int maxChildSum=maxChidNode.data;
			for(TreeNode<Integer> temp:maxChidNode.children)
			{
				maxChildSum+=temp.data;
			}
			if(maxChildSum>maxSum)
			{
				maxSum=maxChildSum;
				maxNode=maxChidNode;
			}
		}
		return maxNode;
	}
	public static void Pre_order(TreeNode<Integer> root)
	{
		System.out.println(root.data);
		for(TreeNode<Integer> node:root.children)
		{
			Pre_order(node);
		}
	}
	public static void Post_order(TreeNode<Integer> root)
	{
		for(TreeNode<Integer> node:root.children)
		{
			Pre_order(node);
		}
		System.out.println(root.data);
	}
	public static void changingDepthInf(TreeNode<Integer> root,int depth)
	{
		if(root==null)
		{
			return;
		}
		root.data=depth;
		for(TreeNode<Integer> node:root.children)
		{
			changingDepthInf(node, depth+1);
		}
	}
	public static TreeNode<Integer> justGreaterThanX(TreeNode<Integer> root,int x)
	{
		TreeNode<Integer> currBest=null;
		if(root==null)
		{
			return null;
		}
		if(root.data>x)
		{
			currBest=root;
		}
		for(TreeNode<Integer> node:root.children)
		{
			TreeNode<Integer> Childresult=justGreaterThanX(node, x);
				if(currBest==null&&Childresult!=null)
				{
					currBest=Childresult;
				}
				else if(Childresult!=null)
				{
					if(Childresult.data<currBest.data)
					{
						currBest=Childresult;
					}
				}
		}
		return currBest;
	}
	public static boolean isSameStructure(TreeNode<Integer> root1,TreeNode<Integer> root2)
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
		if(root1.children.size()!=root2.children.size())
		{
			return false;
		}
		for(int i=0;i<root1.children.size();i++)
		{
			boolean first=isSameStructure(root1.children.get(i), root2.children.get(i));
			if(!first)
			{
				return first;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=input();
		TreeNode<Integer> root2=input();
		//output(root);
		//System.out.println(count(root));
		//System.out.println("Sum: "+sum(root));
		//System.out.println("Largest: "+largestNo(root));
		//System.out.println(height(root));
		//System.out.println("count: "+largestthanX(root, 5));
		//depthNodes(root, 2);
		//System.out.println("CHANGED");
		//changingDepthInf(root, 0);
		//output(root);
		//System.out.println(justGreaterThanX(root, 10));
		System.out.println(isSameStructure(root, root2));
	}

}
