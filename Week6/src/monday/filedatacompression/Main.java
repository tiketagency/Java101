package monday.filedatacompression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
	public static final File COMPRESSED_DATA = new File("compressedFile.properties");
	public static final File TEST_FILE = new File("compressionTest.txt");

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileDataCompression.compress(Paths.get(TEST_FILE.toURI()));
//		FileManager.openFileWithNotePad(TEST_FILE);
		File f = FileDataCompression.decompress(Paths.get(COMPRESSED_DATA.toURI()));
		//FileManager.openFileWithNotePad(f);
	}
}
