package friday;

import java.util.ArrayList;
import java.util.List;

import friday.tests.SmsCoderTests;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.textui.TestRunner;

public class Task34_SmsCoder {
	/*
	 * Condition at:
	 * https://github.com/HackBulgaria/Programming101-Java/tree/master/week01
	 * 
	 */
	static final String[] BUTTONS = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	public static final int[] INDEXES = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9,
			9 };

	public static int getLetterPosition(int button, char letter) {
		return BUTTONS[button].indexOf(letter) + 1;
	}

	// check around the letter
	public static boolean checkForSequence(char currentLetter, char previousLetter) {
		int n = currentLetter - previousLetter;
		int currentLetterPosition = Character.toLowerCase(currentLetter) - 'a';
		int previousLetterPosition = Character.toLowerCase(previousLetter) - 'a';
		return (n >= -2 && n <= 3) && INDEXES[currentLetterPosition] == INDEXES[previousLetterPosition];
	}

	public static String validateInput(String input) {
		return input.replaceAll("[^a-zA-Z\\s]", "");
	}

	public static String click(String str) {
		// ignoring digits and other characters except whitespace's
		str = validateInput(str);
		// result list
		List<Integer> code = new ArrayList<>();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char currentLetter = str.charAt(i);
			if (Character.isWhitespace(currentLetter)) {
				code.add(0);
				continue;
			}
			// i > 0 because of ArrayOutOfBoundException and because we don't
			// want to put pause before first click
			// @param (current letter, previous letter)
			if (i > 0 && checkForSequence(currentLetter, str.charAt(i - 1))) {
				// when two adjacent letters are represented from a single
				// button then - pause.
				code.add(-1);
			}
			if (Character.isUpperCase(currentLetter)) {
				code.add(1);
				currentLetter = Character.toLowerCase(currentLetter);
			}
			int button = INDEXES[currentLetter - 'a'];
			int numberOfClicks = getLetterPosition(button, currentLetter);
			for (int j = 0; j < numberOfClicks; j++) {
				code.add(button);
			}
		}
		return code.toString();
	}

	public static void main(String... args) {
		TestRunner.run(testAdapter());
	}

	public static Test testAdapter() {
		return new JUnit4TestAdapter(SmsCoderTests.class);
	}
}
