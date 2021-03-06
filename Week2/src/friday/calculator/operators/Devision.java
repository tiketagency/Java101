package friday.calculator.operators;

public class Devision extends Operator {
	protected static final char DEVISOR = '/';

	public Devision() {
		super.priority = 2;
	}

	@Override
	public double compute(double a, double b) {
		return a / b;
	}

	public Operator getOperator() {
		return this;
	}
}
