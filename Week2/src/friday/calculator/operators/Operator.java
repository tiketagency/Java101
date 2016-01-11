package friday.calculator.operators;

public abstract class Operator {
	public abstract double compute(double a, double b);

	public short priority;
}
