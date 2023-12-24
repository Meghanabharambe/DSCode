package DSIntro;

import java.util.Scanner;

public class FiboSeries {

    public static void fiboPrint(int num) {
    	int num1 = 0, num2 = 1;
    	int cnt = 0;
    	
    	while(cnt<num) {
    		System.out.print(num1+" ");
    		
    		int temp = num1 + num2;
    		num1 = num2;
    		num2 = temp;
    		cnt++;
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		fiboPrint(num);

	}

}
