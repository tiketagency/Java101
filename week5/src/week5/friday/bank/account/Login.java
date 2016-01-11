package week5.friday.bank.account;

import week5.friday.bank.ScannerClass;
import week5.friday.bank.exception.NonExistingBankAccountException;
import week5.friday.bank.storage.Bank;

public class Login {

	private ScannerClass sc;

	public Login() {
		sc = new ScannerClass();
	}

	public BankAccount login() throws IllegalAccessException {
		System.out.println("Enter your Id");
		BankAccount account = Bank.accounts.get(sc.getLong());
		if (!Bank.accounts.containsKey(account.getID())) {
			throw new NonExistingBankAccountException("Invalid Unique number");
		}
		System.out.println("Enter you password");
		String password = sc.nextLine();
		if (account.getPassword().equals(password)) {
			return account;
		}
		throw new IllegalAccessException("Incorect password " + password);
	}
}
