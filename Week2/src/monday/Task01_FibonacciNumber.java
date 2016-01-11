package monday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task01_FibonacciNumber {
	/*
	 * Fibonacci number
	 * 
	 * Implement a function long fibNumber(int n), which takes an integer n and
	 * returns a number, which is formed by concatenating the first n Fibonacci
	 * numbers.
	 * 
	 * Examples:
	 * 
	 * fibNumber(3) == 112 fibNumber(10) == 11235813213455
	 */
	@Test
	public void fibNumberTest() {
		assertEquals("0", fibNumber(0));
		assertEquals("112", fibNumber(3));
		assertEquals("11235813213455", fibNumber(10));
		assertEquals("11235", fibNumber(5));
		assertEquals("11235813", fibNumber(7));

	}

	public static String fibNumber(int n) {
		if (n == 0) {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		int a = 1;
		int b = 0;
		for (int i = 0; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
			sb.append(c);
		}
		return sb.toString();
	}
}
