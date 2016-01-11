package wednesday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Task01_IsOdd {
	/*
	 * boolean isOdd(int n) Return whether n is an odd number
	 */

	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}

	@Test
	public void isOddTests() {
		assertTrue(isOdd(223));
		assertTrue(isOdd(27));
		assertFalse(isOdd(0));
		assertFalse(isOdd(12));
		assertTrue(isOdd(3));
	}
}
