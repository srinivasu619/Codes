package maps;

import java.util.ArrayList;

import linked_list.Node;

public class Map<K,V> {
	ArrayList<Node<MapPair<K,V>>> buckets;
	int size;
	Map()
	{
		buckets=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			buckets.add(null);
		}
	}
	public int size()
	{
		return size;
	}
	public int bucketIndex(K key)
	{
		int bindex=key.hashCode()%buckets.size();
		return bindex;	
	}
	public V get(K key)
	{
		int bindex=bucketIndex(key);
		Node<MapPair<K, V>> head=buckets.get(bindex);
		if(head==null)
		{
			return null;
		}
		else
		{
			while(head!=null)
			{
				if(head.data.key.equals(key))
				{
					return head.data.value;
				}
				head=head.next;
			}
			return null;
		}
	}
	public void put(K key,V value)
	{
		int bindex=bucketIndex(key);
		Node<MapPair<K, V>> bhead=buckets.get(bindex);
		MapPair<K, V> newPair=new MapPair<>();
		newPair.key=key;
		newPair.value=value;
		Node<MapPair<K, V>> newNode= new Node<MapPair<K,V>>(newPair);
		if(bhead==null)
		{
			size++;
			buckets.set(bindex, newNode);
		}
		else
		{
			Node<MapPair<K, V>> prev=null;
			while(bhead!=null)
			{
				if(bhead.data.key.equals(key))
				{
					bhead.data.value=value;
					return;
				}
				prev=bhead;
				bhead=bhead.next;
			}
			prev.next=newNode;
			size++;
		}
		double loadFactor=(double)(size/buckets.size());
		if(loadFactor>=0.75)
		{
			rehash();
		}
	}
	
	
	public void rehash() {
		// TODO Auto-generated method stub
		ArrayList<Node<MapPair<K, V>>> temp=buckets;
		buckets=new ArrayList<>();
		for(int i=0;i<2*temp.size();i++)
		{
			buckets.add(null);
		}
		for(Node<MapPair<K, V>> node:temp)
		{
			if(node!=null)
			{
				while(node!=null)
				{
					put(node.data.key,node.data.value);
					node=node.next;
				}
			}
		}
		
	}
	public void remove(K key)
	{
		int bindex=bucketIndex(key);
		Node<MapPair<K, V>> bhead=buckets.get(bindex);
		if(bhead==null)
		{
			return ;
		}
		else
		{
			Node<MapPair<K, V>> prev=null;
			while(bhead!=null)
			{
				if(bhead.data.key.equals(key))
				{
					if(prev==null)
					{
						bhead=bhead.next;
						buckets.set(bindex, bhead);
						
					}
					else
					{
						prev.next=bhead.next;
					}
					size--;
					return;
				}
				prev=bhead;
				bhead=bhead.next;
			}
		}
	}
}
