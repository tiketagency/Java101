package com.boyko.vat.currency;

import com.boyko.vat.models.Country;

public class CurrencyConverter {
	public static double convert(double sum, Country country) {
		return sum * country.getCurrency().getCourse();
	}
}
