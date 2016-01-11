package friday.vattaxcalculator.calculator;

import friday.vattaxcalculator.model.Country;

public class CurrencyConverter {
	public static double convert(double sum, Country country) {
		return sum * country.getCurrency().getCourse();
	}
}
