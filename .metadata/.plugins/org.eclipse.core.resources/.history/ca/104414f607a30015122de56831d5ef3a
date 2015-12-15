package com.boyko.vat.database;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.boyko.vat.currency.CurrencyCourse;
import com.boyko.vat.models.Country;

public class CountryDatabase implements Iterable<Map.Entry<Integer, Country>> {

	private Map<Integer, Country> countries;

	public CountryDatabase() {
		countries = new HashMap<>();
		countries.put(359, new Country("BULGARIA", 20, 359, true,
				CurrencyCourse.LV));
		countries.put(44,
				new Country("UK", 20, 44, false, CurrencyCourse.POUND));
		countries.put(39, new Country("GERMANY", 19, 39, false,
				CurrencyCourse.EURO));
		countries.put(34, new Country("AUSTRIA", 20, 34, false,
				CurrencyCourse.EURO));
		countries.put(49, new Country("ITALY", 21, 49, false,
				CurrencyCourse.EURO));
		countries.put(43, new Country("SPAIN", 22, 43, false,
				CurrencyCourse.EURO));
		countries.put(61, new Country("AUSTRALIA", 10, 61, false,
				CurrencyCourse.AUD));
	}

	public Country getCountry(int countryCode) {
		return countries.get(countryCode);
	}

	public Country getDefaultCountry() {
		for (Map.Entry<Integer, Country> entry : countries.entrySet()) {
			Country country = entry.getValue();
			if (country.isDefault()) {
				return country;
			}
		}
		return null;
	}

	@Override
	public Iterator<Entry<Integer, Country>> iterator() {
		return countries.entrySet().iterator();
	}
}
