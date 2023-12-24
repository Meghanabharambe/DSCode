package searching;

import java.util.Scanner;

public class LinearSearch {
     public static void main(String []args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter array length: ");
    	 int size = sc.nextInt();
    	 
    	 int arr[] = new int[size];
    	 System.out.println("Enter elements in array: ");
    	 for(int  i= 0; i<size; i++) {
    		 arr[i] = sc.nextInt();
    	 }
    	 
    	 System.out.println("Enetr element to search in arr: ");
    	 int key = sc.nextInt();
    	 
    	 int index = linearSearch(arr, key);
    	 
    	 if(index != -1) {
    		 System.out.println("Element is at index "+index);
    	 }
        else
        	System.out.println("Element not found");
     }
     
     public static int linearSearch(int []arr, int key) {
    	 for(int i = 0; i<arr.length; i++) {
    		 if(arr[i] == key) {
    			 return i;
    		 }
    	 }
    	 return -1;
     }
}
