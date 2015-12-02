package wednesday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task18_ReverseEachWord {
	/*
	 * Reverse each word in a String
	 * 
	 * String reverseEveryChar(String arg)
	 * 
	 * reverseEveryChar("What is this") => tahW si siht
	 */
	@Test
	public void reverseEachWord() {
		assertEquals("tahW si siht", reverseEveryChar("What is this"));
		assertEquals("ooooohay elgooog", reverseEveryChar("yahooooo         gooogle"));
		assertEquals("baaaa aaaaa aaaaaa", reverseEveryChar("aaaab     \n  aaaaa    aaaaaa"));
	}

	public static String reverseEveryChar(String arg) {
		arg = arg.replaceAll("\n", " ");
		String[] words = arg.split(" +");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(Task17_ReverseString.reverseMe(words[i]) + " ");
		}
		return sb.toString().trim();
	}
}
