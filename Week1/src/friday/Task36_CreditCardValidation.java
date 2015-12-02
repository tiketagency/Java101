package friday;

import static org.junit.Assert.*;
import org.junit.Test;

public class Task36_CreditCardValidation {
	@Test
	public void isCardValidTest() {
		assertTrue(isCardValid("79927398715"));
		assertFalse(isCardValid("79927398713"));
		assertFalse(isCardValid(null));
		assertFalse(isCardValid(""));
		assertFalse(isCardValid("12345067919"));
	}

	public static boolean isCardValid(String cardId) {
		if (cardId == null || cardId.length() % 2 == 0 || cardId.isEmpty() || cardId.contains("[0-9]+")) {
			return false;
		}
		int sum = 0;
		for (int i = 0; i < cardId.length(); i++) {
			int currDigit = Character.getNumericValue(cardId.charAt(i));
			sum += i % 2 == 0 ? currDigit : currDigit * 2;
		}
		return sum % 10 == 0;
	}
}
