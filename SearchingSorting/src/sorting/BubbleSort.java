package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
   	 System.out.println("Enter array length: ");
   	 int size = sc.nextInt();
   	 
   	 int arr[] = new int[size];
   	 System.out.println("Enter elements in array: ");
   	 for(int  i= 0; i<size; i++) {
   		 arr[i] = sc.nextInt();
   	 }
   	 
   	 bubbleSort(arr);
	}
	
	public static void bubbleSort(int []arr) {
		int size = arr.length;
		
		for(int i = 0; i<size-1; i++) {
			for(int j = 0; j<size-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i<size; i++) {
			System.out.println(arr[i] +" ");
		}
	}

}
