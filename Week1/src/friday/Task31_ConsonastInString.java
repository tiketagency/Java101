package friday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task31_ConsonastInString {
	/*
	 * Consonants in a string
	 * 
	 * Implement a function, called countConsonants(str), which returns the
	 * count of all consonants in the string str.
	 * 
	 * Count uppercase consonants as well!
	 * 
	 * The English consonants are bcdfghjklmnpqrstvwxz.
	 * 
	 * Examples:
	 * 
	 * countConsonants("Java") = 2 countConsonants("Theistareykjarbunga") = 11
	 * countConsonants("grrrrgh!") = 7 countConsonants(
	 * "Github is the second best thing that happend to programmers, after the keyboard!"
	 * ) = 44 countConsonants("A nice day to code!") = 6
	 */
	@Test
	public void counrConsonantsTest() {
		assertEquals(2, countConsonants("Java"));
		assertEquals(11, countConsonants("Theistareykjarbunga"));
		assertEquals(7, countConsonants("grrrrgh!"));
		assertEquals(44,
				countConsonants("Github is the second best thing that happend to programmers, after the keyboard!"));
		assertEquals(6, countConsonants("A nice day to code!"));
	}

	public static int countConsonants(String input) {
		input = input.toLowerCase();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				// vowels() return 0 if letter is vowel
				count += vowels(ch);
			}
		}
		return count;
	}

	private static int vowels(char c) {
		switch (c) {
		case 'a':
			return 0;
		case 'e':
			return 0;
		case 'i':
			return 0;
		case 'o':
			return 0;
		case 'u':
			return 0;
		case 'y':
			return 0;
		default:
			return 1;
		}
	}
}
