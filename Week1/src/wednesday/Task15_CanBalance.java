package wednesday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task15_CanBalance {
	/*
	 * Can balance?
	 * 
	 * boolean canBalance(int[] numbers)
	 * 
	 * canBalance({1, 1, 1, 2, 1}) → true canBalance({2, 1, 1, 2, 1}) → false
	 * canBalance({10, 10}) → true
	 * 
	 * Return true if there is an element in the array, where you can split the
	 * array in half and the sum of left side would be equal to the sum of the
	 * right part.
	 */
	@Test
	public void testCanBalance() {
		assertTrue(canBalance(new int[] { 1, 1, 1, 2, 1 }));
		assertFalse(canBalance(new int[] { 2, 1, 1, 2, 1 }));
		assertTrue(canBalance(new int[] { 10, 11, 0, 20, 1 }));
		assertTrue(canBalance(new int[] { 10, 11, 17, 2, 2, 34 }));
		assertFalse(canBalance(new int[] { 10, 11, 17, 2, 2, 22, 33, 1 }));
	}

	public static boolean canBalance(int[] numbers) {
		int len = numbers.length;
		if (len % 2 == 0) {
			len /= 2;
		} else {
			len = (len / 2) + 1;
		}
		int sumLeft = 0;
		for (int i = 0; i < len; i++) {
			sumLeft += numbers[i];
		}
		int sumRight = 0;
		for (int i = numbers.length - 1; i >= len; i--) {
			sumRight += numbers[i];
		}
		return sumLeft == sumRight;
	}
}
