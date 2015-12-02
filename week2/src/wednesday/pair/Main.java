package wednesday.pair;

public class Main {
	public static void main(String[] args) {
		Pair<Integer, Integer> integerPairs = new Pair<>(123, 235);
		Pair<Integer, String> intStringPairs = new Pair<>(123, "235");
		System.out.println(integerPairs.equals(intStringPairs));
		System.out.println("Integer pairs: " + integerPairs);
		System.out.println();
		System.out.println("Integer-String pairs: " + intStringPairs);
	}
}
