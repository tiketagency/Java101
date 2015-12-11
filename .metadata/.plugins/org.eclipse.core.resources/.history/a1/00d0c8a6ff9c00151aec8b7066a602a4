package friday.calculator.parser;

import java.util.Stack;
import friday.calculator.operators.Operator;
import friday.calculator.operators.OperatorFactory;
import friday.calculator.token.Token;

public class Calculator {
	private String expression;

	public Calculator(String expression) {
		this.expression = new PostfixConvertor(expression).getPostfix();
	}

	public boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public double start() {
		String[] postfix = expression.split(" ");
		Stack<Double> result = new Stack<>();
		for (int i = 0; i < postfix.length; i++) {
			String current = postfix[i];
			Operator operator = OperatorFactory.use(postfix[i].charAt(0));
			if (isNumeric(current)) {
				result.push(Double.parseDouble(current));
			} else {
				double a = result.pop();
				double b = 0;
				if (!Token.isFactorial(operator)) {
					b = result.pop();
				}
				switch (current) {
				case "+":
					result.push(operator.compute(a, b));
					break;
				case "!":
					result.push(operator.compute(a, b));
					break;
				default:
					result.push( operator.compute(b, a));
				}
			}
		}
		return result.pop();
	}
}
