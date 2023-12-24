package graphProg;

public class GraphDFS {
	int ver;
	int matrix[][];
	
	public GraphDFS(int size) {
		super();
		this.ver = size;
		this.matrix = new int[size][size];
	}
	
	public void addEdge(int i, int j) {
		matrix[i][j] = 1;
		matrix[j][i] = 1;
	}
	
	public void display() {
		for(int i =0; i<ver; i++) {
			for(int j = 0; j<ver; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	
	public void DFS(int start) {
		boolean v[] = new boolean[ver];
		
		v[start] = true;
		System.out.println(start);
		
		travDFS(start, v);
	}
	
	public void travDFS(int start, boolean v[]) {
		for(int i =0; i<ver; i++) {
			if(matrix[start][i] == 1 && v[i] == false) {
				v[i] = true;
				System.out.println(i);
				travDFS(i, v);
			}
		}
	}
	
}
