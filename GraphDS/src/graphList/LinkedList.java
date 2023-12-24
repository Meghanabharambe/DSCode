package graphList;

public class LinkedList {
	Node head;

	public LinkedList() {
		super();
		this.head = null;
	}
	
	public void addBeg(Node data) {
		if(head == null) {
			head = data;
		}
		else {
			data.next = head;
			head = data;
		}
	}
}
