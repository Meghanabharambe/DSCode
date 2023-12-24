package circularLinkedList;

import java.util.Scanner;

public class CircularLLMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of linkedList: ");
		int size = sc.nextInt();
		
		CircularLL ll = new CircularLL();
		ll.createLinkedList(size);
		int data;
		
		int ch;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Add at begi");
			System.out.println("2. Add at end");
			System.out.println("3. Delete at begi");
			System.out.println("4. Delete at mid");
			System.out.println("5. Delete at end");
			System.out.println("6. size");
			System.out.println("7. display");
			System.out.println("0. exit");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
				     System.out.println("Enter data to Add: ");
				     data = sc.nextInt();
				     ll.addBeg(data);
				     break;
				    
				case 2:
					System.out.println("Enter data to Add: ");
				     data = sc.nextInt();
				     ll.addEnd(data);
				     break;
				    
				case 3:
				    ll.deleteBegi();
				     break;
					
				case 4:
					ll.deleteEnd();
				    break;
				    
				case 5:
					//l1.printRev();
					break;
					
				case 6:
					ll.display();
					break;
			}
		}while(ch!=0);

	}

}
