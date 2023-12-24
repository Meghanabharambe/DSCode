package binarySearchTree;

public class QueueTree {
	NodeQueue front, rear;

	public QueueTree() {
		super();
		this.front = rear = null;
	}
	
	public boolean isEmpty() {
		return front == null?true:false;
	}
	
	public void enQueue(Node data) {
		NodeQueue n1 = new NodeQueue(data);
		if(isEmpty())
			front=rear=n1;
		else {
			rear.next = n1;
			rear = n1;
		}
	}
	
	public Node deQueue() {
		Node data;
		if(isEmpty())
			data = null;
		else {
			data = front.data;
			front = front.next;
		}
	   return data;
	}
	
}
