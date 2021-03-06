package wednesday.rotatecollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Rotator {
	public static <T> Deque<T> rotateLeft(Deque<T> deq, int rotateStep) {
		for (int i = 0; i < Math.abs(rotateStep); i++) {
			deq.addFirst(deq.pollLast());
		}
		return deq;
	}

	public static <T> Deque<T> rotateRigth(Deque<T> deq, int rotateStep) {
		for (int i = 0; i < rotateStep; i++) {
			deq.addLast(deq.pollFirst());
		}
		return deq;
	}

	public static <T> void rotate(Collection<T> collection, int rotateStep) {
		Deque<T> deq = new LinkedList<T>();
		deq.addAll(collection);
		collection.clear();
		if (rotateStep < 0) {
			deq = rotateLeft(deq, rotateStep);
		} else {
			deq = rotateRigth(deq, rotateStep);
		}
		collection.addAll(deq);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("one", "two",
				"three", "four", "five", "six", "seven"));
		List<Integer> l = new ArrayList<>();
		Stack<Integer> l2 = new Stack<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 10; i < 20; i++) {
			l.add(i);
			l2.add(i);
			set.add(i);
		}
		rotate(list, 2);
		System.out.println("right direction: " + list);
		rotate(l, 5);
		System.out.println("right direction: " + l);
		rotate(l2, -3);
		System.out.println("left direction: " + l2);
		rotate(set, -5);
		System.out.println("right direction: " + set);
	}

}
