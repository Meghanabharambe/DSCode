package priorityQue;

public class QueException extends RuntimeException{
	String msg;

	public QueException() {
		msg = "Stack is empty!!";
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
