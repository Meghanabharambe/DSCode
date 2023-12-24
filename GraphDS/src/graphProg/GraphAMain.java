package graphProg;

import java.util.Scanner;

public class GraphAMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		
	//GraphAM object.............
		/*System.out.println("Enter size of graph: ");
		  size = sc.nextInt();
		  
		 GraphAM g = new GraphAM(size);		
		//g.acceptGraph();
		//g.display();
		System.out.println("Undirected graph....");
	    g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		
		g.display();  */
		
		
		
	//DireGraphAM object...........
		System.out.println("Enter size of graph: ");
		  size = sc.nextInt();
		  
		System.out.println("Directed graph....");
		DireGraphAM dg = new DireGraphAM(size);
		dg.addEdge(0, 1);
		dg.addEdge(0, 2);
		dg.addEdge(0, 3);
		dg.addEdge(0, 4);
		dg.addEdge(1, 5);
		dg.addEdge(2, 5);
		dg.addEdge(3, 6);
		dg.addEdge(4, 6);
		dg.addEdge(5, 6);
		
		dg.display();
		
		dg.inDegree();
		dg.outDegree(); 
		
		
		
		
	//GraphDFS object.............
		/*System.out.println("Enter size of graph: ");
		size = sc.nextInt();
		GraphDFS g1 = new GraphDFS(size);
		g1.addEdge(0, 1);
		g1.addEdge(0, 2);
		g1.addEdge(0, 3);
		
		g1.addEdge(1, 3);
		g1.addEdge(1, 4);
		g1.addEdge(1, 6);

		g1.addEdge(2, 3);
		g1.addEdge(2, 5);
		
		g1.addEdge(3, 5);
		g1.addEdge(3, 6);
		
		g1.addEdge(4, 6);
		
		g1.addEdge(5, 6);
		
		g1.display();
		System.out.println("Enter start of traversal: ");
		int start = sc.nextInt();
		g1.DFS(start);
		*/
		
	}
}
