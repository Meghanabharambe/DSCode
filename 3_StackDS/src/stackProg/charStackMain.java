package stackProg;

import java.util.Scanner;

public class charStackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		charStack c1 = new charStack(3);
	
		int ch;
		
		do {
			System.out.println("Enetr your choice: ");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. display");
			System.out.println("0. exit ");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("Enter value to store in stack: ");
				char val = sc.next().charAt(0);
				c1.push(val);
				
				break;
				
			case 2: 
				char data = c1.pop();
				if(data == 'f') {
					System.out.println("stack is empty..");
				}
				else
					System.out.println(data);
				
				break;
				
			case 3:
				c1.dispaly();
			}
			
		}while(ch != 0);
	}

}
