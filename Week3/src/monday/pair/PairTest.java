package monday.pair;

public class PairTest {

	public static void main(String[] args) {
		Pair<String, String> pair = new Pair<String, String>("ABC", "DEF");
		System.out.println(pair.getX());
		System.out.println(pair.getY());
	}
}
