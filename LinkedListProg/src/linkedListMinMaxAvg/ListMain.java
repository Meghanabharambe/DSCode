package linkedListMinMaxAvg;

import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of linkedList: ");
		int size = sc.nextInt();
		
		LinkedList ls = new LinkedList();			
		ls.createLinkedList(size);
		
		int ch;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Display");
			System.out.println("2. Minimum");
			System.out.println("3. Maximum");
			System.out.println("4. Average");
			System.out.println("5. Rotate Left");
			System.out.println("6. Rotate right");
			System.out.println("0. Exit");
			
			ch = sc.nextInt();
			
			switch(ch) {
				case 1: 
					ls.display();
				   	break;
				
				case 2: 
					System.out.println("Minimum element is: "+ls.findMin());					
					break;
				
				case 3: 
					System.out.println("Maximum element is: "+ls.findMax());
					break;
				
				case 4: 
					System.out.println("Average of all elements is: "+ls.findAvg());
					break;	
						
				case 5: 
					System.out.println("Enter how many places you want to rotate to left: ");
					int key = sc.nextInt();
					ls.rotateLeft(key);
					break;	
					
				case 6: 
					System.out.println("Enter how many places you want to rotate to right: ");
					int k = sc.nextInt();
					ls.rotateRight(k);
					break;	
			}

	 }while(ch!=0);
		
	}
}
