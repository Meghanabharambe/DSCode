package simpleLinkedList;

public class Node {
	int data;
	Node link;
	
	public Node() {
		this.data = 1;
		this.link = null;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.link = null;
	}
	
	public String toString() {
		return data+" ";
	}
	
}
