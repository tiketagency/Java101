package wednesday.pair;

public final class Pair<K, V> {
	private K a;
	private V b;

	public Pair(K a, V b) {
		this.setA(a);
		this.setB(b);
	}

	public K getA() {
		return a;
	}

	public void setA(K a) {
		this.a = a;
	}

	public V getB() {
		return b;
	}

	public void setB(V b) {
		this.b = b;
	}

	@Override
	public boolean equals(Object obj) {
		@SuppressWarnings("unchecked")
		Pair<K, V> p = (Pair<K, V>) obj;
		return this.a.equals(p.a) && this.b.equals(p.b);
	}

	@Override
	public String toString() {
		return "First argument is: " + a.getClass() + "\n" + "Second argument is: " + b.getClass();
	}
}
