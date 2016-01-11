package wednesday;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Task14_MaxSpan {
	/*
	 * Max span
	 * 
	 * int maxSpan(int[] numbers) Consider the leftmost and righmost appearances
	 * of some value in an array. We'll say that the "span" is the number of
	 * elements between the two inclusive. A single value has a span of 1.
	 * Returns the largest span found in the given array.
	 * 
	 * maxSpan({1, 2, 1, 1, 3}) → 4 maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
	 * maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
	 */
	@Test
	public void testMaxSpan() {
		assertEquals(4, maxSpan(new int[] { 1, 2, 1, 1, 3 }));
		assertEquals(6, maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 }));
		assertEquals(6, maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 }));
		assertEquals(7, maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 1 }));
		assertEquals(3, maxSpan(new int[] { 1, 2, 3, 4, 5, 4, 6, 7, 8 }));
		assertEquals(0, maxSpan(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
		assertEquals(2, maxSpan(new int[] { 1, 2, 3, 4, 5, 5, 7, 8 }));
	}

	public static int maxSpan(int[] arr) {
		Map<Integer, Integer> start = new HashMap<>();
		Map<Integer, Integer> end = new HashMap<>();
		int maxSpan = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!start.containsKey(arr[i])) {
				start.put(arr[i], i);
			}
			end.put(arr[i], i);
			int currentSpan = (end.get(arr[i]) - start.get(arr[i])) + 1;
			if (currentSpan > maxSpan) {
				maxSpan = currentSpan;
			}
		}
		if (maxSpan == 1) {
			// array contains only unique numbers
			return 0;
		}
		return maxSpan;
	}
}
