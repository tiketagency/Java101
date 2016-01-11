package wednesday.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();
		for (int i = 1; i < 10; i++) {
			dl.add(i);
		}
		dl.print();
		System.out.println();
		dl.set(8, 1000);
		dl.print();
		System.out.println();
		dl.printInReverseOrder();
		System.out.println();
		dl.get(6);
		for (Integer ints : dl) {
			System.out.print(ints+" ");
		}
		dl.getFirst();
		dl.print();
	}
}
