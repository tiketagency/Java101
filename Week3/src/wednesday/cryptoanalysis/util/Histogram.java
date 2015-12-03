package wednesday.cryptoanalysis.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Histogram {

	public static Map<Character, Integer> createHistogram(String cryptedText) {
		cryptedText = cryptedText.replaceAll("[^a-zA-Z]", "").toLowerCase();
		Map<Character, Integer> histogram = new HashMap<>();
		int textLength = cryptedText.length();
		for (int i = 0; i < textLength; i++) {
			char letter = cryptedText.charAt(i);
			if (!histogram.containsKey(letter)) {
				histogram.put(letter, 1);
			} else {
				histogram.put(letter, histogram.get(letter) + 1);
			}
		}
		return sortByValues(histogram);
	}

	public static <K, V extends Comparable<V>> Map<Character, Integer> sortByValues(
			final Map<? extends Character, ? extends Integer> map) {
		Comparator<Character> valueComparator = new Comparator<Character>() {

			@Override
			public int compare(java.lang.Character o1, java.lang.Character o2) {
				return map.get(o2).compareTo(map.get(o1));
			}
		};
		Map<Character, Integer> sortedByValues = new TreeMap<>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}
}
