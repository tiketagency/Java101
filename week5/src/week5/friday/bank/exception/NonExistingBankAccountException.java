package week5.friday.bank.exception;

public class NonExistingBankAccountException extends IllegalArgumentException {
	private static final long serialVersionUID = -8612161993355528517L;

	public NonExistingBankAccountException() {
		super();
	}

	public NonExistingBankAccountException(String message) {
		super(message);
	}
}
