package wednesday.stack.implementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import wednesday.stack.interfaces.StackInterface;

public class Stack<T> implements StackInterface<T>, Iterable<T> {

	protected List<T> stack;
	protected int size;

	public Stack() {
		stack = new ArrayList<>();
	}

	@Override
	public T push(T element) {
		stack.add(element);
		return element;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}

	@Override
	public int size() {
		return stack.size();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public String toString() {
		return stack.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stack.size();
		result = prime * result + ((stack == null) ? 0 : stack.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Stack<T> other = (Stack<T>) obj;
		if (stack.size() != other.stack.size())
			return false;
		if (stack == null) {
			if (other.stack != null)
				return false;
		} else if (!stack.equals(other.stack))
			return false;
		return true;
	}

	@Override
	public Iterator<T> iterator() {
		return stack.iterator();
	}
}
