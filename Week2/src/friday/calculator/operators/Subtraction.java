package friday.calculator.operators;

public class Subtraction extends Operator {
	protected static final char MINUS = '-';

	public Subtraction() {
		super.priority = 1;
	}

	@Override
	public double compute(double a, double b) {
		return a - b;
	}
}
