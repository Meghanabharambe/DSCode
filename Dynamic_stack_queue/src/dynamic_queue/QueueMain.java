package dynamic_queue;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q1 = new Queue();
		
		int ch, data;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. enqueue");
			System.out.println("2. dequeue");
			System.out.println("3. display");
			System.out.println("0. exit");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter data to insert into queue: ");
				data = sc.nextInt();
				
				q1.enQueue(data);
				break;
				
			case 2:
				try {
					data = q1.deQueue();
					System.out.println(data);
				}
				catch(QueEmptyException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
			   System.out.println(q1.toString());
			    break;
			  
			}
			
			
		}while(ch!=0);

	}

}
