package wednesday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task26_HasAnagramOf {
	/*
	 * Is an anagram of String A a susbstring in B?
	 * 
	 * boolean hasAnagramOf(A,B) Return whether an anagram of String A can be
	 * found in String B.
	 */
	@Test
	public void testHasAnagramOf() {
		assertEquals(true, hasAnagramOf("abc", "cbghhijha"));
		assertEquals(false, hasAnagramOf("abcyf", "fedbcadhz"));
		assertEquals(true, hasAnagramOf("kalsz", "ziaeytkls"));
		assertEquals(false, hasAnagramOf("aabc", "cbda"));
		assertEquals(true, hasAnagramOf("bcdq", "cbdaq"));
		assertEquals(true, hasAnagramOf("TOP CODER", "COTE PROD"));
	}

	public static boolean hasAnagramOf(String s1, String s2) {
		int s1Len = s1.length();
		int s2Len = s2.length();
		// check for incorrect input
		if (s1Len > s2Len) {
			return false;
		}
		// 'z' is number 122 in ascii table
		int[] ascii = new int[123];
		for (int i = 0; i < s1Len; i++) {
			char c = s1.charAt(i);
			// increment by 1 at ascii position in array
			ascii[c]++;
		}
		for (int i = 0; i < s2Len; i++) {
			char c = s2.charAt(i);
			// decrement by 1 at 'c' position in array
			ascii[c]--;
		}
		for (int i = 0; i < s1Len; i++) {
			char c = s1.charAt(i);
			// after decrement we expected 0 or less value at 'c' position
			if (ascii[c] > 0) {
				return false;
			}
		}
		return true;
	}
}
