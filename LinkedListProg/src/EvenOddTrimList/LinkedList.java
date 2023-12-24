package EvenOddTrimList;

import java.util.Scanner;

public class LinkedList {
	Node head;

	public LinkedList() {
		super();
		this.head = null;
	}	
	
	public void createList(int size) {
		Scanner sc = new Scanner(System.in);
		int data;
		System.out.println("Enter data to insert into list: ");
		for(int i = 0; i<size; i++) {
			data = sc.nextInt();
			addNode(data);
		}
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node move = head;
			while(move.next != null)
				move = move.next;
			
			move.next = newNode;
		}
	}
	
	public void display() {
		for(Node move = head; move != null; move = move.next) {
			System.out.print(move.data+" ");
		}
		System.out.println();
	}
	
	public void printEvenOdd() {
		for(Node move = head; move != null; move = move.next) {
			if(move.data % 2 == 0)
				System.out.println("Even num: "+move.data);
			else
				System.out.println("Odd num: "+move.data);
		}
	}
	
	public void trimList(int pos, int num) {
		int cnt = 1;
		LinkedList list = new LinkedList();
		Node move = head;
		while(cnt < pos) {
			move = move.next;
			cnt++;
		}
		cnt = 1;
		while(cnt <= num) {
			if(move != null) {
				list.addNode(move.data);
				move = move.next;
				cnt++;
			}
			else {
				System.out.println("List is empty...");
				break;
			}
		}
		list.display();
	}
}
