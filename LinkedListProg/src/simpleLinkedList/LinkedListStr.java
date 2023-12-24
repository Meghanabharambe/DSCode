package simpleLinkedList;

public class LinkedListStr {
	NodeStr head;

	public LinkedListStr() {
		super();
		head = null;
	}
	
	public void createLinkedList(String str) {
		addNode(str);
	}
	public void addNode(String str) {
		NodeStr record = new NodeStr(str);
		
		if(head == null)
			head = record;
		else {
			NodeStr move;
			for(move = head; move.link != null; move = move.link);
			    move.link = record;
		}
	}
	public void display() {
		NodeStr move;
		for(move = head; move.link != null; move = move.link) {
			System.out.println(move.data);
		}
		if(move.link == null)
			System.out.println(move.data);
				
	}
	
	public void addNodeBeg(String str) {
		NodeStr record = new NodeStr(str);
		
		if(head == null)
			head = record;
		else {
			record.link = head;
			head = record;
		}
		
		System.out.println("Data added at begi "+head.data);
	}
	
	public void addNodeEnd(String str) {
		NodeStr rec = new NodeStr(str);
		if(head == null)
			head = rec;
		else {
			NodeStr move;
			for(move = head; move.link != null; move = move.link);
			    move.link = rec;
			    System.out.println("Data added at End "+move.data);
		  } 
			
	}
	
	public void printFirstNode() {
		if(head == null)
			System.out.println("Linked list is empty..");
		else {
			System.out.println("First element is: "+ head.data);
		}
	}
	
	public void printLastNode() {
		if(head == null)
			System.out.println("Linked list is empty..");
		else {
			NodeStr move;
			for(move = head; move.link != null; move = move.link);
			   System.out.println("Last element is: "+ move.data);
		}
	}
	
	public int size() {
		int cnt = 1;
		NodeStr move;
		for(move = head; move.link != null; move = move.link) {
			cnt++;
		}
		
		System.out.println(cnt);
		return cnt;
	}
	
	public void modify(String oldstr, String newstr) {
		NodeStr move;
		for(move = head; move.link != null; move = move.link) {
			if(move.data == oldstr)
				move.data = newstr;
		}
		if(move.link == null) {
			if(move.data == oldstr)
				move.data = newstr;
		}
	}
	
	public void modify(int pos, String newstr) {
		if(pos<=0 || pos>size()) {
			System.out.println("Position is not present in linked list ");
		}
		else {
			NodeStr move = head;
			for(int i = 1; i<pos; i++) {
				move = move.link;
			}
				move.data = newstr;
			}
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
