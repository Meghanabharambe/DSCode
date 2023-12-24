package arrayOpera;

import java.util.Scanner;

public class SparseMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of row and column: ");
	    int row = sc.nextInt();
	    int col = sc.nextInt();
	    
	    
		int arr[][] = new int[row][col];  //{{1, 0, 0, 0, 0}, {0, 0, 0, 4, 0},{0, 5, 0, 0, 0},{0, 0, 6, 0, 0}};
		
		System.out.println("Enter values to store in array: ");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				arr[i][j] = sc.nextInt();			
			}
		}
		
		//create sparse and store value
	    int nonZero = nonZero(arr);
	    int sparse[][] = new int[nonZero+1][3];
	    sparse[0][0] = row;
	    sparse[0][1] = col;
	    sparse[0][2] = nonZero;
	    int k = 1;
	    
	    for(int i = 0; i<row; i++) {
	    	for(int j = 0; j<col; j++) {
	    		if(arr[i][j] != 0) {
	    			sparse[k][0] = i;
	    			sparse[k][1] = j;
	    			sparse[k][2] = arr[i][j];
	    			k++;
	    		}
	    	}
	    }
	    
	    System.out.println("2D array: ");
	    display(arr, row, col);
	    System.out.println();
	    System.out.println("Sparse matrix: ");
	    display(sparse, nonZero+1, 3);
	    
	}
	
	//to find count of non zero element
	public static int nonZero(int arr[][]) {
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<=arr.length; j++) {
				if(arr[i][j] != 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	//to display array and sparse matrix
	public static void display(int arr[][], int row, int col) {
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
