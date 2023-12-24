package arrayOpera;

import java.util.Scanner;

public class ArrayOpera {
	
public static void display(int arr[], int arr1[]) {
		System.out.println("Display array1 values: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Display array2 values: ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();	
}

public static void union(int arr1[], int arr2[]) {
		int cnt = 0;
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
					cnt++;
				}
			}
		}
		
		int size = (arr1.length + arr2.length)-cnt;
		int arr[] = new int[size];
		
		for(int j = 0; j<arr1.length; j++) {
			arr[j] = arr1[j];
		}
		int index = arr.length/2;
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
					arr[index++] = arr2[j];
				}
			}
		}
		
	   System.out.println("Print Union array: ");
	   for(int i = 0; i<size; i++) {
		   System.out.print(arr[i]+" ");
	   }
}

public static void intersection(int arr1[], int arr2[]) {
		int cnt = 0;
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
		int arr[] = new int[cnt];
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
					arr[i] = arr1[i];
					break;
				}
			}
		}
		
		System.out.println("Print Intersection array: ");
		   for(int i = 0; i<cnt; i++) {
			   System.out.print(arr[i]+" ");
		   }
		
		
}
	
public static void countEven(int []arr1, int []arr2) {
	int evencnt1 = 0,evencnt2 = 0;
		for(int i = 0;i<arr1.length; i++) {
			if(arr1[i]%2 == 0) {
				evencnt1++;
			}
			if(arr2[i]%2 == 0) {
				evencnt2++;
			}
		}
		
	System.out.println("Even number arr1: "+evencnt1);
	System.out.println("Even number arr2: "+evencnt2);
	
}

public static void countOdd(int []arr1, int []arr2) {
	int oddcnt1 = 0, oddcnt2 = 0;
		for(int i = 0;i<arr1.length; i++) {
			if(i%2 == 0) {
				oddcnt1++;
			}
			else oddcnt2++;
		}
		
		System.out.println("Odd number arr1: "+oddcnt1);
		System.out.println("Odd number arr2: "+oddcnt2);
		
}

public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrays: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		for(int i = 0; i<size; i++) {
			System.out.println("Enter elements to enter into array: ");
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			arr1[i] = j;
			arr2[i] = k;
		}*/
		
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {6, 7, 2, 9, 3};
		display(arr1, arr2);
		
		//union(arr1, arr2);
		//intersection(arr1, arr2);
		countEven(arr1, arr2);
		countOdd(arr1, arr2);
	}

}
