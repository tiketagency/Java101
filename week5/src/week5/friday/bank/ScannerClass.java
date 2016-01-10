package week5.friday.bank;

import java.util.Scanner;

public class ScannerClass {
	private Scanner sc;

	public ScannerClass() {
		sc = new Scanner(System.in);
	}

	public double getDouble() {
		return Double.parseDouble(sc.nextLine());
	}

	public long getLong() {
		return Long.parseLong(sc.nextLine());
	}

	public int getInt() {
		return Integer.parseInt(sc.nextLine());
	}

	public String nextLine() {
		return sc.nextLine();
	}
}
