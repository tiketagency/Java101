package friday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task32_PalindromeScore {
	/*
	 * Palindrome Score
	 * 
	 * We denote the "Palindrome score" of an integer by the following function:
	 * 
	 * P(n) = 1, if n is palindrome P(n) = 1 + P(s) where s is the sum of n and
	 * the reverse of n Implement a function, called pScore(n), which finds the
	 * palindrome score for n.
	 * 
	 * Lets see two examples:
	 * 
	 * pScore(121) = 1, because 121 is a palindrome. pScore(48) = 3, because:
	 * 
	 * P(48) = 1 + P(48 + 84) = 132 P(132) = 1 + 1 + P(132 + 321 = 363) P(363) =
	 * 1. When we return from the recursion, we get 3. Examples:
	 * 
	 * pScore(121) = 1 pScore(48) = 3 pScore(198) = 6
	 */
	@Test
	public void palindromScoreTest() {
		assertEquals(1, palindromeScore(121));
		assertEquals(3, palindromeScore(48));
		assertEquals(6, palindromeScore(198));
		assertEquals(3, palindromeScore(917));
		assertEquals(2, palindromeScore(34));
	}

	public static int reverseNumber(long n) {
		long temp = n;
		int res = 0;
		while (temp != 0) {
			int rem = (int) (temp % 10);
			temp /= 10;
			res = res * 10 + rem;
		}
		return res;
	}

	public static long countRecursievCalls(long n) {
		long reversed = reverseNumber(n);
		if (reversed == n) {
			return 1;
		}
		return 1 + countRecursievCalls(n + reversed);
	}

	public static long palindromeScore(int i) {
		return countRecursievCalls(i);

	}
}
