package graphList;

public class Graph {
	int ver;
	LinkedList graph[];
	
	public Graph(int size) {
		ver = size;
		graph = new LinkedList[size];
	}
	
	public void addEdge(int i, int j) {
		Node n1 = new Node(i);
		Node n2 = new Node(j);
		graph[i].addBeg(n2);
		graph[j].addBeg(n1);
	}
	
	public void display() {
		for(int i = 0; i<ver; i++) {
			Node move = graph[i].head;
			while(move != null) {
				System.out.print(move.data+" ");
				move = move.next;
			}
			System.out.println();
		}
	}
}
