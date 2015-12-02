package friday.calculator.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionValidator {
	
	private static final String REGEX = "^([-+]? ?(d+|\\(\\g<1>\\))( ?[-+*\\/] ?\\g<1>)?)$";
	private static boolean validateBrackets(String expression){
		return expression.matches(REGEX);
	}
	@Test
	public void validateTest(){
		assertTrue(validateExpression("1+2+3"));
	}
	public static boolean validateExpression(String expression) {
		return expression.matches(REGEX);
	}
}
