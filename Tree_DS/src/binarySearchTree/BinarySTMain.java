package binarySearchTree;

import java.util.Scanner;

import binaryTree.BinaryTree;

public class BinarySTMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryST b1 = new BinaryST();
		
		int ch, data;
		
		do {
			System.out.println();
			System.out.println("Enter your choice: ");
			System.out.println("1. add node");
			System.out.println("2. display");
			System.out.println("3. delete");
			System.out.println("4. level wise printing");
			System.out.println("5. search");
			System.out.println("6. Height of tree");
			System.out.println("7. Smallest data ");
			System.out.println("8. Largest data");
			System.out.println("0. exit");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: 
				System.out.println("Enter data to insert into node ");
				data = sc.nextInt();
				b1.addNode(data);
				break;
				
			case 2:
				b1.display();
				break;
				
			case 3:
				System.out.println("Enter data to delete: ");
				data = sc.nextInt();
				b1.deleteNode(data);
				break;
				
			case 4:
				System.out.println("Level wise printing: ");
				b1.printLevelWise();
				break;
				
			case 5:
				System.out.println("Enter data to search: ");
				data = sc.nextInt();
				if(b1.search(data))
					System.out.println("Data found...");
				else System.out.println("Data not found...");
				break;
				
			case 6:
				int height = b1.findHeight(b1.root);
				System.out.println("Height is: "+height);
				break;
				
			case 7:
				int lowest = b1.lowestData();
				System.out.println("Smallest data is: "+lowest);
				break;
				
			case 8:
				int largest = b1.largestData();
				System.out.println("Largest data is: "+largest);
				break;
				
			}
		}while(ch!=0);

	}

}
