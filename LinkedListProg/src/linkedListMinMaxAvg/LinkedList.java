package linkedListMinMaxAvg;

import java.util.Scanner;

public class LinkedList {
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void createLinkedList(int size) {
		Scanner sc = new Scanner(System.in);
		int data;
		while(size != 0) {
			System.out.println("Enter data to insert into linked list: ");
			data = sc.nextInt();
			size--;
			
			addNode(data);
		}
	}
	
	//add node in linkedList...
	public void addNode(int val) {
		Node newNode = new Node(val);
		if(head == null)
			head = newNode;
		else {
			Node move = head;
			while(move.next != null)
				move = move.next;
			move.next = newNode;
		} 
	}

	//display linkedlist..
		public void display() {
			Node move;
			for(move = head; move.next != null; move = move.next) {
				System.out.print(move.data+" ");
			}
			if(move.next == null) {
				System.out.println(move.data);
			}
		}
		
	//find min
	public int findMin() {
		Node move = head;
		int min = move.data;
		while(move != null) {
			if(move.data < min) {
				min = move.data;
			}
			move = move.next;
		}
		return min;
	}
	
	//find max
	public int findMax() {
		Node move = head;
		int max = move.data;
		while(move != null) {
			if(move.data > max)
				max = move.data;
			move = move.next;
		}
		return max;
	}
	
	//find average
	public int findAvg() {
		Node move = head;
		int sum = 0;
		int cnt = 0;
		while(move != null) {
			sum = sum + move.data;
			cnt++;
			move = move.next;
		} 
		return sum/cnt;
	}
	
	//Rotate Left
	public void rotateLeft(int key) {	
	   while(key > 0) {
		   Node move = head;
		   while(move.next != null)
			   move = move.next;
		   move.next = head;
		   head = head.next;
		   move.next.next = null;
		   
		   key--;
	   }
	}
	
	//Rotate right
	public void rotateRight(int key) {
		Node move = head;
		int cnt = 0;
		while(move.next != null) {
			cnt++;
			move = move.next;
		}
		int num = cnt-key;
		Node n1 = head;
		
		while(num>0) {
			n1 = n1.next;
			num--;
		}
		
		move.next = head;
		head = n1.next;
		n1.next = null;
	}
}











