package week5.friday.bank.account;

import java.io.Serializable;

import week5.friday.bank.ScannerClass;
import week5.friday.bank.account.BankAccount.History;
import week5.friday.bank.enums.OperationType;
import week5.friday.bank.exception.ExceededInterestException;
import week5.friday.bank.exception.InsufficientAvailabilityException;
import week5.friday.bank.interfaces.BankOperations;
import week5.friday.bank.storage.Bank;
import week5.friday.bank.util.MessageConstants;

public class AccountSession implements BankOperations, Serializable {

	private static final long serialVersionUID = 1L;
	private static ScannerClass sc;
	private BankAccount account;

	public AccountSession() {
	}

	public AccountSession(BankAccount account) {
		sc = new ScannerClass();
		this.account = account;
	}

	@Override
	public void add() throws InsufficientAvailabilityException {
		System.out.println("Add money");
		double money = sc.getDouble();
		double total = getAccount().getMoney() + money;
		getAccount().setMoney(OperationType.ADD, money);
		History history = getAccount().new History(OperationType.ADD, money);
		getAccount().addToHistory(history);
		boolean success = getAccount().getMoney() == total;
		if (success) {
			System.out.println("You succesfully added " + money);
			System.out.println(MessageConstants.BALANCE_MESSAGE
					+ getAccount().getBalance());
		}
	}

	@Override
	public double withdraw() throws ExceededInterestException,
			InsufficientAvailabilityException {

		System.out.println("Your balance is: " + getAccount().getBalance());
		double money = sc.getDouble();

		if (getAccount().getInterest().getInterestValue() > 1) {
			throw new ExceededInterestException(MessageConstants.CANT_WITHDRAW
					+ MessageConstants.BALANCE_MESSAGE);
		}
		if (getAccount().getMoney() < money) {
			throw new InsufficientAvailabilityException(
					MessageConstants.NOT_ENOUGH_MONEY + MessageConstants.BALANCE_MESSAGE
							+ getAccount().getBalance());
		}
		History history = getAccount().new History(OperationType.WITHDRAW,
				money);
		getAccount().addToHistory(history);
		getAccount().setMoney(OperationType.WITHDRAW, money);
		System.out.println(MessageConstants.BALANCE_MESSAGE
				+ getAccount().getBalance());
		return money;
	}

	@Override
	public boolean transfer() throws ExceededInterestException,
			InsufficientAvailabilityException {
		System.out.println("Please enter the amount to transfer");
		double money = sc.getDouble();
		System.out.println("Please give user ID to make the transfer");
		Long id = sc.getLong();
		if (account.getID() == id) {
			System.err
					.println("You can't transfer money to your Account!You entered this ID "
							+ "\"" + id + "\"" + " Please type correct ID");
			return false;
		}

		BankAccount account2 = null;

		try {
			account2 = Bank.accounts.get(id);
			getAccount().setMoney(OperationType.WITHDRAW, money);
			History history = getAccount().new History(account2,
					OperationType.TRANSFER, money);
			getAccount().addToHistory(history);
		} catch (Exception e) {
			System.err.println("Wrong Id...Please try to give correct id");
			transfer();
		}
		if (money > getAccount().getBalance()) {
			throw new InsufficientAvailabilityException(
					MessageConstants.NOT_ENOUGH_MONEY);
		}
		account2.setMoney(OperationType.ADD, money);
		return true;
	}

	@Override
	public void showBalance() throws InsufficientAvailabilityException {
		getAccount().getBalance();

	}

	public BankAccount getAccount() {
		return account;
	}

	@Override
	public void showHistory() {
		account.showHistory();
	}

	@Override
	public double calculateAmount() {
		System.out.println("Choose period to calculate amount");
		int period = sc.getInt();
		double total = account.getInterest().calculateAmount(period);
		System.out.println("Your Interest Type is " + account.getInterest());
		System.out.println("For " + period
				+ " years total amount of your deposit will be " + total);
		return total;
	}
}
