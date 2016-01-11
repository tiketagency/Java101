package friday.shopinventory.model;

import friday.vattaxcalculator.calculator.VatCalculator;
import friday.vattaxcalculator.database.CountryManager;
import friday.vattaxcalculator.model.Country;

public class Product {
	private String productName;
	private int productId;
	private double netPrice;
	private double totalPrice;
	private int quantity;
	private int countryCode;
	private Country supportedIn;

	public Product(String productName, int productId, double netPrice,
			int quantity, int countryCode) {
		CountryManager db = CountryManager.getInstance();
		supportedIn = db.getCountry(countryCode);
		this.productName = productName;
		this.productId = productId;
		this.netPrice = netPrice;
		if (supportedIn.isDefault()) {
			this.totalPrice = VatCalculator.calculateTax(netPrice);
		} else {
			this.totalPrice = VatCalculator.calculateTax(netPrice, countryCode);
		}
		this.setQuantity(quantity);
		this.countryCode = countryCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public Country getSupportedIn() {
		return supportedIn;
	}

	public String getProductName() {
		return productName;
	}

	public int getCountryCode() {
		return countryCode;
	}

	@Override
	public String toString() {
		return String
				.format("Product[name: %s, id: %d, netPrice: %.1f, totalPrice: %.1f, quantity: %d, supportedIn: %s]",
						productName, productId, getNetPrice(), totalPrice,
						quantity, supportedIn.getCountryName());
	}
}
