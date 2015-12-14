package friday.vattaxcalculator.exceptions;

public class NotSupportedCountryException extends UnsupportedOperationException {
	private static final long serialVersionUID = 1L;

	public NotSupportedCountryException(String msg) {
		super(msg);
	}
}
