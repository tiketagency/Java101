package com.boyko.vat.exceptions;

public class CountryNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public CountryNotFoundException(String msg) {
		super(msg);
	}
}
