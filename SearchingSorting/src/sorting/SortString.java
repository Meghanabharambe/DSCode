package sorting;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   	 System.out.println("Enter array length: ");
	   	 int size = sc.nextInt();
	   	 
	   	 String arr[] = new String[size];
	   	 System.out.println("Enter elements in array: ");
	   	 for(int  i= 0; i<size; i++) {
	   		 arr[i] = sc.next();
	   	 }
	   	 
	   	 stringSort(arr);
		}
	
	public static void stringSort(String arr[]) {
		
	}
}
