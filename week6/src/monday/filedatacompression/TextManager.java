package monday.filedatacompression;

public class TextManager {
	private static final String DELIMITER = "~";
	private StringBuilder stringBuilder;

	public TextManager() {
		stringBuilder = new StringBuilder();
	}

	public void buildText(String line) {
		stringBuilder.append(decompressDelimiter(line) + "\n");
	}

	private String decompressDelimiter(String line) {
		return line.replaceAll(DELIMITER, " ");
	}

	public String getDecompressedContent() {
		return stringBuilder.toString();
	}

	public String[] splitLine(String line) {
		return line.split(DELIMITER);
	}

	public String removePunctuations(String word) {
		return word.replaceAll("\\p{Punct}", "");
	}

	public String compressDelimiter(String line) {
		return line.replaceAll("\\s+", DELIMITER);
	}
}
