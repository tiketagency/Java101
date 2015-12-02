package wednesday;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class Task04_KthMinimalElement {
	/*
	 * Find the kth minimal element of an array int kthMin(int k, int[] array)
	 * There will be no duplicates in the array. If they are duplicates in the
	 * test, ignore them (my bad).
	 */
	@Test
	public void ktMinTest() {
		assertEquals(3, kthMin(3, new int[] { 23, 6, 9, 34, 52, -1, -1, 0, 0, 0, 44, 3, 22 }));
		assertEquals(6, kthMin(4, new int[] { 23, 6, 9, 34, 52, -1, -1, 0, 0, 0, 44, 3, 22 }));
		assertEquals(-1, kthMin(1, new int[] { 23, 6, 9, 34, 52, -1, -1, 0, 0, 0, 44, 3, 22 }));
		assertEquals(23, kthMin(7, new int[] { 23, 6, 9, 34, 52, -1, -1, 0, 0, 0, 44, 3, 22 }));
		assertEquals(0, kthMin(2, new int[] { 23, 6, 9, 34, 52, -1, -1, 0, 0, 0, 44, 3, 22 }));
	}

	public static int kthMin(int n, int[] arr) {
		int ktmin = Integer.MIN_VALUE;
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i <= n; i++) {
			ktmin = temp;
			int min = Integer.MAX_VALUE;
			for (int i1 = 0; i1 < arr.length; i1++) {
				if (ktmin < arr[i1] && min > arr[i1]) {
					min = arr[i1];
					// save current min
					temp = min;
				}
			}
		}
		return ktmin;
	}

	public static void main(String[] args) {
		int[] array = { 23, 6, 9, 34, 52, 62, -1, -1, 0, 0, 0, 44, 3, 22 };
		Scanner sc = new Scanner(System.in);
		int kthElement = Integer.MAX_VALUE;
		while (kthElement > array.length) {
			System.out.println("Kth element should be greater than array size");
			kthElement = sc.nextInt();
		}
		System.out.printf("%d element in the array is: %d", kthElement, kthMin(kthElement, array));
		sc.close();
	}
}
