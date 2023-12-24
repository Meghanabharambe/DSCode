package DSIntro;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int num = ac.nextInt();
		
		int num1 = palindromeNum(num);
		if(num == num1) {
			System.out.println("Number is Palindrome...");
		}
		else System.out.println("Number is not Palindrome...");

	}
	public static int palindromeNum(int num) {
		int rev = 0;
		while(num > 0) {
			int mod = num%10;
			rev = rev*10 + mod;
			num = num/10;
		}
		return rev;
	}

}
