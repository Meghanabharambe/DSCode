package linkedListOpera;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of linkedList: ");
		int size = sc.nextInt();
		
		LinkedList ls = new LinkedList();			
		ls.createLinkedList(size);
		
		//ls.deleteByData(20);
		//ls.deleteBypos(2);
		//ls.size();
		//ls.reverseList(ls.head);
		//ls.insertAtPos(2, 30);
		//ls.display();
		//ls.insertData(20, 22);
		//ls.display();
		//ls.midElement();
		
		int ch;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Delete element by position");
			System.out.println("2. Delete element by data");
			System.out.println("3. Reverse linkedlist by recursionFunc");
			System.out.println("4. Insert at position");
			System.out.println("5. Insert given data");
			System.out.println("6. Find mid of linkedlist");
			System.out.println("7. display");
			System.out.println("8. createSortedList");
			System.out.println("9. AddbothSide");
			System.out.println("10. Reverse linkedList");
			System.out.println("11. Display data from given position");
			System.out.println("0. exit");
			
			ch = sc.nextInt();
			
			switch(ch) {
				case 1: System.out.println("Enter position to delete data: ");
				    int pos = sc.nextInt();
				   	ls.deleteBypos(pos);
				   	break;
				
				case 2: System.out.println("Enter data to delete: ");
					int data = sc.nextInt();
					ls.deleteByData(data);
					break;
				
				case 3: ls.reverseList(ls.head);
						break;
				
				case 4: System.out.println("Enter position and data to insert into linkedlist: ");
					int data1 = sc.nextInt();
					int pos1 = sc.nextInt();
					ls.insertAtPos(pos1, data1);
					break;
				
				case 5: System.out.println("Enter old data and new data to insert into linked list: ");
					int  olddata = sc.nextInt();
					int newdata = sc.nextInt();
					ls.insertData(olddata, newdata);
					break;
				
				case 6: ls.midElement();
						break;
				
				case 7: ls.display();
						break;
				
				case 8:
					LinkedList ls1 = new LinkedList();
					ls1.sortedList(5);
					ls1.display();
					break;
					
				case 9:
					LinkedList ls2 = new LinkedList();
					ls2.addBothSide(10);
					ls2.display();
					break;
					
				case 10:
					ls.revList();
					ls.display();
				    break;
				    
				case 11:
					System.out.println("Enter position to display from: ");
					int poss = sc.nextInt();
					ls.displayNth(poss);
					break;
			}
			
		}while(ch != 0);
	} 

}
