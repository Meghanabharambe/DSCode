package stackProg;

public class MySatck {
       private Book b[]; 
       private int size;
       private int top;
       
	public MySatck(int size) {
		super();
		this.size = size;
		b = new Book[size];
		top = -1;
	}
	public void push(int id, String name) {
		if(top >= size-1) {
			System.out.println("Stack is full...");
		}
		else {
			top++;
			b[top] = new Book(id, name);
		}
	}
	public Book pop() {
		Book b1 = null;
		if(top < 0) {
			return b1;
		}
		else {
			b1 = b[top];
			top--;
		}
		return b1;
	}
	
	public void display() {
		for(int i = top; i>=0; i--) {
			b[i].display();
		}
	}
	
       
}
