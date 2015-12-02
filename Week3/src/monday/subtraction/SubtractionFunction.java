package monday.subtraction;

import java.math.BigInteger;

public class SubtractionFunction {

	public static <T1 extends Number, T2 extends Number> Number subtraction(T1 n, T2 m) {
		if (n instanceof Double) {
			return n.doubleValue() - m.doubleValue();
		} else if (m instanceof Double) {
			return n.doubleValue() - m.doubleValue();
		}
		BigInteger bi = new BigInteger(n + "");
		BigInteger bi1 = new BigInteger(m + "");
		return bi.subtract(bi1);
	}

	public static void main(String[] args) {
		System.out.println(
				subtraction(new BigInteger("21111111111111111111111111"), new BigInteger("1222222222222222222222")));
		System.out.println(subtraction(5.22, 2.5));
		System.out.println(subtraction(new BigInteger("21111111111111111111111111"), 2.2222));
	}
}
