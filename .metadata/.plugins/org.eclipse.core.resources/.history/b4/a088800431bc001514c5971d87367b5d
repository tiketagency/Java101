package monday.filedatacompression;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class WordsContainer {
	public static final File COMPRESSED_DATA = new File(
			"compressedFile.properties");
	// helper map
	Map<String, Integer> mappedWords;
	private Properties properties = new Properties();
	private int ID = -1;

	public WordsContainer() {
		mappedWords = new HashMap<>();
	}

	public void appendText(String line) {
		String oldValue = (String) properties.get("-1");
		String appendedData = oldValue != null ? oldValue + "\n" + line : line;
		properties.setProperty("-1", appendedData);
	}

	public void putInContainer(String word) {
		mappedWords.put(word, ++ID);
		properties.put(ID + "", word);
	}

	public boolean contains(String word) {
		return properties.containsValue(word);
	}

	public File save() throws IOException {
		properties.store(new FileWriter(COMPRESSED_DATA), "compression");
		return COMPRESSED_DATA;
	}

	public String getFromContainer(String word) {
		return mappedWords.get(word) + "";
	}

	public String[] getCompression(Path path) throws FileNotFoundException,
			IOException, NotCompressedFileException {
		try {
			properties.load(new FileReader(path.toFile()));
			return properties.get("-1").toString().split("\n");
		} catch (Exception e) {
			throw new NotCompressedFileException("File is not compressed");
		}
	}

	public String getWord(String code) {
		return properties.getProperty(code);
	}

	public class TextManager {
		private static final String DELIMITER = "~";
		private StringBuilder stringBuilder;

		public TextManager() {
			stringBuilder = new StringBuilder();
		}

		public void decompressDelimiter(String line) {
			stringBuilder.append(line.replaceAll(DELIMITER, " ") + "\n");
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
	}
}
