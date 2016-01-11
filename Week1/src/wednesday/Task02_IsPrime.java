package wednesday;

public class Task02_IsPrime {
	static boolean[] primes;

	public static void fillSieve(int n) {
		primes = new boolean[n + 1];
		for (int i = 2; i < primes.length; i++) {
			// if the number is not prime,
			// then go through all its multiples and make their values true.
			if (!primes[i]) {
				for (int j = 2; i * j < primes.length; j++) {
					primes[i * j] = true;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		fillSieve(n);
		return !primes[n];
	}

	// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61
	public static void main(String[] args) {
		System.out.println(isPrime(103124));
	}
}
