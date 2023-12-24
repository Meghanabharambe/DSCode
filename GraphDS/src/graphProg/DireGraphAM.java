package graphProg;

public class DireGraphAM {
      int ver;
      int matrix[][];
      
	public DireGraphAM(int size) {
		super();
		this.ver = size;
		this.matrix = new int[size][size];
	}
	
	public void addEdge(int i, int j) {
		matrix[i][j] = 1;
	}
	
	public void display() {
		for(int i = 0; i<ver; i++) {
			for(int j = 0; j<ver; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void outDegree() {
		int cnt = 0;
		int syncNode = 0;
		System.out.println();
		for(int i = 0; i<ver; i++) {
			cnt = 0;
			for(int j = 0; j<ver; j++) {
				if(matrix[i][j] == 1)
					cnt++;
			}
			if(cnt == 0)
				   syncNode = i;
			System.out.println("OutDegree of "+i+" is "+cnt);
		}
		System.out.println("Sync node: "+syncNode);
	}
	
	public void inDegree() {
		int cnt = 0;
		int sourseNode = 0;
		System.out.println();
		for(int i = 0; i<ver; i++) {
			cnt = 0;
			for(int j = 0; j<ver; j++) {
				if(matrix[j][i] == 1)
					cnt++;
			}
			if(cnt == 0)
			   sourseNode = i;
			System.out.println("InDegree of "+i+" is "+cnt);
		}
		System.out.println("Sourse node: "+sourseNode);
		
	}
}
