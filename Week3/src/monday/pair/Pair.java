package monday.pair;

public final class Pair<T1, T2> implements Comparable<T2> {
	private T1 x;
	private T2 y;

	public Pair(T1 x, T2 y) {
		this.x = x;
		this.y = y;
	}

	public T1 getX() {
		return x;
	}

	public T2 getY() {
		return y;
	}

	@Override
	public int compareTo(T2 o) {
		return this.equals(o) ? 1 : -1;
	}
}
