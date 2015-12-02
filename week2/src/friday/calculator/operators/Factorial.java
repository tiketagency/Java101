package friday.calculator.operators;

public class Factorial extends Operator {
	protected static final char FACTORIAL = '!';

	public Factorial() {
		super.priority = 3;
	}

	@Override
	public double compute(double a, @Deprecated double b) {
		long factorial = 1;
		for (int i = 1; i <= a; i++)
			factorial = factorial * i;

		return factorial;
	}

	public static char getFactorial() {
		return FACTORIAL;
	}
}