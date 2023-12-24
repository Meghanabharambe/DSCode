package searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
   	 System.out.println("Enter array length: ");
   	 int size = sc.nextInt();
   	 
   	 int arr[] = new int[size];
   	 System.out.println("Enter elements in array: ");
   	 for(int  i= 0; i<size; i++) {
   		 arr[i] = sc.nextInt();
   	 }
   	 
   	 System.out.println("Enter element to search in arr: ");
   	 int key = sc.nextInt();
   	 
   	 int index = binarySearch(arr, key);
   	 
   	 if(index != -1) {
   		 System.out.println("Element is at index "+index);
   	 }
       else
       	System.out.println("Element not found");
    }
	
	public static int binarySearch(int []arr, int key) {
		int start = 0;
		int end = arr.length-1;    
	    
	   while(start <= end){
	    	int mid = (start + end)/2;
	    	if(arr[mid] == key) {
	    		return mid;
	    	}
	    	else if(arr[mid] < key) {
	    		start = mid+1;
	    	}
	    	else
	    	   end = mid - 1;
	    }
	   return -1;
	}

}
