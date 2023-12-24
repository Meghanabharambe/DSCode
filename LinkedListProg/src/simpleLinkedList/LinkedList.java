package simpleLinkedList;

public class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}
	
	public void createLinkedList(int size) {
		int num = 5;
		
		for(int i = 1; i <= size; i++) {
			addNode(num);
			num += 5;
		}
	}
	
	public void addNode(int num) {
		Node record = new Node(num);
		if(head == null) {
			head = record;
		}
		else {
			Node move;
			for(move = head; move.link != null; move = move.link);
			  move.link = record;
		}
	}
	
	public void display() {
		Node move;
		for(move = head; move.link != null; move = move.link) {
			System.out.print(move.data+" ");
		}
		if(move.link == null) {
			System.out.println(move.data);
		}
		
	}
}
