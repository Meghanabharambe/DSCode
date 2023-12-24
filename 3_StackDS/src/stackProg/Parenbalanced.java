package stackProg;

public class Parenbalanced {
      private int size;
      private char arr[];
      private int top;
      
      
	public Parenbalanced(int size) {
		super();
		this.size = size;
		arr = new char[size];
		top = -1;
	}
	
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
	       System.out.print(arr[i]+" ");
	}

      
      
      
}
