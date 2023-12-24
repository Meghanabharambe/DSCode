package priorityQue;

import java.util.Scanner;

import queueProg.QueueInt;

public class PriorityQueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQue q1 = new PriorityQue(4);
		
		int ch;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert ");
			System.out.println("2. Remove ");
			System.out.println("3. display ");
			System.out.println("0. exit ");
			ch = sc.nextInt();
			
			switch (ch) {
				case 1: System.out.println("Enter number to insert: ");
				        int num = sc.nextInt();
				        System.out.println("Enter priority: ");
				        int prio = sc.nextInt();
				        
				        q1.enQueue(new Element(num, prio));
				        break;
				        
				case 2: try {
					        Element data = q1.deQueue();
				        	System.out.println("deleted element is "+ data);
						}
				      catch(QueException e) {
				    	  System.out.println(e.getMessage());
				      }
				        break;
				       
				case 3: q1.display();
						break;
			}
			
		}while(ch!=0);

	}

}
