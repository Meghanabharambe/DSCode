package sorting;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		int size=5;
		int arr[]=new int[size];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 Elements ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		display(arr, size);
		quickSort(arr, size);
		display(arr, size);
		sc.close();	
	}
	
	public static void quickSort(int arr[], int size) {
		qsort(arr, 0, size-1);
	}
	
	public static void qsort(int arr[], int left, int right) {
		int pivote, l, r;
		pivote = arr[left];
		l = left;
		r = right;
		
		while(left<right) {
			while(arr[right] >= pivote && left < right)
				right--;
			
			if(left != right) {
				arr[left] = arr[right];
				left++;
			}
			
			while(arr[left] <= pivote && left < right)
				left++;
			
			if(left != right) {
				arr[right] = arr[left];
				right--;
			}
		}
		
		arr[left] = pivote;
		
		if(l<left)
			qsort(arr, l, left-1);
		if(r>left)
			qsort(arr, right+1, r);
	}
	
	 public static void display(int a[],int size)
	{
		int i;
		System.out.println("\nArray Is : ");
		for(i=0;i<size;i++)
			System.out.print(" "+a[i]);
		System.out.println();
	}

}


















