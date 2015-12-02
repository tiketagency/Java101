package wednesday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task24_DecodeUrl {
	/*
	 * Decode an URL
	 * 
	 * Input 'kitten%20pic.jpg' Output 'kitten pic.jpg' %20=>' ' %3A=>':'
	 * %3D=>'?' %2F=>'/' String decodeUrl(String input)
	 * 
	 * 1 line of code is allowed.
	 */
	@Test
	public void decoderTest() {
		assertEquals("http://meyerweb.com/eric/tools/dencoder/",
				decodeUrl("http%3A%2F%2Fmeyerweb.com%2Feric%2Ftools%2Fdencoder%2F"));
		assertEquals("kitten pic.jpg", decodeUrl("kitten%20pic.jpg"));
		assertEquals("kitten pic.jpg?", decodeUrl("kitten%20pic.jpg3D"));
		assertEquals(": ? /?", decodeUrl("%3A%20%3D%20%2F%3D"));
	}

	public static String decodeUrl(String input) {
		return input.replaceAll("%", "").replaceAll("20", " ").replaceAll("3A", ":").replaceAll("3D", "?")
				.replaceAll("2F", "/");
	}
}
