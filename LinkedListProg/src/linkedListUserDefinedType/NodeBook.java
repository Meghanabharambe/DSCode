package linkedListUserDefinedType;

public class NodeBook {
	Book b1;
	NodeBook next;
	
	public NodeBook(Book b1) {
		super();
		this.b1 = b1;
		this.next = null;
	}
	
	public String toString() {
		return b1.toString();
	}
}
