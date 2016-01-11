package wednesday.uniquestacklist;

import wednesday.stacklist.StackList;

public class UniqueStackListTest {

	public static void main(String[] args) {
		StackList<Integer> uniqueStackList = UniqueStackList.createStack();
		for (int i = 0; i < 10; i++) {
			uniqueStackList.push(i);
		}
		while (!uniqueStackList.isEmpty()) {
			System.out.println(uniqueStackList.pop());
		}
	}
}
