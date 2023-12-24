package arrayOpera;

public class MergeArray {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {11, 22, 33, 44, 55};
		
		int len = arr1.length + arr2.length;
		
		int arr3[] = new int[len];
		
		for(int i = 0; i<arr1.length; i++) {     //arr3[] = {1, 2, 3, 4, 5, 11, 22, 33, 44, 55}
			arr3[i] = arr1[i];
			arr3[i+5] = arr2[i];
		}
		
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}

	}

}
