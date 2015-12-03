package wednesday.onofcollection;

public class TestOnOfCollection {

	public static void main(String[] args) {
		OnOfCollection<Integer> onof = new OnOfCollection<>();
		for (int i = 0; i < 10; i++) {
			onof.add(i);
		}
		onof.add(5);
		onof.add(null);
		System.out.println(onof);
	}

}
