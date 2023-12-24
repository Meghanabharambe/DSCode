package simpleLinkedList;

public class NodeStr {
	String data;
	NodeStr link;
	
	public NodeStr() {
		data = "None";
		link = null;
	}
	public NodeStr(String data) {
		super();
		this.data = data;
		link = null;
	}
	public String toString() {
		return data+" ";
	}
	
}
