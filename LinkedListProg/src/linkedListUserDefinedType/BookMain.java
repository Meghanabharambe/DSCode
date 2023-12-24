package linkedListUserDefinedType;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookList b = new BookList();
		
		System.out.println("Enter size of list: ");
		int size = sc.nextInt();
		
		b.createList(size);
	    System.out.println(b);
	}

}
