package monday.filedatacompression;

public class NotCompressedFileException extends Exception {
	private static final long serialVersionUID = -6217944102101325677L;

	public NotCompressedFileException(String message) {
		super(message);
	}
}
