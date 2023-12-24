package arrayOpera;

import java.util.Scanner;

class Book{
		private int bookid;
		private String bookName;
		private double price;
		
		public Book(int bookid, String bookName, double price) {
			super();
			this.bookid = bookid;
			this.bookName = bookName;
			this.price = price;
		}
		public int getId() {
			return bookid;
		}
		public void setID(int id) {
			this.bookid = id;
		}
		public String getName(){
			return bookName;
		}
		public void setName(String name) {
			this.bookName = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double p) {
			this.price = p;
		}
		
		public String toString() {
			return "bookName: "+bookName + "  bookId: "+ bookid + " Price: " + price;
		}
	}
		
public class BookClass {
	public static void main(String[] args) {
		Book books[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of book array: ");
		int no = sc.nextInt();
		books = new Book[no];
		
		int bookid, ch, cnt = 0;
		String name;
		double price;
		
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Accept record");
			System.out.println("2. Display record");
			System.out.println("3. Modify");
			System.out.println("4. Delete");
			System.out.println("5. Search");
			System.out.println("0. Exit");
			ch = sc.nextInt();
			
			switch(ch) {
			
				case 1:
					System.out.println("Enter Bookid: ");
					bookid = sc.nextInt();
					System.out.println("Enter Bookname: ");
					name = sc.next();
					System.out.println("Enetr price: ");
					price = sc.nextDouble();
					
					books[cnt++] = new Book(bookid, name, price);
					break;
				
				case 2:
					for(int i = 0; i<cnt; i++) {
						System.out.println(books[i]);
					}
					break;
					
				case 3:
					System.out.println("Enter index to modify data: ");
					int num = sc.nextInt();
					
					for(int i = 0; i<books.length; i++) {
						if(books[i].getId() == num) {
							System.out.println("Enter Bookid: ");
							bookid = sc.nextInt();
							System.out.println("Enter Bookname: ");
							name = sc.next();
							System.out.println("Enetr price: ");
							price = sc.nextDouble();
							
							books[i].setID(bookid);
							books[i].setName(name);
							books[i].setPrice(price);
							
							break;	
						}
							
					}
					break;
				
				case 4:
					System.out.println("Enetr index to delete record: ");
					int ind = sc.nextInt();
					for(int i = 0; i<no; i++) {
						if(books[i].getId() == ind) {
							cnt--;
							books[i] = books[ind];
						}
					}
				break;
				
				case 5: 
					System.out.println("Enter index to display record: ");
					int index = sc.nextInt();
					for(int i = 0; i<books.length; i++) {
						if(books[i].getId() == index) {
							books[i].toString();
						}
						
				}
			}
			
		}
		while(ch!=0);
	}

}
