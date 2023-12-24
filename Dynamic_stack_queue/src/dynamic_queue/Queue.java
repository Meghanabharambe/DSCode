package dynamic_queue;

public class Queue {
	NodeQ front, rear;
	
	public Queue() {
		front = rear = null;
	}
	
	public boolean isEmpty() {
		return front == null?true:false;
	}
	
	public void enQueue(int data) {
		NodeQ n1 = new NodeQ(data);
		if(isEmpty())
			front=rear=n1;
		else {
			rear.next = n1;
			rear = n1;
		}
	}
	
	public int deQueue() {
		int data;
		if(isEmpty())
			throw new QueEmptyException();
		else {
			data = front.data;
			front = front.next;
		}
	   return data;
	}
	
	/*public void display() {
		NodeQ move = front;
		if(move == null) {
			System.out.println("Stack is empty..");
			return;
		}
		while(move != rear) {
			System.out.print(move.data+" ");
			move = move.next;
		}
		System.out.println(move.data);
		
	}*/
	 public String toString() {
		 String str = "";
		 for(NodeQ move = front; move != null; move = move.next) {
			 str = str+move.data+" ";
		 }
		 return str;
	 }
	
}
