package wednesday.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import wednesday.stack.implementations.Stack;
import wednesday.stack.implementations.StackSet;

public class StackTest {
	@Test
	public void testStack() {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		for (int i = 0; i < 10; i++) {
			stack1.push(i);
			stack2.push(i);
		}
		assertTrue(stack1.equals(stack2));
		int n = stack1.pop();
		assertFalse(stack1.equals(stack2));
		n = stack2.pop();
		assertTrue(stack1.equals(stack2));
		assertTrue(!stack1.isEmpty());
		n = stack2.peek();
		assertTrue(stack1.equals(stack2));
		assertTrue(stack2.peek() == n);
		while (!stack1.isEmpty()) {
			stack1.pop();
		}
		assertTrue(stack1.size() == 0);
		int size = stack2.size();
		assertTrue(stack2.size() == size);
	}

	public static void main(String[] args) {
		Stack<Integer> nonDupStack = new StackSet<>(10);
		for (int i = 0; i < 10; i++) {
			nonDupStack.push(i);
		}
		for (Integer integer : nonDupStack) {
			System.out.println(integer);
		}
		System.out.println(nonDupStack.push(1));
	}
}
