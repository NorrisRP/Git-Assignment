
public class Math {
	
	public static double MathOperate(int num1, int num2, char oper) {
		switch(oper) {
		case '+':
			return(num1 + num2);
		case '-':
			return(num1 - num2);
		case '*':
			return(num1 * num2);
		case '/':
			return(num1 / num2);
		case '%':
			return(num1 % num2);
		default:
			System.out.println("invalid operator");
			return(-1);
		}
	}
}
