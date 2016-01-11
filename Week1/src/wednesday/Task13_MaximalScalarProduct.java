package wednesday;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Task13_MaximalScalarProduct {

	/*
	 * Maximal scalar product
	 * 
	 * long maximalScalarSum(int[] a, int[] b) You are given two vectors, a and
	 * b. Let a be {a1,a2,a3} and b be {b1,b2,b3}. The scalar product of vectors
	 * a and b is the number a1*b1 + a2*b2 + a3*b3
	 * 
	 * Find a permutation of a, and a permutation of b, for which their scalar
	 * product is the largest possible.
	 */
	@Test
	public void sumTest() {
		int[] arr = { 1, 2, 3, 9, 5, 6 };
		int[] arr2 = { 5, 6, 7, 1, 2, 3 };
		assertEquals(138, sum(arr, arr2));
	}

	public static int sum(int[] a, int[] b) {
		int sum = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 5, 6 };
		int[] arr2 = { 5, 6, 7, 1, 2, 3 };
		System.out.println(sum(arr, arr2));
	}
}
