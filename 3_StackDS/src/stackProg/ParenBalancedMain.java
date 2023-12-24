package stackProg;

import java.util.Scanner;

public class ParenBalancedMain {
	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		str = sc.next();
		
		if(isBalanced(str)) {
			System.out.println("Parenthesis are balanced...");
		}
		else {
			System.out.println("Parenthesis are not balanced...");
		}

	}
	public static boolean isBalanced(String str) {
		boolean flag = true;
		Parenbalanced p1 = new Parenbalanced(str.length());
		
		//character var to check brackets
		char ch1, ch2;
		for(int i = 0; i<str.length(); i++) {
			ch1 = str.charAt(i);    // it will assign ch1 with one by one char from string
			
			if(ch1 == '(' || ch1 == '{' || ch1 == '[' || ch1 == '<') {
				p1.push(ch1);
			}
			else if(ch1 == ')' || ch1 == '}' || ch1 == ']' || ch1 == '>') {   
			    	ch2 = p1.pop();
				   
			    	//ch1 indicate next element in string and ch2 indicate previous i.e. ch1 = 2 then ch2 = 1;
			    	//it check closing brackets should not be present before its opening  
			    	
			    	if(ch1 == ')' && ch2 != '(' || ch1 == '}' && ch2 != '{' ||ch1 == ']' && ch2 != '[' || ch1 == '>' && ch2 != '<') {
					   flag = false;
					   break;
				   }					
			}
			else return false;
		}
		
		return flag;
		
	}

}
