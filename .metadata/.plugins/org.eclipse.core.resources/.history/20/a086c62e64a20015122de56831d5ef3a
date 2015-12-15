package friday.shopinventory.database;

import java.util.List;

import friday.shopinventory.exceptions.ProductNotFoundException;
import friday.shopinventory.model.Order;
import friday.shopinventory.model.Order.ProductInfo;
import friday.shopinventory.model.Product;
import friday.vattaxcalculator.CurrencyConverter;
import friday.vattaxcalculator.enums.Country;

public class Inventory {
	private List<Product> availableProducts;

	public Inventory(List<Product> availableProducts) {
		this.availableProducts = availableProducts;
	}

	public double audit() {
		double sum = 0;
		for (Product product : availableProducts) {
			sum += product.getTotalPrice();
		}
		return sum;
	}

	public void showAllAvailableProducts() {
		for (Product product : availableProducts) {
			System.out.println(product);
		}
	}

	public double requestOrder(Order order) throws ProductNotFoundException {
		try {
			double sum = 0;
			for (ProductInfo<Integer, Integer> info : order.getInfo()) {
				Product product = ProductDataBase.getProducts().get(
						info.getId());
				Country country = product.getSupportedIn();
				double productTotalPrice = product.getTotalPrice();
				double totalPriceInLeva = CurrencyConverter.convert(
						productTotalPrice, country);
				System.out
						.printf("%s is supported in %s, costed: %.2f including VAT tax, converted in Leva is %.2f%n",
								product.getProductName(), country,
								productTotalPrice, totalPriceInLeva);
				sum += totalPriceInLeva;
			}
			return sum;
		} catch (Exception e) {
			throw new ProductNotFoundException();
		}
	}

	public static void main(String[] args) throws ProductNotFoundException {
		Inventory in = new Inventory(ProductDataBase.getInstance()
				.getAvailableProducts());
		Order order = new Order(2, 3);
		in.showAllAvailableProducts();
		System.out.println(in.requestOrder(order));
	}
}
