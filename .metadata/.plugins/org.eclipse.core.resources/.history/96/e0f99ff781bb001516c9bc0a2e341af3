package monday.mp3organizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
	public static void createDir(Path dest, File file, Mp3Metadata metaData,
			CopyOption... op) throws IOException {
		if (!dest.toFile().exists()) {
			Files.createDirectories(dest);
		}
		copyFileToDir(dest, file, op);
	}

	public static void copyFileToDir(Path dest, File file,
			CopyOption... copyOptions) throws IOException {
		dest = Paths.get(dest + "/" + file.getName());
		if (copyOptions != null) {
			Files.copy(file.toPath(), dest, copyOptions);
		} else {
			Files.copy(file.toPath(), dest);
		}
	}
}
