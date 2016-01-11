package monday.devision;

import java.math.BigInteger;

public class Devision {

	public static <T1 extends Number, T2 extends Number> Number devision(T1 n, T2 m) {
		if (n instanceof Double) {
			return n.doubleValue() / m.doubleValue();
		} else if (m instanceof Double) {
			return n.doubleValue() / m.doubleValue();
		}
		BigInteger bi = new BigInteger(n + "");
		BigInteger bi1 = new BigInteger(m + "");
		return bi.divide(bi1);
	}

	public static void main(String[] args) {
		System.out.println(devision(9222222222222222222L, 222222222222222222L));
	}
}
