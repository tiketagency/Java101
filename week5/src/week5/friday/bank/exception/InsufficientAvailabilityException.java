package week5.friday.bank.exception;

public class InsufficientAvailabilityException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientAvailabilityException() {
	}

	public InsufficientAvailabilityException(String message) {
		super(message);
	}
}
