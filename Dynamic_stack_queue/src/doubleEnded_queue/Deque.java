package doubleEnded_queue;

import dynamic_queue.QueEmptyException;

public class Deque {
		NodeQ front, rear;
	
	public Deque() {
		front = rear = null;
	}
	
	public boolean isEmpty() {
		return front == null?true:false;
	}
	
	public void enQueFront(int data) {
		NodeQ n1 = new NodeQ(data);
		if(isEmpty())
			front = rear = n1;
		else {
			n1.next = front;
			front = n1;
		}
	}
	public void enQueRear(int data) {
		NodeQ n1 = new NodeQ(data);
		if(isEmpty())
			front = rear = n1;
		else {
			rear.next = n1;
			rear = n1;
		}
	}
	
	public int dequeFront() {
		if(isEmpty())
			throw new QueEmptyException();
		int data = front.data;
		front = front.next;
		
		return data;
	}
	public int dequeRear() {
		if(isEmpty())
			throw new QueEmptyException();
		
		NodeQ move;
		for(move = front; move.next.next != null; move = move.next);
		
		int data = rear.data;
		rear = move;
		rear.next = null;
		
		return data;
	}
	
	public String toString() {
		String str = "";
		for(NodeQ move = front; move != null; move = move.next) {
			str += move.data+" ";
		}
		return str;
	}
}





