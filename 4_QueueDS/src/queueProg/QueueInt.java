package queueProg;

public class QueueInt {
       private int size, front, rear;
       private int []arr;
       
       public QueueInt() {
    	   size = 3;
    	   front = rear = -1;
    	   arr = new int[size];
       }

	public QueueInt(int size) {
		super();
		this.size = size;
		front = rear = -1;
		this.arr = new int[size];
	}
	
	public void enqueue(int num) {
		if(!isFull()) {
			if(front == -1)
				front = 0;
			rear = rear+1;
			arr[rear] = num;
		}
		else 
			System.out.println("queue is full..");
	}
	
	public int dequeue() {
		int data = -999;
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
			  System.out.println(arr[i]+" ");
		   }
		}
	}
       
}
