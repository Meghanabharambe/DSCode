package dynamic_queue;

public class QueEmptyException extends RuntimeException{
	String msg;

	public QueEmptyException() {
		msg = "Stack is empty!!";
	}

	@Override
	public String getMessage() {
		return msg;
	}
	
	
	
}
