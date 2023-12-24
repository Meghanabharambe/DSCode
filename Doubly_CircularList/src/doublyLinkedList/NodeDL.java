package doublyLinkedList;

public class NodeDL {
	int data;
	NodeDL prev, next;
	
	public NodeDL(int data) {
		super();
		this.data = data;
		this.prev= next = null;
	}
}
