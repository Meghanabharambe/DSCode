package queueProg;

public class Customer {
      private int id;
      private String name;
      
      public Customer() {
    	  
      }

      public Customer(int id, String name) {
		  super();
		  this.id = id;
		  this.name = name;
	  }
      
      public String toString() {
    	  return "id: "+id+" Name: "+name;
      }
     
}
