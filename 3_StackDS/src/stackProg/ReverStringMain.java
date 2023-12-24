package stackProg;

import java.util.Scanner;

public class ReverStringMain {

	public static void reverseStr(String str) {
	   ReverseString r1= new ReverseString(str.length());
		
	   		for(int i = 0; i<str.length(); i++) {
	   			r1.push(str.charAt(i));
	   		}
		 
	   		r1.dispaly();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		
		reverseStr(str);

	}

}
