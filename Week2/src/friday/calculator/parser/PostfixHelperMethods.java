package friday.calculator.parser;

import java.util.Stack;

import friday.calculator.token.Token;

public class PostfixHelperMethods {

	public static String appendMinus(String str, int index) {
		if (Token.isDigit(str.charAt(index)) || str.charAt(index) != '-') {
			return " ";
		}
		return "-" + appendNumbers(str, index + 1);
	}

	public static String appendNumbers(String str, int index) {
		String s = "";
		while (index < str.length() && Token.isNumber(str.charAt(index))) {
			char current = str.charAt(index);
			s += current;
			index++;
		}
		return s;
	}

	public static StringBuilder appendOperator(Stack<Character> operators,
			char currentToken, StringBuilder postfix) {
		char stackToken = operators.peek();
		if (!Token.isBracket(currentToken)
				&& Token.priority(currentToken) <= Token.priority(stackToken)) {
			while (!operators.isEmpty()
					&& Token.priority(operators.peek()) >= Token
							.priority(currentToken)) {
				postfix.append(" " + operators.pop());
			}
		}
		return postfix;
	}
}
