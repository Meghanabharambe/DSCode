package linkedListUserDefinedType;

import java.util.Scanner;

public class LinkedListEmp {
	NodeEmp head;

	public LinkedListEmp() {
		super();
		this.head = null;
	}
	
	public void createLinkedList(int size) {
		Scanner sc = new Scanner(System.in);
		
		while(size != 0) {
			System.out.println("Enter data to insert into linked list: ");
			int id = sc.nextInt();
			String name = sc.next();
			Employee data = new Employee(id, name);
			addNode(data);
			size--;
		}
	}
	
	public void addNode(Employee data) {
		NodeEmp newNode = new NodeEmp(data);
		if(head == null)
			head = newNode;
		else {
			NodeEmp move = head;
			
			while(move.getNext() != null)
				move = move.getNext();
				move.setNext(newNode);
		} 
	}
	
	public String toString() {
		return head.toString();
	}
}
