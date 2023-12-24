package stackProg;

public class Book {
      private int bno;
      private String name;
      

	public Book() { }

	public Book(int bno, String name) {
		super();
		this.bno = bno;
		this.name = name;
	}
	public void display() {
		System.out.println(bno + " "+ name);
	}
      
      
}
