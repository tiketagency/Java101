package monday.makeitmoregeneric;

public class MinElement {
	public static <T extends Comparable<T>> T min(T[] list) {
		T minValue = list[0];
		for (int i = 1; i < list.length; i++) {
			if (minValue.compareTo(list[i]) > 0) {
				minValue = list[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		Integer[] ints = { 22, 42, 7, 11, 52, 9 };
		String[] words = { "qzd", "de", "qwer" };
		System.out.println(min(ints));
		System.out.println(min(words));
	}
}
