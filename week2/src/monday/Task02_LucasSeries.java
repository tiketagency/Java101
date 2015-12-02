package monday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task02_LucasSeries {
	/*
	 * Lucas series
	 * 
	 * Because Fibonacci is way too trivial, implement the following functions
	 * that work with Lucas series:
	 * 
	 * int nthLucas(int n) -> returns the nth Lucas number Quick hint:
	 * 
	 * L(0) = 2 L(1) = 1 L(n) = L(n-1) + L(n-2)
	 */
	@Test
	public void fibNumberTest() {
		assertEquals(2, nthLucas(0));
		assertEquals(1, nthLucas(1));
		assertEquals(123, nthLucas(10));
		assertEquals(11, nthLucas(5));
		assertEquals(3010349, nthLucas(31));
		assertEquals(15127, nthLucas(20));
	}

	public static int nthLucas(int n) {
		if (n == 0) {
			return 2;
		}
		if (n == 1) {
			return 1;
		}
		return nthLucas(n - 1) + nthLucas(n - 2);
	}
}
