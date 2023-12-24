package doublyLinkedList;

import java.util.Scanner;

public class DoublyLLMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of linkedList: ");
		int size = sc.nextInt();
		
		DoublyLL l1 = new DoublyLL();
		l1.createLinkedList(size);
		l1.display();
		//l1.insert(2, 30);
		//l1.deleteData(20);
		//l1.modify(30,  60);
		//l1.printRev();
		
		int ch;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert at given pos");
			System.out.println("2. Delete element by data");
			System.out.println("3. Delete element by pos");
			System.out.println("4. Modify");
			System.out.println("5. Print in reverse order");
			System.out.println("6. display");
			System.out.println("0. exit");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
				     System.out.println("Enter position and data to insert: ");
				     int pos = sc.nextInt();
				     int data = sc.nextInt();
				     l1.insert(pos, data);
				     break;
				    
				case 2:
					System.out.println("Enter data to delete from list: ");
				     int data1 = sc.nextInt();
				     l1.deleteData(data1);
				     break;
				    
				case 3:
					System.out.println("Enter position to delete from list ");
				     int poss = sc.nextInt();
				     l1.deletepos(poss);
				     break;
					
				case 4:
					System.out.println("Enter olddata and newdata to modify: ");
					int olddata = sc.nextInt();
					int newdata = sc.nextInt();
					
				    l1.modify(olddata, newdata);
				    break;
				    
				case 5:
					l1.printRev();
					break;
					
				case 6:
					l1.display();
					break;
			}
		}while(ch!=0);
	}

}
