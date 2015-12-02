package friday.calculator.operators;

public class Power extends Operator {
	protected static final char POWER = '^';

	public Power() {
		super.priority = 4;
	}

	@Override
	public double compute(double a, double b) {
		return Math.pow(a, b);
	}
}
