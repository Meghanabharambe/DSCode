package dynamic_stack;

public class NodeS {
	int data;
	NodeS next;
	
	public NodeS(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		return data+ "";
	}
}
