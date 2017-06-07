package priorityQueue;

import java.util.ArrayList;

public class PQ<T> {
	ArrayList<PQNode<T>> heap;
	public PQ() {
		// TODO Auto-generated constructor stub
		heap=new ArrayList<>();
	}
	public int size()
	{
		return heap.size();
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public PQNode<T> ele()
	{
		if(size()==0)
		{
			return null;
		}
		return heap.get(0);
	}
	public void insertMAX(T data,int p)
	{
		PQNode<T> node=new PQNode<>(data,p);
		heap.add(node);
		int childIndex=size()-1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0)
		{
			PQNode<T> parentNode=heap.get(parentIndex);
			PQNode<T> childNode=heap.get(childIndex);
			if(parentNode.priority<childNode.priority)
			{
				heap.set(parentIndex, childNode);
				heap.set(childIndex, parentNode);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else
			{
				return;
			}
		}
	}
	public void insertMIN(T data,int p)
	{
		PQNode<T> node=new PQNode<>(data,p);
		heap.add(node);
		int childIndex=size()-1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0)
		{
			PQNode<T> parentNode=heap.get(parentIndex);
			PQNode<T> childNode=heap.get(childIndex);
			if(parentNode.priority>childNode.priority)
			{
				heap.set(parentIndex, childNode);
				heap.set(childIndex, parentNode);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else
			{
				return;
			}
		}
	}
	public T removeMAX()
	{
		if(size()==0)
		{
			return null;
		}
		T temp=heap.get(0).data;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		if(heap.size()!=0)
		{
			heapifyMAX(0);
		}
		return temp;
	}
	private void heapifyMAX(int index) {
		// TODO Auto-generated method stub
		int leftIndex=2*index+1;
		int rightIndex=2*index+2;
		if(leftIndex>size()-1&&rightIndex>size()-1)
		{
			return;
		}
		int maxIndex=index;
		if(heap.get(maxIndex).priority<heap.get(leftIndex).priority)
		{
			maxIndex=leftIndex;
		}
		if((rightIndex<(size()-1)&&(heap.get(maxIndex).priority<heap.get(rightIndex).priority)))
		{
			maxIndex=rightIndex;
		}
		if(maxIndex==index)
		{
			return;
		}
		PQNode<T> temp=heap.get(maxIndex);
		heap.set(maxIndex, heap.get(index));
		heap.set(index, temp);
		heapifyMAX(maxIndex);
	}
	public T removeMIN()
	{
		if(size()==0)
		{
			return null;
		}
		T temp=heap.get(0).data;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		if(heap.size()!=0)
		{
			heapifyMIN(0);
		}
		return temp;
	}
	private void heapifyMIN(int index) {
		int leftIndex=2*index+1;
		int rightIndex=2*index+2;
		if(leftIndex>size()-1&&rightIndex>size()-1)
		{
			return;
		}
		int minIndex=index;
		if(heap.get(minIndex).priority>heap.get(leftIndex).priority)
		{
			minIndex=leftIndex;
		}
		if((rightIndex<(size()-1)&&(heap.get(minIndex).priority>heap.get(rightIndex).priority)))
		{
			minIndex=rightIndex;
		}
		if(minIndex==index)
		{
			return;
		}
		PQNode<T> temp=heap.get(minIndex);
		heap.set(minIndex, heap.get(index));
		heap.set(index, temp);
		heapifyMIN(minIndex);
		
	}
}
