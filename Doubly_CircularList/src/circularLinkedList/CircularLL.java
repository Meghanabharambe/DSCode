package circularLinkedList;

import java.util.Scanner;

import doublyLinkedList.NodeDL;

public class CircularLL {
	NodeCL head;

	public CircularLL() {
		super();
		this.head = null;
	}
	
	public void createLinkedList(int size) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=size; i++) { 
			System.out.println("Enter data to insert into list: ");
			int data = sc.nextInt();
			addNode(data);
		}
	}
	
	public void addNode(int data) {
		NodeCL newnode = new NodeCL(data);
		
		if(head == null) {
			head = newnode;
			newnode.next = head;
		}
		else {
			NodeCL move = head;
			while(move.next != head)
				move = move.next;
			move.next = newnode;
			newnode.next = head;
		}
	}
	
	public void display() {
		NodeCL move = head;
		while(move.next != head) {
			System.out.print(move.data+" ");
			move = move.next;
		}
		System.out.print(move.data);
		System.out.println();
	}
	
	public int size() {
		int cnt = 0;
		NodeCL move;
		for(move = head; move.next != head; move = move.next)
			cnt++;
		
		return cnt+1;
	}
	
	//add At beginning of list
	public void addBeg(int data) {
	  NodeCL newnode = new NodeCL(data);
		if(head == null) {
			head = newnode;
			newnode.next = head;
		}
		else {
			newnode.next = head;
			NodeCL move;
			for(move = head; move.next != head; move = move.next);
			move.next = newnode;
			newnode.next = head;
			head = newnode;
		}
	}
	
	//add at end of list
	public void addEnd(int data) {
		NodeCL newnode = new NodeCL(data);
		NodeCL move = head;
		while(move.next != head)
			move = move.next;
		
		move.next = newnode;
		newnode.next = head;
	}
	
	//delete from beginning
	public void deleteBegi() {
		NodeCL move;
		head = head.next;
		for(move = head; move.next != head; move = move.next);
		move.next = head;
	}
	
	//delete from mid
	public void deleteMid(int pos) {
		int cnt = size();
		
		if(pos == 1)
			deleteBegi();
		else if(pos == cnt)
			deleteEnd();
		
		else {
			NodeCL move;
			for(move = head; move.next != head; move = move.next) {
				
			}
		}
	}
	
	//delete from end
	public void deleteEnd() {
		NodeCL move;
		for(move = head; move.next.next != head; move = move.next);
		  move.next = head;
	}
	
}








