package circularQueueProg;

import java.util.Scanner;

public class CircularQueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularQueue q1 = new CircularQueue(3);
		
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
				        
				        q1.enqueue(num);
				        break;
				case 2: int data = q1.dequeue();
				        if(data == -999)
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
