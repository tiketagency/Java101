package wednesday.stack.interfaces;

public interface StackInterface<T> {
	public T push(T element);

	public T peek();

	public T pop();

	public int size();

	public boolean isEmpty();
}
