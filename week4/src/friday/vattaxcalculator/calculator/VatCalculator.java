package friday.vattaxcalculator.calculator;

import friday.vattaxcalculator.database.CountryManager;
import friday.vattaxcalculator.exceptions.NotSupportedCountryException;
import friday.vattaxcalculator.model.Country;

public class VatCalculator {

	public static double calculateTax(double netPrice, int countryCode)
			throws NotSupportedCountryException {
		Country country = CountryManager.getInstance().getCountry(countryCode);
		double vatRate = country.getVat();
		return Math.round(netPrice * (1 + (vatRate / 100)));
	}

	public static double calculateTax(double price)
			throws NotSupportedCountryException {
		return calculateTax(price, CountryManager.getInstance()
				.getDefaultCountry().getCountryCode());
	}
}
