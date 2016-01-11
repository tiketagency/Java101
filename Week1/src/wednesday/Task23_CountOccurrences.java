package wednesday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task23_CountOccurrences {
	/*
	 * Count number of (non-overlapping) occurences
	 * 
	 * int countOcurrences(String needle, String haystack) countOcurrences("da",
	 * "daaadaadada") => 4
	 * 
	 * Bonus Only 1 line of code allowed. No loops :)
	 */

	public static int countOcurrences(String needle, String haystack) {
		return haystack.split(needle, -1).length - 1;
	}

	@Test
	public void countOcurrences() {
		assertEquals(4, countOcurrences("da", "daaadaadada"));
		assertEquals(5, countOcurrences("za", "zadzadzadzadzad"));
		assertEquals(1, countOcurrences("zak", "zadzadzakdzadzad"));
		assertEquals(0, countOcurrences("zarzavata", "zadzadzadzadzad"));
		assertEquals(1, countOcurrences("zarzavata", "zadzadzarzavatadzadzad"));
	}
}
