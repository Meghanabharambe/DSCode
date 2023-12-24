package queueProg;

import java.util.Scanner;

public class queueCustMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		queueCust q1 = new queueCust(3);
		
		int ch;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert ");
			System.out.println("2. Remove ");
			System.out.println("3. display ");
			System.out.println("0. exit ");
			ch = sc.nextInt();
			
			switch (ch) {
				case 1: System.out.println("Enter cid and name to insert: ");
				        int id = sc.nextInt();
				        String name = sc.next();
				        Customer c1 = new Customer(id, name);
				        
				        q1.enqueue(c1);
				  
				        break;
				        
				case 2: Customer data = q1.dequeue();
				        if(data == null)
				        	System.out.println("queue is empty...");
				        else
				        	System.out.println("deleted element is "+ data);
				        break;
				       
				case 3: q1.display();
						break;
			}
			
		}while(ch!=0);


	}

}
