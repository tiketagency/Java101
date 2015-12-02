package friday.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import friday.Task33_SmsDecoder;

public class SmsDecoderTests {

	@Test
	public void numbersToMessage() {
		assertEquals("       ", Task33_SmsDecoder.numbersToMessage(new int[] { 0, 0, 0, 0, 0, 0, 0 }));
		assertEquals("", Task33_SmsDecoder.numbersToMessage(new int[] {}));
		assertEquals("abc", Task33_SmsDecoder.numbersToMessage(new int[] { 2, -1, 2, 2, -1, 2, 2, 2 }));
		assertEquals("javA", Task33_SmsDecoder.numbersToMessage(new int[] { 5, 2, 8, 8, 8, 1, 2 }));
		assertEquals("bA", Task33_SmsDecoder.numbersToMessage(new int[] { 2, 2, 2, 2, 2, 1, 2 }));
		assertEquals("Ivo e Panda", Task33_SmsDecoder.numbersToMessage(
				new int[] { 1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2 }));
		assertEquals("H a Ck Bul     Gar iA",
				Task33_SmsDecoder.numbersToMessage(new int[] { 1, -1, 4, 4, 0, 2, 0, 1, 2, 2, 2, -1, 5, 5, 0, 1, -1, 2,
						2, -1, 8, 8, -1, 5, 5, 5, 0, 0, 0, 0, 0, 1, 4, 2, -1, 7, 7, 7, 0, -1, 4, 4, 4, 1, 2 }));
		assertEquals("aabbcc", Task33_SmsDecoder
				.numbersToMessage(new int[] { 2, -1, 2, -1, 2, 2, -1, 2, 2, -1, 2, 2, 2, -1, 2, 2, 2 }));
	}

	@Test
	public void countOccurrances() {
		assertEquals(2, Task33_SmsDecoder.countButtonClicks(2, new int[] { 2, -1, 2, 2, -1, 2, 2, 2 }));
		assertEquals(3, Task33_SmsDecoder.countButtonClicks(5, new int[] { 2, -1, 2, 2, -1, 2, 2, 2 }));
		assertEquals(1, Task33_SmsDecoder.countButtonClicks(1, new int[] { 2, -1, 2, 2, -1, 2, 2, 2 }));
		assertEquals(1, Task33_SmsDecoder.countButtonClicks(0, new int[] { 5, 2, 8, 8, 8, 2 }));
	}
}
