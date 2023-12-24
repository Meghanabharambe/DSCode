package postfixOpe;

public class PostfixStack {
	int size;
	int top;
	int arr[];
	
	public PostfixStack(int size) {
		super();
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}
	
	public boolean isFull() {
		return top == size-1?true:false;
	}
	
	public boolean isEmpty() {
		return top == -1?true:false;
	}
	
	public void push(int data) {
		if(!isFull()) {
			top++;
			arr[top] = data;
		}
		else
			System.out.println("Stack is full...");
	}
	
	public int pop() {
		int data = -1;
		if(!isEmpty()) {
			data = arr[top];
			top--;
		}
		return data;
	}
}
