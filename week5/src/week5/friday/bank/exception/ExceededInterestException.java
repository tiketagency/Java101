package week5.friday.bank.exception;

public class ExceededInterestException extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceededInterestException() {
	}

	public ExceededInterestException(String message) {
		super(message);
	}
}
