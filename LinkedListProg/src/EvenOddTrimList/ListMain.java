package EvenOddTrimList;

public class ListMain {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.createList(10);
		l1.display();
		l1.printEvenOdd();
		
		l1.trimList(2, 3);
	}

}
