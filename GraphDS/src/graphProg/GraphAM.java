package graphProg;

import java.util.Scanner;

public class GraphAM {
	int ver;
	int matrix[][];
	
	public GraphAM(int size) {
		super();
		this.ver = size;
		matrix = new int[size][size];
	}
	
	//1. this is one way to insert graph data in matrix
	public void acceptGraph() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<ver; i++) {
			for(int j =0; j<ver; j++) {
				System.out.println("Enter value for adjacent nodes "+i+", "+j);
				int no = sc.nextInt();
				matrix[i][j] = no;
			}
		}
	}
	
	// We can do in another way to reduce iterations....
	//2. this is one way to insert graph data in matrix
	public void addEdge(int i, int j) {
		matrix[i][j] = 1;
		matrix[j][i] = 1;
	}
	
	public void display() {
		for(int i = 0; i<ver; i++) {
			for(int j = 0; j<ver; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
