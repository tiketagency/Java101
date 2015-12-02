package friday.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import friday.Task34_SmsCoder;

public class SmsCoderTests {

	@Test
	public void getNumericTest() {
		// result from subtraction is position of the letter in the array
		assertEquals(6, Task34_SmsCoder.INDEXES[110 - 97]);
	}

	@Test
	public void getValueTest() {
		// expected result is the position of the passed letter
		// getButton argument is the result of subtraction of ascii codes of
		// passed letter and 97(this is the position of 'a' in ascii)
		assertEquals(2, Task34_SmsCoder.getLetterPosition(Task34_SmsCoder.INDEXES[110 - 97], 'n'));
	}

	@Test
	public void ClickTest() {
		assertEquals("[7, 0, 7, 7, 7, 7, -1, 7, 7, -1, 7, 7, 7, 8]", Task34_SmsCoder.click("p sqrt"));
		assertEquals("[2, 3, 2, 2, 3]", Task34_SmsCoder.click("adbd"));
		assertEquals("[2, -1, 2, 2, -1, 2, 2, 2]", Task34_SmsCoder.click("a?b?c"));
		assertEquals("[2, -1, 2, 2, -1, 2, 2, 2]", Task34_SmsCoder.click("abc"));
		assertEquals("[2, -1, 2, 2, 2, -1, 2, -1, 2, 2]", Task34_SmsCoder.click("acab"));
		assertEquals("[1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 0, 0, 3, 3, 0, 1, 7, 2, 1, 6, 6, 3, 1, 2]",
				Task34_SmsCoder.click("Ivo   e PaNdA"));
		assertEquals("[2]", Task34_SmsCoder.click("a"));
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2]", Task34_SmsCoder.click("       Ab"));
		assertEquals("[2, -1, 2, -1, 2, 2, -1, 2, 2, -1, 2, 2, 2, -1, 2, 2, 2]", Task34_SmsCoder.click("aabbcc"));
		assertEquals("[2, 2, 2, -1, 2, 2, -1, 2]", Task34_SmsCoder.click("cba"));
		assertEquals("[9, 9, 9, 9, -1, 9, 9, 9, -1, 9, 9, -1, 9]", Task34_SmsCoder.click("zyxw9101001"));
		assertEquals("[]", Task34_SmsCoder.click("1267373"));
		assertEquals("[1, 2, -1, 1, 2, 2, -1, 1, 2, 2, 2, 1, 3]", Task34_SmsCoder.click("ABCD"));
		assertEquals("[4, 4, 4, 0, 8, 8, 8, 0, 2, -1, 2, 2]", Task34_SmsCoder.click("i v ab"));
	}
}
