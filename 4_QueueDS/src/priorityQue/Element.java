package priorityQue;

public class Element {
	int value, prio;

	public Element(int value, int prio) {
		super();
		this.value = value;
		this.prio = prio;
	}
	
	public String toString() {
		return "value - "+ value+" priority - "+prio;
	}
}
