package wednesday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

//The program check weather number is palindrome
public class Task20_IsNumberPalindrome {
	public static boolean isIntegerPalindrome(long n) {
		long temp = n;
		int res = 0;
		while (temp != 0) {
			int rem = (int) (temp % 10);
			temp /= 10;
			res = res * 10 + rem;
		}
		return res == n;
	}

	@Test
	public void isIntegerPalindromeTest() {
		assertTrue(isIntegerPalindrome(123321));
		assertTrue(isIntegerPalindrome(1234321));
		assertFalse(isIntegerPalindrome(12345));
		assertFalse(isIntegerPalindrome(98765));
		assertTrue(isIntegerPalindrome(22222222));
	}
}
