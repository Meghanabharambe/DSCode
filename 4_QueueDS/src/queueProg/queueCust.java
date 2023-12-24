package queueProg;

public class queueCust {
	private int front, rear, size;
	private Customer []arr;
	
	public queueCust() {
 	   size = 3;
 	   front = rear = -1;
 	   arr = new Customer[size];
    }

	public queueCust(int size) {
		super();
		this.size = size;
		front = rear = -1;
		this.arr = new Customer[size];
	}
	
	public void enqueue(Customer c1) {
		if(!isFull()) {
			if(front == -1)
				front = 0;
			rear = rear+1;
			arr[rear] = c1;
		}
		else 
			System.out.println("queue is full..");
	}
	
	public Customer dequeue() {
		Customer data = null;
		if(!isEmpty()) {
			data = arr[front];
			
			if(front == rear) {
				front = rear = -1;
			}
			else front++;
		}
		
		return data;
	}
	
	private boolean isFull() {
		if(rear == size-1)
			return true;
		else 
			return false;
	}
	
	private boolean isEmpty() {
		if(front == -1)
			return true;
		else 
			return false;
	}
	
	public void display() {
		if(front == -1)
			System.out.println("Queue is empty..");
		else {
	     	for(int i = front; i<=rear; i++) {
			   System.out.println(arr[i]);
		   }
		}
	}
}
