package week5.friday.bank.interfaces;

import javax.naming.InvalidNameException;

import week5.friday.bank.account.BankAccount;
import week5.friday.bank.exception.AgeException;

public interface AccountSetupOperations {

	public boolean createAccount() throws AgeException, InvalidNameException;

	public BankAccount login() throws IllegalAccessException;
}
