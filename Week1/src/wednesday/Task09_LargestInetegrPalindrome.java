package wednesday;

import java.util.Scanner;

public class Task09_LargestInetegrPalindrome {
	/*
	 * Find the largest integer palindrome number up to N --
	 * ---------------------------long getLargestPalindrome(long N); 1234321 is
	 * a palindrome. You are given a number => N. Find the largest number < N,
	 * that is a palindrome. Bonus do this without using Collections.sort
	 */
	public static long getLargestIntegerPalindrome(long n) {
		for (long i = n; i > 10; i--) {
			if (isIntegerPalindrome(i)) {
				return i;
			}
		}
		return n;
	}

	public static boolean isIntegerPalindrome(long n) {
		long temp = n;
		int res = 0;
		while (temp != 0) {
			int rem = (int) (temp % 10);
			temp /= 10;
			res = res * 10 + rem;
		}
		return res == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Entered number should be in the range [%d  %d]", Long.MIN_VALUE, Long.MAX_VALUE);
		long n = sc.nextLong();
		System.out.println(getLargestIntegerPalindrome(n));
		sc.close();
	}
}
