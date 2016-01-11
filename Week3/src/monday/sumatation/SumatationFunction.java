package monday.sumatation;

public class SumatationFunction {

	public static <T1 extends Number, T2 extends Number> double sumatation(T1 n, T2 m) {
		return n.doubleValue() + m.doubleValue();
	}

	public static void main(String[] args) {
		System.out.println(sumatation(10, 22.5));
	}
}
