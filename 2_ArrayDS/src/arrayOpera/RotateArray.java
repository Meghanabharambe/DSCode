package arrayOpera;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7};
		Scanner sc = new Scanner(System.in);
		
		display(arr);
		System.out.println("Enter how amny element you want to rotate to Left: ");
		int key = sc.nextInt();
		
		rotateLeft(arr, key);
		display(arr);
		
		System.out.println("Enter how amny element you want to rotate to Right: ");
		key = sc.nextInt();
		
		int []arr1 = {1, 2, 3, 4, 5, 6, 7};
		rotateRight(arr1, key);
		display(arr1);
	}

	public static void display(int []arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
	public static void rotateLeft(int arr[], int key) {
		while(key > 0) {
			for(int i = 0; i<arr.length-1; i++) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			key--;
	 }
}
	
	public static void rotateRight(int arr[], int key) {
		int end = arr.length - 1;
		while(key > 0) {
			for(int i = 0; i<end; i++) {
				int temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;
			}
			key--;
		}
	}
	
}
