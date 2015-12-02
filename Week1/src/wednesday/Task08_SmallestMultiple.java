package wednesday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task08_SmallestMultiple {
	/*
	 * Find the smallest (positive) number, that can be divided by each of the
	 * numbers from 1 to upperBound.
	 */
	@Test
	public void testGetSmallestMultiple() {
		assertEquals(2520, smallestMultiple(10));
		assertEquals(232792560, smallestMultiple(20));
		assertEquals(60, smallestMultiple(6));
	}

	public static long smallestMultiple(int upperbound) {
		long answer = 1;
		for (int i = 2; i <= upperbound; i++) {
			answer = lcm(answer, i);
		}
		return answer;
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static long lcm(long a, int b) {
		return b * (a / gcd(a, b));
	}
}
