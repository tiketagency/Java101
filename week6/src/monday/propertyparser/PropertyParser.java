package monday.propertyparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertyParser {

	public static Map<String, String> propertyParser(File file) throws FileNotFoundException, IOException {
		Map<String, String> refactoredPropertyFile = new HashMap<>();
		List<String> lines = getLines(file);
		for (String line : lines) {
			if (!Character.isWhitespace(line.charAt(0)) && line.trim().charAt(0) != '#') {
				String[] keyAndValue = line.split("\\=", 2);
				refactoredPropertyFile.put(keyAndValue[0], keyAndValue[1]);
			}
		}
		return refactoredPropertyFile;

	}

	private static List<String> getLines(File file) throws FileNotFoundException, IOException {
		List<String> lines = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = bf.readLine()) != null) {
				line = line.replaceAll(" ", "");
				lines.add(line.trim());
				lines.add(System.lineSeparator());
			}
		}
		return lines;
	}
}
