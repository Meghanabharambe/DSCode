package arrayOpera;

import java.util.Scanner;

public class Add2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		
		int res[][] = new int[3][3];
		System.out.println("Enter value in array: ");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				arr1[i][j] = sc.nextInt();
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
	   
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
