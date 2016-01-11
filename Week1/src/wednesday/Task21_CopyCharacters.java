package wednesday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task21_CopyCharacters {
	/*
	 * Copy every character K times
	 * 
	 * String copyEveryChar(String input, int k)
	 * 
	 * copyEveryChar("tldr", 3) => "tttllldddrrr"
	 */
	@Test
	public void copyEveryChar() {
		assertEquals("iiffsscc", copyEveryChar("ifsc", 2));
		assertEquals("aaallliiiBBBaaabbbaaa", copyEveryChar("aliBaba", 3));
		assertEquals("ggggoooooooogggg lllliiiinnnngggg", copyEveryChar("goog ling", 4));
		assertEquals("dead thread", copyEveryChar("dead thread", 1));
		assertEquals("bcdq", copyEveryChar("bcdq", 0));
	}

	public static String copyEveryChar(String input, int k) {
		if (k == 1 || k == 0) {
			return input;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isWhitespace(ch)) {
				for (int j = 0; j < k; j++) {
					sb.append(ch);
				}
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
