package wednesday.readblehashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HumanReadableHashMap {

	public static String printHashMap(
			HashMap<? extends Object, ? extends Object> map) {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		@SuppressWarnings("unchecked")
		List<Entry<String, Integer>> entryList = new ArrayList<>(
				(Collection<? extends Entry<String, Integer>>) map.entrySet());
		Entry<String, Integer> entry;
		for (int i = 0; i < map.size() - 1; i++) {
			entry = entryList.get(i);
			sb.append(entry.getKey() + ":" + entry.getValue() + ", ");
		}
		entry = entryList.get(entryList.size() - 1);
		sb.append(entry.getKey() + ":" + entry.getValue() + " }");
		return sb.toString();
	}

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		System.out.println(printHashMap(map));
	}
}
