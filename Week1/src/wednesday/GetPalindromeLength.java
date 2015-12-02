package wednesday;
import static org.junit.Assert.*;

import org.junit.Test;

public class GetPalindromeLength {

	@Test
	public void testPalindromStarLength() {
		assertEquals(2, getPalindromeLength("taz*zad"));
		assertEquals(0, getPalindromeLength(""));
		assertEquals(0, getPalindromeLength("tazjsnkasdasndzad"));
		assertEquals(0, getPalindromeLength("tad*tad"));
		assertEquals(3, getPalindromeLength("tad*dat"));
	}

	public static boolean isInsideString(String string, int index1, int index2) {
		return index1 > 0 && index2 < string.length() - 1;
	}

	public static int getPalindromeLength(String string) {
		int length = 0;
		if (string.contains("*")) {
			int left = string.indexOf('*');
			int right = left;
			while (isInsideString(string, left, right) && string.charAt(--left) == string.charAt(++right)) {
				length++;
			}
		}
		return length;
	}
}
