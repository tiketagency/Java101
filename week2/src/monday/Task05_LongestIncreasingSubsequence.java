package monday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task05_LongestIncreasingSubsequence {
	/*
	 * Longest subsequence of increasing consecutive elements
	 * 
	 * Implement the function int maxIncreasingConsecutive(int[] items), which
	 * takes an array of ints and returns an integer - the count of elements in
	 * the longest subsequence of increasing consecutive elements.
	 * 
	 * For example, in the array [1, 2, 3, 3, 3, 3, 4, 3, 3], the result is 7,
	 * where the longest subsequence is formed by 1, 2, 3, 3, 3, 3, 4
	 * 
	 * Test examples::
	 * 
	 * maxIncreasingConsecutive([1, 2, 3, 3, 3, 3, 4, 3, 3]) == 7
	 * maxIncreasingConsecutive([1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5]) == 11
	 */
	@Test
	public void maxIncreasingConsecutiveTest() {
		assertEquals(7, maxIncreasingConsecutive(new int[] { 1, 2, 3, 3, 3, 3, 4, 3, 3 }));
		assertEquals(11, maxIncreasingConsecutive(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5 }));
		assertEquals(7, maxIncreasingConsecutive(new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7 }));
	}

	private int maxIncreasingConsecutive(int[] items) {
		int count = 0;
		int max = 0;
		int item = 0;
		for (int i = 0; i < items.length; i++) {
			if (item <= items[i]) {
				count++;
			} else {
				count = 1;
			}
			if (count > max) {
				max = count;
			}
			item = items[i];
		}
		return max;
	}
}
