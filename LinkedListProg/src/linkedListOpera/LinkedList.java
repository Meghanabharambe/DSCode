package linkedListOpera;

import java.util.Scanner;

import simpleLinkedList.NodeStr;

public class LinkedList {
     Node head;

	public LinkedList() {
		super();
		this.head = null;
	}
	
	//Creating linkedList...
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
		
	
	//find size of linkedList...
	public int size() {
		int cnt = 0;
		Node move;
		for(move = head; move != null; move = move.next) {
			cnt++;
		}
		return cnt;
	}
	
	  //delete node of given data from linkedList...
	public void deleteByData(int data) {
			if(head.data == data) {
				head = head.next;
				System.out.println("Data deleted is "+ data);
			}
			else {
				Node move = head;
				while(move.next != null) {
					if(data == move.next.data) {
						move.next = move.next.next;	
					   System.out.println("Deleted data is "+data);		
					   break;
					}		
					move = move.next;
			   }
	      }
	 }
	
	//delete node from given position
	public void deleteBypos(int pos) {
		int cnt = size();
		
		if(pos<=cnt) {
			if(pos == 1) {
				head = head.next;
				System.out.println("Element is deleted at position 1");
			}
			else {
				Node move = head;
				for(int i = 2; i<=cnt; i++) {
					if(pos == i) {
						move.next = move.next.next;
						System.out.println("Element is deleted at position "+i);
						break;
					}
					move = move.next;
				}
			}
		}
	}
	
	//Reverse linkedList..
	public void reverseList(Node move) {
		if(move != null) {
			reverseList(move.next);
			System.out.print(move.data+" ");
		}
	}
	
	//insert at specific position
	public void insertAtPos(int pos, int data) {
		int cnt = size();
		
		if(pos<=cnt+1) {
			Node newNode = new Node(data);
			if(pos == 1) {
				if(head == null)
					head = newNode;
				else {
					newNode.next = head;
					head = newNode;
				}
				System.out.println("Element inserted at "+ 1+ " is "+ newNode.data);
			}
			else {
				Node move = head;
				for(int i = 2; i<=cnt+1; i++) {
					if(pos == i) {
						newNode.next = move.next;
						move.next = newNode;
						System.out.println("Element inserted at "+ i+ " is "+ newNode.data);
						break;
					}
					move = move.next;
				}
			}
		}
	}
	
	
	//insert new data to old data
	public void insertData(int oldData, int newData) {
		if(head.data == oldData) {
			head.data = newData;
		}
		else {
			Node move;
			for(move = head; move != null; move = move.next) {
				if(move.data == oldData) {
					move.data = newData;
					break;
				}

			}
		}
	}
	
		
	//Mid of LinkedList...
	public void midElement() {
		Node fast = head;
		Node slow = head;
		
		int mid;
		
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		mid = slow.data;
		System.out.println("Mid element is "+mid);
	}
	
	
	//Create sorted linkedList
	public void sortedList(int size) {
		Scanner sc = new Scanner(System.in);

		for(int i =0; i<size; i++) {
			System.out.println("Enter data to insert into list: ");
			int data = sc.nextInt();
			
			Node newnode = new Node(data);
			if(head == null)
				head = newnode;
			else if(head.data > newnode.data){
				newnode.next = head;
				head = newnode;
			}
			else {
				Node move = head;
				while(move.next != null) {
					if(move.data <= newnode.data && move.next.data > newnode.data) {
						newnode.next = move.next;
						move.next = newnode;
						break;
					}
					move = move.next;
				}
				if(move.next == null)
					move.next = newnode;
			}
			
		}
			
	}  
	
	//Reverse LinkedList
	public void revList() {
		Node start, mid, end;
		start = null;
		mid = head;
		//System.out.println(mid +" "+ start);
		while(mid != null) {
			end = mid.next;
			mid.next = start;
			
			start = mid;
			mid = end;
		}
		head = start;
	}
	
	//Add element to both side of linkedList
	public void addBothSide(int size) {
		Scanner sc = new Scanner(System.in);
			
			for(int i =0; i<size/2; i++) {
				System.out.println("Enter data to insert into list: ");
				int data = sc.nextInt();
				
				Node newnode = new Node(data);
					newnode.next = head;
					head = newnode;

					Node move = head;
					while(move.next != null)
						move = move.next;
					Node Node1 = new Node(data);
					move.next = Node1;
			}
	}
	
	//display data from nth position
	public void displayNth(int pos) {
		int cnt = size();
		
		Node move = head;
		for(int i = 1; i<=cnt; i++) {
			if(pos == i) {
				System.out.println(move.data);
			}
			move = move.next;
		}
	}
		
}









