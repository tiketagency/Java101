package friday.calculator.operators;

public class OperatorFactory {

	public static Operator use(char op) {
		switch (op) {
		case Sum.PLUS:
			return new Sum();
		case Subtraction.MINUS:
			return new Subtraction();
		case Devision.DEVISOR:
			return new Devision();
		case Multiplication.MULTIPLICATION:
			return new Multiplication();
		case Power.POWER:
			return new Power();
		case Factorial.FACTORIAL:
			return new Factorial();
		default:
			return null;
		}
	}
}
