package simpleLinkedList;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of linked list: ");
		int size = sc.nextInt();
		
		LinkedList l1 = new LinkedList();
		
		l1.createLinkedList(size);
		l1.display();
	}

}
