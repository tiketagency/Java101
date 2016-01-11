package wednesday.stacklist;

import wednesday.doublylinkedlist.DoublyLinkedList;
import wednesday.stack.interfaces.StackInterface;

public class StackList<T> implements StackInterface<T> {

	protected DoublyLinkedList<T> stackList;

	public StackList() {
		stackList = new DoublyLinkedList<>();
	}

	@Override
	public T push(T element) {
		return stackList.add(element);
	}

	@Override
	public T peek() {
		return stackList.getLast();
	}

	@Override
	public T pop() {
		return stackList.removeLast();
	}

	@Override
	public int size() {
		return stackList.size();
	}

	@Override
	public boolean isEmpty() {
		return stackList.isEmpty();
	}
}
