package graphs;

import java.util.ArrayList;

import queues.Queue;

public class GraphUse {
	public static boolean Bipartite(Graph g)
	{
		ArrayList<Vertex> firstSet=new ArrayList<>(),secondSet=new ArrayList<>();
		for(Vertex vertex:g.vertices)
		{	boolean flag=true;
			if(firstSet.size()==0&&secondSet.size()==0)
			{
				firstSet.add(vertex);
				System.out.println("vertex in set 1: "+vertex.name);
			}
			else
			{
				for(Vertex fvertex:firstSet)
				{
					if(vertex.isAdjacent(fvertex))
					{
						System.out.println("adjecency detected");
						flag=false;
						break;
					}
				}
				if(!flag)
				{
					for(Vertex svertex:secondSet)
					{
						if(vertex.isAdjacent(svertex))
						{
							System.out.println("adjecency detected 2");
							return false;
						}
					}
					System.out.println("vertex in set 2: "+vertex.name);
					secondSet.add(vertex);
				}
				else
				{
					System.out.println("vertex in set 1: "+vertex.name);
					firstSet.add(vertex);
				}
			}
		}
		return true;
	}
	public static ArrayList<ArrayList<Vertex>> connected_comp(Graph g)
	{
		 ArrayList<Vertex> mainVertex=g.vertices;
		 //System.out.println(g.vertices.size());
		 ArrayList<ArrayList<Vertex>> main_comp=new ArrayList<>();
		 while(mainVertex.size()!=0)
		 {
			 ArrayList<Vertex> sub=new ArrayList<>(),sub1=new ArrayList<>();;
			 Vertex curr=mainVertex.get(0);
			 sub1.add(curr);
			 for(int i=1;i<mainVertex.size();i++)
			 {
				 if(!g.havePath(curr.name, mainVertex.get(i).name))
				 {
					 sub.add(mainVertex.get(i));
				 }
				 else
				 {
					 sub1.add(mainVertex.get(i));
				 }
			 }
			 main_comp.add(sub1);
			 mainVertex=sub;
			 //System.out.println(g.vertices.size());
		 }
		 return main_comp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addEdge("A", "C");
		g.addEdge("D", "B");
		g.addEdge("A", "D");
		//g.addEdge("A", "B");
		g.addVertex("E");
		g.addVertex("F");
		g.addEdge("E", "F");
		g.addVertex("G");
		g.print();
		//System.out.println(g.havePath("A", "B"));
		//System.out.println(g.havePath1("A", "B"));
		//g.addVertex("E");
		//System.out.println(g.havePath1("A", "E"));
		//System.out.println(Bipartite(g));
		ArrayList<ArrayList<Vertex>> res=connected_comp(g);
		for(ArrayList<Vertex> arr: res)
		{
			for(Vertex vertex:arr)
			{
				System.out.print(vertex.name+" ");
			}
			System.out.println();
		}
	}

}
