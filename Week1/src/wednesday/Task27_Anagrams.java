package wednesday;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Task27_Anagrams {
	/*
	 * Is String A an anagram of String B?
	 * 
	 * boolean anagram(String A, String B)
	 * 
	 * No HashMaps, hashSets, or such stuff allowed : )
	 * 
	 * assertEquals(true, problems2.areAnagrams("A", "A")); assertEquals(true,
	 * problems2.areAnagrams("BRADE", "BEARD")); assertEquals(true,
	 * problems2.areAnagrams("TOP CODER", "COTE PROD")); assertEquals(false,
	 * problems2.areAnagrams("TOP CODER", "COTO PRODE"));
	 */
	@Test
	public void areAnagrams() {
		assertEquals(true, areAnagrams("TOP CODER", "COTE PROD"));
		assertEquals(true, areAnagrams("aliBaba", "baBaali"));
		assertEquals(true, areAnagrams("googling", "loogingg"));
		assertEquals(false, areAnagrams("dead thread", "dade treadth"));
		assertEquals(false, areAnagrams("bcdq", "cbdaq"));
	}

	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}

	public static boolean areAnagrams(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		if (a.equals(b)) {
			return true;
		}
		StringBuilder sb = new StringBuilder(b);
		for (int i = 0; i < a.length(); i++) {
			boolean flag = false;
			for (int j = 0; j < sb.length(); j++) {
				if (a.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					flag = true;
					break;
				}
			}
			if (!flag) {
				return false;
			}
		}
		return true;
	}
}
