package wednesday;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Task17_ReverseString {
	/*
	 * Reverse a String
	 * 
	 * String reverseMe(String argument)
	 */
	@Test
	public void reverseMeTest() {
		assertEquals("tahW", reverseMe("What"));
		assertEquals("oohay", reverseMe("yahoo"));
		assertEquals("fedcba", reverseMe("abcdef"));
	}

	public static String reverseMe(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
