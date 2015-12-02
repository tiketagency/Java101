package monday;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Task06_UniqueWords {
	/*
	 * Unique words
	 * 
	 * Implement a function, called int uniqueWordsCount(String[] arr) which
	 * returns the number of different words in arr.
	 * 
	 * Test examples
	 * 
	 * uniqueWordsCount(new String[] {"apple", "banana", "apple", "pie"}) == 3
	 * uniqueWordsCount(new String[] {"java", "java", "java", "android"}) == 2
	 * uniqueWordsCount(new String[] {"HELLO!", "HELLO!", "HELLO!" "HELLO!"}) ==
	 * 1
	 */
	@Test
	public void uniqueWordsCountTest() {
		assertEquals(1, uniqueWordsCount(new String[] { "Java" }));
		assertEquals(0, uniqueWordsCount(new String[] {}));
		assertEquals(3, uniqueWordsCount(new String[] { "apple", "banana", "apple", "pie" }));
		assertEquals(2, uniqueWordsCount(new String[] { "java", "java", "java", "android" }));
		assertEquals(1, uniqueWordsCount(new String[] { "HELLO!", "HELLO!", "HELLO!", "HELLO!" }));
		assertEquals(3, uniqueWordsCount(new String[] { "HELLO", "HELLO!", "HELLO!?", "HELLO!" }));
	}

	public int uniqueWordsCount(String[] arr) {
		Set<String> set = new HashSet<>();
		for (String string : arr) {
			set.add(string);
		}
		return set.size();
	}
}
