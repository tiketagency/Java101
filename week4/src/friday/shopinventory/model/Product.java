package friday.shopinventory.model;

import friday.vattaxcalculator.VatTaxCalculator;
import friday.vattaxcalculator.database.DataBaseCountrys;
import friday.vattaxcalculator.enums.Country;

public class Product {
	private String productName;
	private int productId;
	private double netPrice;
	private double totalPrice;
	private int quantity;
	private Country supportedIn;

	public Product(String productName, int productId, double netPrice,
			int quantity, Country supportedIn) {
		this.productName = productName;
		this.productId = productId;
		this.netPrice = netPrice;
		this.totalPrice = new VatTaxCalculator(new DataBaseCountrys())
				.calculateTax(netPrice, supportedIn.getId());
		this.setQuantity(quantity);
		this.supportedIn = supportedIn;
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

	@Override
	public String toString() {
		return String
				.format("Product[name: %s, id: %d, netPrice: %.1f, totalPrice: %.1f, quantity: %d, supportedIn: %s]",
						productName, productId, getNetPrice(), totalPrice,
						quantity, supportedIn);
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

}