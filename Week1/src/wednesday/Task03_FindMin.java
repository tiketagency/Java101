package wednesday;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Task03_FindMin {
	@Test
	public void findMinTest() {
		assertEquals(5, findMin(new int[] { 22, 45, 31, 78, 65, 5, 222 }));
		assertEquals(12, findMin(new int[] { 55, 43, 12, 90, 999, 765, 234 }));
		assertEquals(-55, findMin(new int[] { 0, 234, 321, 456, 43, -55, 90 }));
		assertEquals(-123, findMin(new int[] { 23, 54, -1, -23, 95, -123 }));
		assertEquals(-1, findMin(new int[] { 0, 0, 0, 0, 1, 3, 5, -1, 0 }));
		assertEquals(1, findMin(new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }));
		assertEquals(1, findMin(new int[] { 1, 2 }));
		assertEquals(1, findMin(new int[] { 1 }));
	}

	// Find the minimum element of an array
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
}
