package com.boyko.vat.models;

import com.boyko.vat.currency.CurrencyCourse;

public final class Country {
	private String countryName;
	private int vat;
	private int countryCode;
	private boolean isDefault;
	private CurrencyCourse currency;

	public Country(String countryName, int vat, int countryCode,
			boolean isDefault, CurrencyCourse currency) {
		this.countryName = countryName;
		this.vat = vat;
		this.countryCode = countryCode;
		this.isDefault = isDefault;
		this.currency = currency;
	}

	public int getVat() {
		return vat;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public CurrencyCourse getCurrency() {
		return currency;
	}

	public String getCountryName() {
		return countryName;
	}

	@Override
	public String toString() {
		return countryName + " [vat=" + vat + ", code=" + countryCode
				+ ", isDefault=" + isDefault + ", currency=" + currency + "]";
	}
}
