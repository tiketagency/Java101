package friday.shopinventory.model;

import java.util.ArrayList;
import java.util.List;

import friday.shopinventory.database.ProductDataBase;

public class Order {
	public class ProductInfo<K, V> {
		private int id;
		private int quantity;

		public ProductInfo(int id, int quantity) {
			this.id = id;
			this.quantity = quantity;
		}

		public int getId() {
			return id;
		}

		public int getQuantity() {
			return quantity;
		}
		
	}

	private List<ProductInfo<Integer, Integer>> info;

	public Order(int... productId) {
		info = new ArrayList<Order.ProductInfo<Integer, Integer>>(
				productId.length);
		for (int id : productId) {
			int quantity = ProductDataBase.getProducts().get(id).getQuantity();
			info.add(new ProductInfo<>(id, quantity));
		}
	}

	public void showOrder() {
		for (ProductInfo<Integer, Integer> productInfo : info) {
			System.out.println(productInfo.id + " " + productInfo.quantity);
		}
	}

	public List<ProductInfo<Integer, Integer>> getInfo() {
		return info;
	}

	public static void main(String[] args) {
		Order order = new Order(1, 2, 3, 4, 5);
		order.showOrder();
	}
}