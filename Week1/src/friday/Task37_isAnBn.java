package friday;

import static org.junit.Assert.*;
import org.junit.Test;

public class Task37_isAnBn {

	@Test
	public void isAnBnTest() {
		assertTrue(checkAnWhetherIsBn(""));
		assertTrue(checkAnWhetherIsBn("ab"));
		assertTrue(checkAnWhetherIsBn("aabb"));
		assertFalse(checkAnWhetherIsBn("aaaaabb"));
		assertTrue(checkAnWhetherIsBn("aaaabbbb"));
		assertFalse(checkAnWhetherIsBn("bbaa"));
		assertFalse(checkAnWhetherIsBn("hack"));
		assertFalse(checkAnWhetherIsBn("AAAbbb"));
		assertFalse(checkAnWhetherIsBn("aaaabbbbccccdddd"));
		assertFalse(checkAnWhetherIsBn("aaaabbbbcccc"));
	}

	public static boolean checkAnWhetherIsBn(String str) {
		String a = str.substring(0, str.length() / 2);
		int an = a.length();
		String b = str.substring(an, str.length());
		int bn = b.length();
		return a.matches("[a]+") && b.matches("[b]+") && an == bn || str.isEmpty() ? true : false;
	}
}
