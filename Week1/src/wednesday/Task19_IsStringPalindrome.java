package wednesday;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Task19_IsStringPalindrome {
	/*
	 * Is this string a palindrome
	 * 
	 * boolean isPalindrome(String argument)
	 */

	@Test
	public void testCanBalance() {
		assertTrue(isPalindrome("goog"));
		assertTrue(isPalindrome("goggog"));
		assertFalse(isPalindrome("googgooga"));
		assertTrue(isPalindrome("azobi4amma4iboza"));
		assertTrue(isPalindrome("pallap"));
	}

	public static boolean isPalindrome(String str) {
		for (int i = 0, a = str.length() - 1; i < str.length() / 2; i++, a--) {
			if (str.charAt(i) != str.charAt(a)) {
				return false;
			}
		}
		return true;
	}
}
