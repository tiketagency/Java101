package friday.shopinventory.model;

import java.util.List;

import friday.shopinventory.database.Inventory;
import friday.shopinventory.model.Order.ProductInfo;

public class PayDesk {
	private List<Order> orders;
	private Inventory inventory;

	public PayDesk(List<Order> orders) {
		this.orders = orders;
		inventory = new Inventory();
	}

	public double orderAudit() {
		double sum = 0;
		for (Order order : orders) {
			for (ProductInfo<Integer, Integer> productInfo : order
					.getProducts()) {
				Product product = inventory.getAllProducts().get(
						productInfo.getId());
				sum += product.getTotalPrice();
			}
		}
		return sum;
	}
}
