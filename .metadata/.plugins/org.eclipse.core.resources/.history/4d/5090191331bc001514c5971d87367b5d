package monday.filedatacompression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import monday.filedatacompression.WordsContainer.TextManager;

public class FileDataCompression {
	private WordsContainer container;
	private TextManager manager;

	public FileDataCompression() {
		container = new WordsContainer();
		manager = container.new TextManager();
	}

	public File compress(Path path) throws IOException {
		List<String> content = FileManager.loadFile(path);
		for (String line : content) {
			line = line.replaceAll("\\s+", "~");
			String[] words = manager.splitLine(line);
			for (String word : words) {
				word = manager.removePunctuations(word);
				if (!container.contains(word)) {
					container.putInContainer(word);
				}
				line = line
						.replaceFirst(word, container.getFromContainer(word));
			}
			container.appendText(line);
		}
		return container.save();
	}
}
