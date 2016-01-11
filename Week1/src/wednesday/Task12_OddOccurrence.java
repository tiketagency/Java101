package wednesday;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class Task12_OddOccurrence {
	/*
	 * Find the only number, that occurs odd times in an array
	 * 
	 * int getOddOccurrence(int... array)
	 * 
	 * Every element in array will occur an even ammount of times. There will be
	 * exactly one element Example: {1,2,2,1,3,4,3,4,4,6,5,6,5} => 4 occurs only
	 * an odd number of times.
	 */
	@Test
	public void findMinTest() {
		assertEquals(22, getOddOccurrence(new int[] { 22, 45, 45, 22, 22, 31, 31, 78, 78 }));
		assertEquals(1, getOddOccurrence(new int[] { 1, 2, 3, 2, 1, 1, 3 }));
		assertEquals(4, getOddOccurrence(new int[] { 1, 2, 2, 1, 3, 4, 3, 4, 4, 6, 5, 6, 5 }));
		assertEquals(21, getOddOccurrence(new int[] { 23, 23, 23, 21, 21, 23, 21, 12, 12, 13, 13, 1, 1 }));
		assertEquals(-1, getOddOccurrence(new int[] { 0, 0, 0, 0, 1, 3, 3, -1, 0, 0, 1 }));
	}

	public static int getOddOccurrence(int[] arr) {
		Map<Integer, Integer> histogram = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (histogram.get(arr[i]) != null) {
				histogram.put(arr[i], histogram.get(arr[i]) + 1);
			} else {
				histogram.put(arr[i], 1);
			}
		}
		for (Integer key : histogram.keySet()) {
			Integer value = histogram.get(key);
			if (value % 2 != 0) {
				return key;
			}
		}
		return 0;
	}
}
