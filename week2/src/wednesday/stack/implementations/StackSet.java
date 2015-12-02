package wednesday.stack.implementations;

import java.util.ArrayList;

import wednesday.stack.exceptions.DuplicateValueException;

public class StackSet<E> extends Stack<E> {

	public StackSet() {
		stack = new ArrayList<>();
	}

	public StackSet(int size) {
		stack = new ArrayList<>(size);
	}

	@Override
	public E push(E element) {
		if (stack.contains(element)) {
			throw new DuplicateValueException("StackSet can contain only unique values");
		}
		stack.add(element);
		return element;
	}
}
