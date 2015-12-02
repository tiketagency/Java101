package monday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task03_IncreasingAndDecreasingSequences {
	/*
	 * Increasing and Decreasing Sequences
	 * 
	 * Implement the following functions:
	 * 
	 * boolean IsIncreasing(int[] sequence) which returns true if for every two
	 * consecutive elements a and b, a < b holds. boolean IsDecreasing(int[]
	 * sequence) which returns true if for every two consecutive elements a and
	 * b, a > b holds.
	 */
	@Test
	public void isIncreasingTest() {
		assertTrue(isIncreasing(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		assertFalse(isIncreasing(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 3 }));
	}

	public static boolean isIncreasing(int[] sequence) {
		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i - 1] > sequence[i]) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void isDecreasingTest() {
		assertFalse(isDecreasing(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		assertTrue(isDecreasing(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }));
	}

	public static boolean isDecreasing(int[] sequence) {
		return !isIncreasing(sequence);
	}
}
