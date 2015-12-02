package monday.makeitmoregeneric;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		for (int i = 0, a = str.length() - 1; i < str.length() / 2; i++, a--) {
			if (str.charAt(i) != str.charAt(a)) {
				return false;
			}
		}
		return true;
	}

	public static <T extends Comparable<T>> boolean palindrome(T obj) {
		return isPalindrome(obj.hashCode() + "");

	}

	public static void main(String[] args) {
		System.out.println(palindrome("Pesho"));
	}
}
