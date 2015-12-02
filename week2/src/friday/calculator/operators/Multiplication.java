package friday.calculator.operators;

public class Multiplication extends Operator {
	protected static final char MULTIPLICATION = '*';

	public Multiplication() {
		super.priority = 2;
	}

	@Override
	public double compute(double a, double b) {
		return a * b;
	}
}
