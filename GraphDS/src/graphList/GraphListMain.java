package graphList;

public class GraphListMain {

	public static void main(String[] args) {
		Graph g1 = new Graph(5);
		g1.addEdge(0, 4);
		g1.addEdge(0, 1);
		g1.addEdge(1, 2);
		g1.addEdge(2, 3);
		g1.addEdge(3, 4);
		
		g1.display();
	}
}
