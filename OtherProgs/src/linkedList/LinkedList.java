package linkedList;

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
		System.out.println("Enter data to insert: ");
		for(int i = 0; i<size; i++) {
			data = sc.nextInt();
			addNode(data);
		}
	}
	
	public void addNode(int data) {
         int cnt = 0;
         int num = 0;
         
		Node n1 = new Node(data);
		if(head == null)
			head = n1;
		else {
			Node move = head;
			while(move.next != null) {
				move = move.next;
				cnt++;
			}
			
		move.next = n1;
			
			if(cnt >= 3) {
				Node n2 = head;
				move = move.next;
				while(num < 3) {
					n2 = n2.next;
					num++;
					cnt++;
			   }
			  move.next = n2;
			}
		}
	}
}
