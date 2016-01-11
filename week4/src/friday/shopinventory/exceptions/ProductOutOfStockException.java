package friday.shopinventory.exceptions;

import friday.shopinventory.model.Product;

public class ProductOutOfStockException extends Exception {
	private static final long serialVersionUID = 1L;

	public ProductOutOfStockException(Product product) {
		super(product.getProductName() + " is out of stock");
	}
}
