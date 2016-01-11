package monday.power;

public class Power {
	static <T extends Number> Number power(T base, int exponent) {
		return Math.pow((int) base, exponent);
	}

	public static void main(String[] args) {
		System.out.println(power(10, 2));
	}
}
