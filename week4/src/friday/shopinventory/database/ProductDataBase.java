package friday.shopinventory.database;

import java.util.ArrayList;
import java.util.List;

import friday.shopinventory.model.Product;
import friday.vattaxcalculator.enums.Country;

public class ProductDataBase {
	private List<Product> products;
	private List<Product> availableProducts;
	private static ProductDataBase instance = new ProductDataBase();

	public ProductDataBase() {
		products = new ArrayList<>();
		products.add(new Product("Pants", 0, 25, 2, Country.AUSTRALIA));
		products.add(new Product("Tv", 1, 125, 1, Country.ITALY));
		products.add(new Product("Pc", 2, 1025, 3, Country.GERMANY));
		products.add(new Product("Tequila", 3, 7.50, 2, Country.SPAIN));
		products.add(new Product("Jacket", 4, 75, 3, Country.ENGLAND));
		products.add(new Product("Beer", 5, 0.75, 10, Country.BULGARIA));
	}

	public static ProductDataBase getInstance() {
		if (instance == null) {
			instance = new ProductDataBase();
		}
		return instance;
	}

	public List<Product> getAvailableProducts() {
		availableProducts = new ArrayList<>();
		for (Product product : instance.products) {
			if (product.getQuantity() > 0) {
				availableProducts.add(product);
			}
		}
		return availableProducts;
	}

	public static List<Product> getProducts() {
		return instance.products;
	}
}