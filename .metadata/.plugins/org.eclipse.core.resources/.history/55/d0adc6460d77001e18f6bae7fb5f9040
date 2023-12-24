package priorityQue;

public class PriorityQue {
	int size, front, rear;
	Element []arr;
	
	public PriorityQue() {
		super();
		this.size = 3;
		this.front = rear = -1;
		arr = new Element[size];
	}	
	
	public PriorityQue(int size) {
		super();
		this.size = size;
		this.front = rear = -1;
		arr = new Element[size];
	}
	
	public boolean isEmpty() {
		return front == size-1?true:false;
	}
	public boolean isFull() {
		return rear == size-1? true:false;
	}
	
	public void enQueue(Element data) {
		if(isFull())
			System.out.println("Queue is full..");
		if(front == -1)
			front = 0;
		rear++;
		arr[rear] = data;
		
		for(int i = 0; i<=rear; i++) {
			for(int j = 0; j<rear-i; j++) {
				if(arr[j].prio < arr[j+1].prio) {
					Element temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public Element deQueue() {
		Element data = null;
		if(isEmpty())
			throw new QueException();
		data = arr[front];
		
		if(front == rear)
			front = rear = -1;
		front++;
		
		return data;
	}
	
	public void display() {
		if(front == -1)
			throw new QueException();
		for(int i = 0; i<=rear; i++) {
			System.out.println(arr[i].toString());
		}
	}
}




