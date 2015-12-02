package wednesday;

public class Task05_GetAverage {
	/*
	 * Find the average(средно аритметично) of the elements of an array
	 */
	public static float getAverage(int[] array) {
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	public static void main(String[] args) {
		int[] arr = { 23, 6, 9, 34, 52, 1, 44, 3, 22 };
		System.out.println(getAverage(arr));
	}
}
