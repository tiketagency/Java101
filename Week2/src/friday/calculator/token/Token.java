package friday.calculator.token;

import friday.calculator.operators.Factorial;
import friday.calculator.operators.Operator;
import friday.calculator.operators.OperatorFactory;

public class Token {
	public static boolean isNumber(char ch) {
		return Token.isDigit(ch) || ch == '.';
	}

	public static boolean isFactorial(Operator op) {
		return op instanceof Factorial;
	}

	public static boolean isBracket(char c) {
		return c == '(' || c == ')';
	}

	public static boolean isClosingBracket(char token) {
		return token == ')';
	}

	public static boolean isOpenBracket(char token) {
		return token == '(';
	}

	public static boolean isDigit(char str) {
		return Character.isDigit(str);
	}

	public static boolean isOperator(char op) {
		Operator currentToken = OperatorFactory.use(op);
		return currentToken instanceof Operator || op == ')' || op == '(';
	}

	public static boolean detectMinusSign(String str, int index) {
		char current = str.charAt(index);
		if (current != '-') {
			return false;
		}
		if (index == 0 && current == '-') {
			return true;
		}
		char previous = str.charAt(index - 1);
		return isOperator(previous) && previous != ')' && previous != '!';
	}

	public static int priority(char c) {
		switch (c) {
		case '!':
			return 4;
		case '^':
			return 3;
		case '/':
			return 2;
		case '*':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		default:
			return 0;
		}
	}
}
