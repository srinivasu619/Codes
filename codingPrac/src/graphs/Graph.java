package graphs;

import java.util.ArrayList;
import java.util.HashMap;

import queues.Queue;

public class Graph {

	ArrayList<Vertex> vertices;
	
	public Graph() {
		vertices = new ArrayList<>();
	}
	
	public void print(){
		for(Vertex v : vertices){
			v.print();
		}
	}
	
	public void addVertex(String name){
		if(isVertexPresent(name)){
			return;
		}
		Vertex v = new Vertex(name);
		vertices.add(v);
	}
	
	public void addEdge(String name1, String name2){
		if(!isVertexPresent(name1) || !isVertexPresent(name2)){
			// Exception
			return;
		}
		Vertex first = getVertex(name1);
		Vertex second = getVertex(name2);
		if(areAdjacent(first, second)){
			return;
		}
		Edge e = new Edge(first, second);
		first.addEdge(e);
		second.addEdge(e);
	}

	public void removeEdge(String name1, String name2){
		Vertex first = getVertex(name1);
		Vertex second = getVertex(name2);
		if(first == null || second == null){
			return;
		}
		if(! areAdjacent(first, second)){
			return;
		}
		first.removeEdgeWith(second);
		second.removeEdgeWith(first);
	}
	
	public void removeVertex(String name){
		Vertex v = getVertex(name);
		if(v == null){
			return;
		}
		
		ArrayList<Vertex> adjacentVertices = v.getAdjacentVertices();
		for(Vertex adj : adjacentVertices){
			adj.removeEdgeWith(v);
		}
		vertices.remove(v);
	}
	
	private boolean areAdjacent(Vertex first, Vertex second) {
		if(first.edges.size() < second.edges.size()){
			return first.isAdjacent(second);
		}else{
			return second.isAdjacent(first);
		}
	}

	private Vertex getVertex(String name) {
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return v;
			}
		}
		return null;
	}

	private boolean isVertexPresent(String name) {
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return true;
			}
		}
		return false;
	}
	public boolean havePath(String name1,String name2)
	{
		Vertex first=getVertex(name1);
		Vertex sec=getVertex(name2);
		if(first==null||sec==null)
		{
			return false;
		}
		HashMap<Vertex, Boolean> visited=new HashMap<>();
		visited.put(first, true);
		return pathBool(first, sec,visited);
	}
	public boolean pathBool(Vertex v1,Vertex v2,HashMap<Vertex, Boolean> visited)
	{
		if(v1.isAdjacent(v2))
		{
			return true;
		}
		//visited.put(v1, true);
		ArrayList<Vertex> adjecent=v1.getAdjacentVertices();
		for(Vertex adj:adjecent)
		{
			if(!visited.containsKey(adj))
			{
				visited.put(adj, true);
				if(pathBool(adj, v2, visited))
				{
					return true;
				}
			}
		}
		return false;
	}
	public boolean havePath1(String name1,String name2)
	{
		Vertex first=getVertex(name1);
		Vertex sec=getVertex(name2);
		if(first==null||sec==null)
		{
			return false;
		}
		HashMap<Vertex, Boolean> visited=new HashMap<>();
		visited.put(first, true);
		Queue<Vertex> queue=new Queue<>();
		queue.enque(first);
		while(!queue.isEmpty())
		{
			Vertex current=queue.deque();
			if(current.isAdjacent(sec))
			{
				return true;
			}
			ArrayList<Vertex> adjV=current.getAdjacentVertices();
			for(Vertex adj:adjV)
			{
				if(!visited.containsKey(adj))
				{
					visited.put(adj, true);
					queue.enque(adj);
				}
			}
		}
		return pathBool(first, sec,visited);
	}
	
}
