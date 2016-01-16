package monday.wccommand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class WcCommand {

	private class WordCountResult {
		private String fileName;
		private int lettersCount;
		private int wordCount;

		public WordCountResult(String fileName, int lettersCount, int wordCount) {
			super();
			this.fileName = fileName;
			this.lettersCount = lettersCount;
			this.wordCount = wordCount;
		}

		@Override
		public String toString() {
			return "WordCountResult [fileName= " + fileName + ", lettersCount= " + lettersCount + ", wordCount= "
					+ wordCount + "]";
		}

	}

	public static WordCountResult wordCount(File file) throws FileNotFoundException, IOException {
		String wordsCommand = "wc -w " + file.getPath();
		String lettersCommand = "wc -c " + file.getPath();
		// using terminal commands
		Process countWords = Runtime.getRuntime().exec(wordsCommand);
		int wordsCount = readProcess(countWords);
		Process countLetters = Runtime.getRuntime().exec(lettersCommand);
		int lettersCount = readProcess(countLetters);

		return new WcCommand().new WordCountResult(file.getName(), lettersCount, wordsCount);
	}

	private static int readProcess(Process process) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));) {
			String count = reader.readLine().replaceAll("[^\\d]", "");
			return Integer.parseInt(count);
		}
	}

	public static WordCountResult wordCount(Path path) throws FileNotFoundException, IOException {
		return wordCount(path.toFile());
	}
}
