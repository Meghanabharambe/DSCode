package stackProg;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		MySatck m1 = new MySatck(3);
		
		Scanner sc = new Scanner(System.in);
				
		int ch;
		do {
			System.out.println();
			System.out.println("Enetr your choice: ");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. display");
			System.out.println("0. exit ");
			ch = sc.nextInt();
			
			switch(ch) {
			   
				case 1:
					System.out.println("Enter book id and book name: ");
					int bid = sc.nextInt();
					String bname= sc.next();
					
					m1.push(bid, bname);
						
					break;
					
				case 2: 
					Book b1 = m1.pop();
					if(b1 == null) {
						System.out.println("stack is empty..");
					}
					else
						b1.display();
					
					break;
					
				case 3:
					m1.display();
			}
			
		}while(ch!=0);

	}

}
