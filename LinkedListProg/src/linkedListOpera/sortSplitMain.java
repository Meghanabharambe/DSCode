package linkedListOpera;

import java.util.Scanner;

public class sortSplitMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of linkedList: ");
		int size = sc.nextInt();
		
		sortSplitMerge ls = new sortSplitMerge();				
		ls.createLinkedList(size);
		
		//ls.display();
		//ls.sort();
		//ls.display();
		//ls.split();
		
		//sortSplitMerge list1 = new sortSplitMerge();
		//list1.createLinkedList(5);
		//list1.display();
		
		//sortSplitMerge list2 = new sortSplitMerge();
		//list2.createLinkedList(5);
		//list2.display();
		
		//list1.merge(list2);
		//list1.display();
		
		int ch;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. sort");
			System.out.println("2. split");
			System.out.println("3. merge");
			System.out.println("4. display");
			System.out.println("0. exit");
			
			ch = sc.nextInt();
			
			switch(ch) {
				case 1: 
					ls.sort();
					break;
					
				case 2: 
					ls.split();
					break;
					
				case 3:
					sortSplitMerge list1 = new sortSplitMerge();
					System.out.println("Enter size of list: ");
					int s1 = sc.nextInt();
					list1.createLinkedList(s1);
					
					sortSplitMerge list2 = new sortSplitMerge();
					System.out.println("Enter size of list: ");
					int s2 = sc.nextInt();
					list2.createLinkedList(s2);
					
					list1.merge(list2);
					list1.display();
					break;
					
				case 4: 
					ls.display();
					break;
			}
			
		}while(ch!=0);

	}

}
