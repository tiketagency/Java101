package monday.digitalbackpack;

public class DigitalBackPackTest {

	public static void main(String[] args) {
		DigitalBackPack<Integer> numbers = new DigitalBackPack<>();
		numbers.setField(10);
		System.out.println(numbers.getField());
	}
}
