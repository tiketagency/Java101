package monday.filedatacompression;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileManager {
	private static final File DECOMPRESSED = new File("decompressedFile.txt");

	public static void openFileWithNotePad(File file) throws IOException {
		String openFile = "notepad " + file.getPath();
		// using terminal commands
		Process process = Runtime.getRuntime().exec(openFile);
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));) {
		}
	}

	public static File saveToFile(String content) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(DECOMPRESSED))) {
			writer.write(content);
		}
		return DECOMPRESSED;
	}
}
