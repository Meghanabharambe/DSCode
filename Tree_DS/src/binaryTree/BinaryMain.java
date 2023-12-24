package binaryTree;

import java.util.Scanner;

public class BinaryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree b1 = new BinaryTree();
		
		int ch;
		
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. add node");
			System.out.println("2. display");
			System.out.println("0. exit");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: 
				System.out.println("Enter data to insert into node ");
				int data = sc.nextInt();
				b1.addNode(data);
				break;
				
			case 2:
				b1.display();
				break;
				
			}
		}while(ch!=0);

	}

}
