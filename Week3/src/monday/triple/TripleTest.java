package monday.triple;

import monday.pair.Pair;

public class TripleTest {

	public static void main(String[] args) {
		Pair<String, Integer> data = new Pair<>("Gosho", 20);
		Triple<Pair<String, Integer>, String, Integer> trip = new Triple<>(data, "Sofia", 5000);
		System.out.println(trip.getX().getX());// Gosho
		System.out.println(trip.getY());// Sofia
		System.out.println(trip.getZ());// 5000
	}
}
