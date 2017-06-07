package graphs;

import java.util.ArrayList;

public class Vertex {
	
	String name;
	ArrayList<Edge> edges;
	
	Vertex(String name){
		this.name = name;
		edges = new ArrayList<>();
	}

	public void addEdge(Edge e) {
		edges.add(e);
	}

	public boolean isAdjacent(Vertex second) {
		for(Edge e : edges){
			if(e.first == second || e.second == second){
				return true;
			}
		}
		return false;
	}

	public void removeEdgeWith(Vertex second) {
		for(int i = 0; i < edges.size(); i++){
			Edge e = edges.get(i);
			if(e.first == second || e.second == second){
				edges.remove(i);
				break;
			}
		}
	}

	public ArrayList<Vertex> getAdjacentVertices() {
		ArrayList<Vertex> adjacentVertices = new ArrayList<>();
		for(Edge e : edges){
			if(e.first == this ){
				adjacentVertices.add(e.second);
			}else if(e.second == this){
				adjacentVertices.add(e.first);
			}
		}
		return adjacentVertices;
	}

	public void print() {
		String toBePrinted = this.name +" : ";
		for(Edge e : edges){
			if(e.first == this ){
				toBePrinted += e.second.name+", ";
			}else if(e.second == this){
				toBePrinted += e.first.name+", ";
			}
		}
		System.out.println(toBePrinted);
	}

}
