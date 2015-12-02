package monday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task04_LongestSubsequenceOfEqualElements {
	/*
	 * Longest subsequence of equal consecutive elements
	 * 
	 * Implement the function int maxEqualConsecutive(int[] items), which takes
	 * an array of ints and returns an integer - the count of elements in the
	 * longest subsequence of equal consecutive elements.
	 * 
	 * For example, in the array [1, 2, 3, 3, 3, 3, 4, 3, 3], the result is 4,
	 * where the longest subsequence is formed by 3, 3, 3, 3
	 * 
	 * Test examples::
	 * 
	 * maxEqualConsecutive(new int[] {1, 2, 3, 3, 3, 3, 4, 3, 3}) == 4
	 * maxEqualConsecutive(new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5}) == 3
	 */

	@Test
	public void maxEqualConsecutiveTest() {
		assertEquals(4, maxEqualConsecutive(new int[] { 1, 2, 3, 3, 3, 3, 4, 3, 3 }));
		assertEquals(3, maxEqualConsecutive(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5 }));
		assertEquals(9, maxEqualConsecutive(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5 }));
		assertEquals(0, maxEqualConsecutive(new int[] {}));
		assertEquals(1, maxEqualConsecutive(new int[] { 1, 2 }));
	}

	public static int maxEqualConsecutive(int[] items) {
		int count = 1;
		int max = 0;
		int item = 0;
		for (int i = 0; i < items.length; i++) {
			count = items[i] == item ? count + 1 : 1;
			if (count > max) {
				max = count;
			}
			item = items[i];
		}
		return max;
	}
}
