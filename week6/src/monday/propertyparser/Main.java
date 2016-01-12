package monday.propertyparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Map<String, String> refactoredPropertyFile = PropertyParser.propertyParser(new File("prop.properties"));
		System.out.println(refactoredPropertyFile);
	}
}
