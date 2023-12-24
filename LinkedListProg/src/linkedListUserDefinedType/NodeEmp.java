package linkedListUserDefinedType;

public class NodeEmp {
	private Employee data;
	private NodeEmp next;
	
	public NodeEmp(Employee data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	public void setNext(NodeEmp nxt) {
		next = nxt;
	}
	
	public NodeEmp getNext() {
		return next;
	}
	
	public void setEmp(Employee e1) {
		data = e1;
	}
	
	public Employee getEmp() {
		return data;
	}
	
	public String toString() {
		return data+" ";
	}
}
