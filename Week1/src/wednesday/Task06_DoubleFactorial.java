package wednesday;

import java.math.BigInteger;
import java.util.Scanner;

public class Task06_DoubleFactorial {
	/*
	 * long doubleFac(int n); return E.g. if n=3, => (3!)! = 6! = 720
	 */
	public static BigInteger getFactorial(BigInteger num) {
		BigInteger result = BigInteger.ONE;
		while (!num.equals(BigInteger.ZERO)) {
			result = result.multiply(num);
			num = num.subtract(BigInteger.ONE);
		}
		return result;
	}

	public static BigInteger doubleFac(int n) {
		BigInteger bi = BigInteger.valueOf((long) n);
		return getFactorial(getFactorial(bi));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(doubleFac(n));
		sc.close();
	}
}
