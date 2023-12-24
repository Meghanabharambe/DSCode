package dynamic_stack;

public class DStack {
	NodeS top;

	public DStack() {
		super();
		this.top = null;
	}
	
	public void push(int data) {
		NodeS n1 = new NodeS(data);
		if(top == null)
			top = n1;
		else {
			n1.next = top;
			top = n1;
		}
	}
	
	public int pop() {
		int data;
		if(top == null)
			throw new StackException();
		data = top.data;
		top = top.next;
		
	   return data;
	}
	
	public void display() {
		if(top == null)
			throw new StackException();
		NodeS move;
		for(move = top; move!=null; move = move.next)
			System.out.println(move.data);
	}
	
}
