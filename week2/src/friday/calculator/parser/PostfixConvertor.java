package friday.calculator.parser;

import java.util.Stack;
import friday.calculator.token.Token;

public class PostfixConvertor {
	private String postfix;

	public PostfixConvertor(String infix) {
		postfix = toPostfix(infix);
	}

	public PostfixConvertor() {
	}

	public String toPostfix(String expr) {
		expr = expr.replaceAll(" ", "");
		Stack<Character> operators = new Stack<>();
		StringBuilder postfix = new StringBuilder();
		for (int i = 0; i < expr.length(); i++) {
			char currentToken = expr.charAt(i);
			if (Token.isOperator(currentToken)) {
				// check whether minus is sign or operator
				if (Token.detectMinusSign(expr, i)) {
					String n = PostfixHelperMethods.appender(expr, i);
					postfix.append(" " + n);
					i += n.length() - 1;
					continue;
				}
				if (operators.isEmpty()) {
					operators.push(currentToken);
					continue;
				}
				if (Token.isClosingBracket(currentToken)) {
					while (!operators.isEmpty() && !Token.isOpenBracket(currentToken)) {
						currentToken = operators.pop();
						postfix.append(" " + currentToken);
					}
					continue;
				}
				postfix = PostfixHelperMethods.appendOperator(operators, currentToken, postfix);
				operators.push(currentToken);
			} else {
				String n = PostfixHelperMethods.appendNumbers(expr, i);
				postfix.append(" " + n);
				i += n.length() - 1;
			}
		}

		while (!operators.isEmpty()) {
			postfix.append(" " + operators.pop());
		}
		return postfix.toString().trim().replaceAll("\\( ", "");
	}

	public String getPostfix() {
		return postfix;
	}
}
