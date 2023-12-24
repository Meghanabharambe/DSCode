package circularQueueProg;

public class CircularQueue {
	private int size, front, rear;
    private int []arr;
    
    public CircularQueue() {
 	   size = 3;
 	   front = rear = -1;
 	   arr = new int[size];
    }

	public CircularQueue(int size) {
		super();
		this.size = size;
		front = rear = -1;
		this.arr = new int[size];
	}
	
	public void enqueue(int num) {
		if(!isFull()) {
			if(front == -1)
				front = 0;
			rear = (rear+1)%size;
			arr[rear] = num;
		}
		else 
			System.out.println("queue is full..");
	}
	
	public int dequeue() {
		int data = -999;
		if(!isEmpty()) {
			data = arr[front];
			
			if((front+1)%size == rear) {
				front = rear = -1;
			}
			else front++;
		}
		
		return data;
	}
	
	private boolean isFull() {
		if((rear+1)%size == front)
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
			int i;
	     	for(i = front; i!=rear; i = (i+1)%size) {
			  System.out.print(arr[i]+" ");
		   }
	     	 if(i==rear)
				  System.out.print(arr[i]+" ");
	     	System.out.println();
		}
	}
}
