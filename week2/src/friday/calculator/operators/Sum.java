package friday.calculator.operators;

public class Sum extends Operator {
	protected static final char PLUS = '+';

	public Sum() {
		super.priority = 1;
	}

	@Override
	public double compute(double a, double b) {
		return a + b;
	}
}
