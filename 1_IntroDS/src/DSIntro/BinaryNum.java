package DSIntro;

import java.util.Scanner;

public class BinaryNum {

	public static int binToDeci(int num, int cnt) {
		int deci = 0;
		
		for(int i = 0; i<cnt; i++) {
			int mod = num%10;
			deci += mod*Math.pow(2, i);
			num = num/10;
		}
		
		return deci;
	}
	
	public static int count(int num) {
		int cnt = 0;
		while(num>0) {
			num = num / 10;
			cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Binary number: ");
		int binaryNum = sc.nextInt();
		
		int cnt = count(binaryNum);
		System.out.println("Decimal is: "+binToDeci(binaryNum, cnt));
		
	}

}
