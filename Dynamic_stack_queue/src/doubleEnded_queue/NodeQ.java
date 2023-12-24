package doubleEnded_queue;

public class NodeQ {
	int data;
	NodeQ next;
	
	public NodeQ(int data) {
		this.data = data;
		next = null;
	}
	
	public String toString() {
		return "[" + data +"]";
	}
}
