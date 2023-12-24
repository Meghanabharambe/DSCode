package dynamic_stack;

public class StackException extends RuntimeException{
	String msg;

	public StackException() {
		super();
		this.msg = "Stack is empty!!";
	}

	@Override
	public String getMessage() {
		return msg;
	}
	
	
}
