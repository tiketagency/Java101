package monday.multiplication;

import java.math.BigInteger;

public class Multiplication {
	public static <T1 extends Number, T2 extends Number> Number multiplication(T1 n, T2 m) {
		if (n instanceof Double) {
			return n.doubleValue() * m.doubleValue();
		} else if (m instanceof Double) {
			return n.doubleValue() * m.doubleValue();
		}
		BigInteger bi = new BigInteger(n + "");
		BigInteger bi1 = new BigInteger(m + "");
		return bi.multiply(bi1);
	}

	public static void main(String[] args) {
		System.out.println(multiplication(999999999999999999L, 999999999999999999L));
	}

}
