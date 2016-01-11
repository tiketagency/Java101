package wednesday;

import java.util.Scanner;

public class Task11_Pow {
	/*
	 * Raise an integer to a power of another
	 * 
	 * long pow(int a, int b)
	 * 
	 * Write a O(log(b)) solution.
	 */
	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b == 1) {
			return a;
		}
		return b % 2 == 0 ? pow(a, b / 2) * pow(a, b / 2) : a * pow(a, (b - 1) / 2) * pow(a, (b - 1) / 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Enter a power of the entered number");
		int pow = sc.nextInt();
		System.out.println(pow(n, pow));
		sc.close();
	}
}
