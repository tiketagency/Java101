package week5.friday.bank.interfaces;

import week5.friday.bank.exception.ExceededInterestException;
import week5.friday.bank.exception.InsufficientAvailabilityException;

public interface BankOperations {

	public void add() throws InsufficientAvailabilityException;

	public double withdraw() throws ExceededInterestException,
			InsufficientAvailabilityException;

	public boolean transfer() throws ExceededInterestException,
			InsufficientAvailabilityException;

	public void showBalance() throws InsufficientAvailabilityException;

	public void showHistory();

	public double calculateAmount();
}
