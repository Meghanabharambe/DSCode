package doublyLinkedList;

import java.util.Scanner;

public class DoublyLL {
	NodeDL head;

	public DoublyLL() {
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
		NodeDL newnode = new NodeDL(data);
		
		if(head == null) 
			head = newnode;
		else {
			NodeDL move = head;
			while(move.next != null)
				move = move.next;
			move.next = newnode;
			newnode.prev = move;
		}
	}
	
	public void display() {
		NodeDL move = head;
		while(move != null) {
			System.out.print(move.data+" ");
			move = move.next;
		}
		System.out.println();
	}
	
	
	//add at beginning
	public void addBeg(int data) {
		NodeDL n1 = new NodeDL(data);
		if(head == null)
			head = n1;
		else {
			n1.next = head;
			head.prev = n1;
			head = n1;
		}
	}
	
	//add at end
	public void addEnd(int data) {
		NodeDL n1 = new NodeDL(data);
		NodeDL move = head;
		
		while(move.next != null)
			move = move.next;
		
		move.next = n1;
		n1.prev = move;	
	}
	
	
	//size of linkedList
	public int size() {
		int cnt = 0;
		NodeDL move = head;
		while(move != null) {
			move = move.next;
			cnt++;
		}
		return cnt;
	}
	
	//Insert at given position 
	public void insert(int pos, int data) {
		int cnt = size();
		
		if(pos<=0 || pos>cnt+1)
			System.out.println("Not valid...");
		else {
			NodeDL n1 = new NodeDL(data);
			if(pos == 1) {
				if(head == null)
					head = n1;
				else {
					n1.next = head;
					head.prev = n1;
					head = n1;
				}
			}
			else {
				NodeDL move = head;
				for(int i = 1; i<pos-1; i++)
					move = move.next;
				n1.next = move.next;
				if(n1.next != null)
					move.next.prev = n1;
				move.next = n1;
				n1.prev = move;	
			}
		}
	}
	
	//delete node as per data
	public void deleteData(int data) {
		
		if(head.data == data) {
			if(head.next == null)
				head = null;
			else {
				head.next.prev = null;
			    head = head.next;
			}
		}
		else {
			NodeDL move = head;
			  while(move != null && move.data != data)
					move = move.next;
				if(move == null) {
					System.out.println("data not found..");
					return;
				}
				if(move.next != null) {
					move.next.prev = move.prev;
					move.prev.next = move.next;
				}
				else {
					move.prev.next = null;
				}
		}
	}
	
	//delete by position
	public void deletepos(int pos) {
		int cnt = size();
		if(pos<=0 && pos>cnt+1)
			System.out.println("position is not valid...");
		else {
			if(pos==1) {
				if(head.next == null)
					head=null;
				else {
					head.next.prev = null;
					head = head.next;
				}	
			}
			
			NodeDL move = head;
			for(int i=1; i<pos; i++) 
				move = move.next;
			if(move.next != null) {
				move.prev.next = move.next;
				move.next.prev = move.prev;
			}
		}
	}
	
	//modify data in list
	public void modify(int olddata, int newdata) {
		NodeDL move = head;
		
		while(move != null && move.data!= olddata)
			move = move.next;
		
		if(move.data == olddata) {
			move.data = newdata;
		}
		else System.out.println("Data not found...");
	}
	
	//print reverse 
	public void printRev() {
		NodeDL move = head;
		
		while(move.next != null)
			move = move.next;
		
		System.out.println("Print in reverse...");
		while(move != null) {
			System.out.print(move.data+" ");
			move = move.prev;
		}
		System.out.println();
	}
	
}







