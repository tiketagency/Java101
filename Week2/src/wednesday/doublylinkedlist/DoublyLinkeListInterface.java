package wednesday.doublylinkedlist;

//Some of those operations are add, remove, size, get(int elementIndex), getHead (getFirst), getTail(getLast), 

public interface DoublyLinkeListInterface<T> {
	public T add(T element);

	public boolean remove(int element);

	public int size();

	public T get(int index);

	public T getFirst();

	public T getLast();

	public void clear();

	public boolean set(int index, T element);

	public boolean isEmpty();

	public void print();

	public void printInReverseOrder();

	public T removeLast();
}
