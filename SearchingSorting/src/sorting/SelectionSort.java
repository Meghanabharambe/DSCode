package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   	 System.out.println("Enter array length: ");
	   	 int size = sc.nextInt();
	   	 
	   	 int arr[] = new int[size];
	   	 System.out.println("Enter elements in array: ");
	   	 for(int  i= 0; i<size; i++) {
	   		 arr[i] = sc.nextInt();
	   	 }
	   	 
	   	 selectionSort(arr);

	}
	
	public static void selectionSort(int [] arr) {
		int small, index;
		int size = arr.length;
		for(int i = 0; i<size; i++) {
			small = arr[i];
			index = i;
			for(int j = i+1; j<size; j++) {
			    if(small > arr[j]) {
			    	small = arr[j];
			    	index = j;
			    }
			}
			arr[index] = arr[i];
			arr[i] = small;
			
		}
		
		for(int i = 0; i<size; i++) {
			System.out.println(arr[i] +" ");
		}
	}

}
