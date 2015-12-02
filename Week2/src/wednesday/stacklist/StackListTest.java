package wednesday.stacklist;

public class StackListTest {

	public static void main(String[] args) {
		StackList<Integer> sl = new StackList<>();
		for (int i = 1; i < 10; i++) {
			sl.push(i);
		}
		while (!sl.isEmpty()) {
			System.out.println(sl.pop());
		}
		System.out.println(sl.isEmpty());
		System.out.println(sl.peek());
	}
}
