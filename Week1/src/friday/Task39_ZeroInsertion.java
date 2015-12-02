package friday;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Task39_ZeroInsertion {
	/*
	 * Zero Insertion
	 * 
	 * Given an integer, implement the function int zero_insert(int n), which
	 * returns a new int, constructed by the following algorithm:
	 * 
	 * If two neighboring digits are the same (like 55), insert a 0 between them
	 * (505) Also, if we add two neighboring digits and take their module by 10
	 * (% 10) and the result is 0 - add 0 between them. For example, if we have
	 * the number 116457, result will be: 10160457:
	 * 
	 * 1 and 1 are the same, so we insert 0 between them 6 + 4 % 10 = 0, so we
	 * insert 0 between them.
	 */
	@Test
	public void zeroInsertTest() {
		assertEquals(10160457, zeroInsert(116457));
		assertEquals(505050505050505L, zeroInsert(55555555));
		assertEquals(1, zeroInsert(1));
		assertEquals(6040406, zeroInsert(6446));
		assertEquals(6040406060606109L, zeroInsert(644666619));
	}

	public static List<Integer> splitNumber(int number) {
		List<Integer> list = new ArrayList<>();
		while (number > 0) {
			list.add(0, number % 10);
			number /= 10;
		}
		return list;
	}

	public static long zeroInsert(int number) {
		// 12345 =>[1,2,3,4,5]
		List<Integer> collection = splitNumber(number);
		for (int i = 1; i < collection.size(); i++) {
			int previuosNumber = collection.get(i - 1);
			int currentNumber = collection.get(i);
			if (previuosNumber == currentNumber || (previuosNumber + currentNumber) % 10 == 0) {
				// insert 0 between numbers
				collection.add(i, 0);
			}
		}
		// remove [ and ] and , and ' '
		String regex = "\\[|\\]|[,][ ]";
		// convert list to string
		String result = collection.toString().replaceAll(regex, "");
		return Long.parseLong(result);
	}
}
