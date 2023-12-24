package postfixOpe;

public class PostfixMain {

	public static void main(String[] args) {
		PostfixOpe p1 = new PostfixOpe();
		int result = p1.postfixEva("945*+");
		
		if(result == -1) {
			System.out.println("Invalid expression");
		}
		else System.out.println("Calculation is: "+ result);
	}

}
