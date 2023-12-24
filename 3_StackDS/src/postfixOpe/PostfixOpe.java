package postfixOpe;

public class PostfixOpe {
	public PostfixOpe() {
		
	}
	public boolean isOperator(char ch) {
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%')
			return true;
		else return false;
	}
	
	public int postfixEva(String str){
		PostfixStack s1 = new PostfixStack(str.length());
		int res = -1;
		char ch;
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {         //ch >= 48 && ch <= 57
				s1.push((int)ch - (int)'0');
			}
			else if(isOperator(ch)) {
				int no2 = s1.pop();
				int no1 = s1.pop();
				
				switch(ch) {
					case '+':  res = no1 + no2;
						break;
						
					case '-': res = no1 - no2;
						break;
						
					case '*': res = no1 * no2;
						break;
						
					case '/': res = no1 / no2;
						break;
					
					case '%': res = no1 % no2;
						break;
				}
				
				s1.push(res);
			}
			else return res;
		}
		res = s1.pop();
		return res;
	}
}
