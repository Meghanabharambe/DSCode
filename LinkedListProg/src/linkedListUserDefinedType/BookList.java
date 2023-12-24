package linkedListUserDefinedType;

import java.util.Scanner;

public class BookList {
	NodeBook head;

	public BookList() {
		super();
		this.head = null;
	}
	
	public void createList(int size) {
		Scanner sc = new Scanner(System.in);
		while(size != 0) {
			System.out.println("Enter id and title of book: ");
			int id = sc.nextInt();
			String title = sc.next();
		
			Book b1 = new Book(id, title);
		
			addNode(b1);
			size--;
	  }
	}
	
	public void addNode(Book b) {
		NodeBook n1 = new NodeBook(b);
		if(head == null)
			head = n1;
		else {
			NodeBook move;
			for(move = head; move.next!=null; move = move.next);
			move.next = n1;
		}	
	 }
	
	public String toString() {
		NodeBook move = head;
		String str = "";
		while(move!=null) {
			str += move.toString()+" ";
			move = move.next;
		}
		return str;
	}
}









