package friday.vattaxcalculator.calculator;

import friday.vattaxcalculator.database.CountryDatabase;
import friday.vattaxcalculator.exceptions.NotSupportedCountryException;
import friday.vattaxcalculator.model.Country;

public class VatCalculator {
	private CountryDatabase db;

	public VatCalculator(CountryDatabase db) {
		this.db = db;
	}

	public double calculateTax(double netPrice, int countryCode)
			throws NotSupportedCountryException {
		try {
			Country country = db.getCountry(countryCode);
			double vatRate = country.getVat();
			return Math.round(netPrice * (1 + (vatRate / 100)));

		} catch (Exception e) {
			throw new NotSupportedCountryException("Country not found!");
		}
	}

	public double calculateTax(double price)
			throws NotSupportedCountryException {
		try {
			return calculateTax(price, db.getDefaultCountry().getCountryCode());
		} catch (Exception e) {
			throw new NotSupportedCountryException(
					"VAT calculator isn't support default country");
		}
	}
}
