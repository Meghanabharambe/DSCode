package DSIntro;

import java.util.Scanner;

public class PerfectNum {

	public static int factors(int num) {
		int sum = 0;
		for(int i = 1; i<=num/2; i++) {
			if(num%i == 0) {
				sum = sum+i;
			}
		}
		return sum;
		 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int sum = factors(num);
		if(sum == num) {
			System.out.println("Number is Perfect number..");
		}
		else System.out.println("Number is not perfect number..");

	}

}
