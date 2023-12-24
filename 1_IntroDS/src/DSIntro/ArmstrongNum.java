package DSIntro;

public class ArmstrongNum {
	
	public static int contDigit(int num) {
		int cnt = 0;
		if(num < 10)
			return 1;
		else {
		while(num>0) {
			num = num / 10;
			cnt++;
		}
	 }
		return cnt;
}
	
	public static int power(int base, int index) {
		int res = 1;
		for(int i = 1; i<=index; i++) {
			res = res * base;
		}
		return res;
}
	
	public static void main(String[] args) {
		
		    for(int num = 1; num<10000; num++) {
		    	int j = num;
		    	int i = num;
		    	int cnt = contDigit(num);
		    	int sum = 0;
			
		    	while(i>0) {
		    		int mod = i % 10;
		    		i = i/10;
		    		sum = sum + power(mod, cnt);
		    	}
		    	if(j == sum)
		    		System.out.print(j+" ");
		    }
		} 
	}
