package friday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task29_HackNumbers {
	/*
	 * A hack number is an integer, that matches the following criteria:
	 * 
	 * The number, represented in binary, is a palindrome The number,
	 * represented in binary, has an odd number of 1's in it Example of hack
	 * numbers:
	 * 
	 * 1 is 1 in binary 7 is 111 in binary 7919 is 1111011101111 in binary
	 * Implement the following functions:
	 * 
	 * isHack(n) -> checks if n is a hack number nextHack(n) -> returns the next
	 * hack number, that is bigger than n Few examples:
	 * 
	 * isHack(1) = True nextHack(0) = 1
	 * 
	 * isHack(21) = True nextHack(10) = 21
	 * 
	 * isHack(8191) = True nextHack(8031) = 8191
	 */
	@Test
	public void isHackTest() {
		assertTrue(isHack(1));
		assertTrue(isHack(7));
		assertFalse(isHack(10));
		assertFalse(isHack(-1));
		assertFalse(isHack(12345678912L));
	}

	@Test
	public void nextHackTest() {
		assertEquals(1, nextHack(0));
		assertEquals(21, nextHack(10));
		assertEquals(8191, nextHack(8031));
	}

	public static int nextHack(int number) {
		while (!isHack(++number)) {

		}
		return number;
	}

	public static boolean isHack(long number) {
		String binary = Long.toBinaryString(number);
		int occurrencesOfOne = binary.split("1", -1).length - 1;
		StringBuilder sb = new StringBuilder(binary).reverse();
		return occurrencesOfOne % 2 != 0 && sb.toString().equals(binary);
	}
}
