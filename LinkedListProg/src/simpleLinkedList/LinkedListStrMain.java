package simpleLinkedList;

public class LinkedListStrMain {

	public static void main(String[] args) {
		LinkedListStr ls1 = new LinkedListStr();
		
		ls1.createLinkedList("Meghana");
		ls1.display();
		System.out.println();
		ls1.createLinkedList("Bharambe");
		ls1.display();
		
		ls1.size();
		ls1.addNodeBeg("Hello");
		ls1.size();

	}

}
