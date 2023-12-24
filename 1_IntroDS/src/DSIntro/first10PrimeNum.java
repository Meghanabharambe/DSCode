package DSIntro;

import java.util.Scanner;

public class first10PrimeNum {
	
	public static boolean checkPrime(int num) {
		boolean flag = true;
		for(int i = 2; i<=num/2; i++) {
			if(num % i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			return flag;
		}
		else return false;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter how many prime number required: ");
		int no = sc.nextInt();
		
		int num = 2;
		while(no > 0) {
			if(checkPrime(num)) {
				System.out.print(num+" ");
				no--;
			}
			num++;
		}
		
	}

}
