package stackProg;

public class ReverseString {
	private int size;
    private char[] arr;
    private int top;
    
    public ReverseString() {
   	 size = 3;
   	 arr = new char[size];
   	 top = -1;
    }
	public ReverseString(int size) {
		this.size = size;
		this.arr = new char[size];
		this.top = -1;
	}
	
	//Push operation
	public void push(char val) {
		if(top == size-1) {
			System.out.println("Stack is full...");
		}
		else {
			top++;
			arr[top] = val;
		}
	}
	
	//pop operation
	public char pop() {
		char data = '\0';
		if(top < 0) {
			return data;
		}
		else {
			data = arr[top];
			top--;
		}
		return data; 
	}
	
	//display
	public void dispaly() {
		for(int i = top; i>= 0; i--)
	       System.out.print(arr[i]);
	}
}
