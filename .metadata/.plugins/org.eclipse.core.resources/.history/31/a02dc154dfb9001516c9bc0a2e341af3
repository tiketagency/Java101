package monday.duplicatesfinder;

import java.io.IOException;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws IOException,
			NoSuchAlgorithmException {
		DuplicatesFinder d = new DuplicatesFinder();
		try {
			d.findDuplicate(Paths
					.get("testData"));
		} catch (Exception e) {
			if (e.getMessage() == null) {
				System.err.println("File Not exist!");
			}
		} finally {
			d.printDuplicates();
		}
	}
}
