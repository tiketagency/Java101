package wednesday;

import java.math.BigInteger;
import java.util.Scanner;

public class Task07_KthFactorial {
	/*
	 * long kthFac(int k, int n); Get the kthFactorial of n. k is guaranteed to
	 * be positive. Bonus no "helper" methods, no recursion :)
	 */
	public static BigInteger kthFactorial(int k, int n) {
		BigInteger number = new BigInteger(n + "");
		BigInteger result = null;
		for (int i = 0; i < k; i++) {
			result = BigInteger.ONE;
			while (!number.equals(BigInteger.ZERO)) {
				result = result.multiply(number);
				number = number.subtract(BigInteger.ONE);
			}
			number = result;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		while (k <= 0) {
			System.out.println("Enter some number greater than 0");
			k = sc.nextInt();
		}
		System.out.printf("Enter a number to calculate his %d factorial%n", k);
		int n = sc.nextInt();
		System.out.println(kthFactorial(k, n));
		sc.close();
	}
}
