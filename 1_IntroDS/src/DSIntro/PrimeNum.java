package DSIntro;

import java.util.Scanner;

public class PrimeNum {
	public static boolean checkPrime(int num) {
		
		    boolean flag = true;
			for(int i = 2; i<=num/2; i++) {
				if(num % i == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return true;
			}
			else return false;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int num = sc.nextInt();
		
		for(int i = 2; i<num; i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
		  }
	}

}
}