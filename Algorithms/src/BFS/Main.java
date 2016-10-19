package BFS;

public class Main
{
	public static void main(String[] args) 
	{
		Algorithm algo=new Algorithm();
		
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		Vertex v5=new Vertex(5);
		Vertex v6=new Vertex(6);
		Vertex v7=new Vertex(7);
		
		v1.addNeighbour(v2);
		v1.addNeighbour(v3);
		v2.addNeighbour(v4);
		v3.addNeighbour(v4);
		v5.addNeighbour(v4);
		v1.addNeighbour(v6);
		v6.addNeighbour(v7);
		
		algo.bfs(v1);
		
	}
}
