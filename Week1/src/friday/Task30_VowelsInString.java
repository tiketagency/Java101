package friday;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task30_VowelsInString {
	/*
	 * Vowels in a string
	 * 
	 * Implement a function, called countVowels(str), which returns the count of
	 * all vowels in the string str.
	 * 
	 * Count uppercase vowels aswell!
	 * 
	 * The English vowels are aeiouy.
	 * 
	 * Examples:
	 * 
	 * countVowels("Java") = 2 countVowels("Theistareykjarbunga") = 8
	 * countVowels("grrrrgh!") = 0 count_vowels(
	 * "Github is the second best thing that happend to programmers, after the keyboard!"
	 * ) = 22 count_vowels("A nice day to code!") = 8
	 */
	@Test
	public void countVowelsTest() {
		assertEquals(2, countVowels("Java"));
		assertEquals(8, countVowels("Theistareykjarbunga"));
		assertEquals(0, countVowels("grrrrgh!"));
		assertEquals(22,
				countVowels("Github is the second best thing that happend to programmers, after the keyboard!"));
		assertEquals(4, countVowels("dhfjshaaoi!@#1331"));
	}

	public static int countVowels(String input) {
		input = input.toLowerCase();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			count += vowels(input.charAt(i));
		}
		return count;
	}

	private static int vowels(char c) {
		switch (c) {
		case 'a':
			return 1;
		case 'e':
			return 1;
		case 'i':
			return 1;
		case 'o':
			return 1;
		case 'u':
			return 1;
		case 'y':
			return 1;
		default:
			return 0;
		}
	}
}
