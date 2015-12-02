package wednesday;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Task25_SumNumbersInString {
	/*
	 * Sum all the numbers in a String
	 * 
	 * int sumOfNumbers(String input)
	 * 
	 * Sum all of the numbers in the String. Ignore the characters.
	 * sumOfNumbers("abc123dd34") => 157 sumOfNumbers("12 99 1) => 112
	 */
	@Test
	public void sumOfNumbersTest() {
		assertEquals(157, sumOfNumbers("ab?c123dd34"));
		assertEquals(0, sumOfNumbers("000 three five -1 1"));
		assertEquals(21, sumOfNumbers("ab1c2d-e19a-1f"));
		assertEquals(-6, sumOfNumbers("ab1c2d-e1-9a-1f"));
	}

	@Test
	public void isNegativeTest() {
		assertFalse(isMinus(19, "000 three five -1 1-"));
		assertTrue(isMinus(15, "000 three five -1 1-"));
		assertFalse(isMinus(6, "ab1c2d-e19a-1f"));
	}

	@Test
	public void isPositiveTest() {
		assertTrue(isPositiveDigit(16, "000 three five -1 1-"));
		assertFalse(isPositiveDigit(20, "000 three five -1 1-"));
		assertFalse(isPositiveDigit(6, "ab1c2d-e19a-1f"));
	}

	public static boolean isMinus(int i, String str) {
		return i < str.length() - 1 && str.charAt(i) == '-' && Character.isDigit(str.charAt(i + 1));
	}

	public static boolean isPositiveDigit(int i, String str) {
		return i < str.length() && Character.isDigit(str.charAt(i));
	}

	public static int sumOfNumbers(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			String n = "";
			if (isPositiveDigit(i, str)) {
				while (isPositiveDigit(i, str)) {
					n += str.charAt(i++);
				}
				i--;
				sum += Integer.parseInt(n);
			}
			if (isMinus(i, str)) {
				n = "-";
				i++;
				while (isPositiveDigit(i, str)) {
					n += str.charAt(i++);
				}
				sum += Integer.parseInt(n);
			}
		}
		return sum;
	}

	// found easier solution :)
	public static int sumNums(String str) {
		Pattern pattern = Pattern.compile("\\-?\\d+");
		Matcher matcher = pattern.matcher(str);
		int sum = 0;
		while (matcher.find()) {
			sum += Integer.parseInt(matcher.group());
		}
		return sum;
	}
}
