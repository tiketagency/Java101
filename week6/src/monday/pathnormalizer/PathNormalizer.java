package monday.pathnormalizer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class PathNormalizer {

	public static String reduceFilePath(String path) throws IOException {
		try {
			return Paths.get(path).toRealPath().normalize().toString();
		} catch (NoSuchFileException x) {
			System.err.format("%s: no such" + " file or directory%n", path);
		} catch (IOException x) {
			System.err.format("%s%n", x);
		}
		return path;
	}

	@Test
	public void reduceFilePathTest() throws IOException {
		assertEquals("", reduceFilePath(""));
		assertEquals("/", reduceFilePath("/"));
		assertEquals("/", reduceFilePath("/srv/../"));
		assertEquals("/srv/www/htdocs/wtf",
				reduceFilePath("/srv/www///htdocs/wtf/"));
		assertEquals("/srv", reduceFilePath("/srv/./././././"));
		assertEquals("/etc/wtf", reduceFilePath("/etc//wtf/"));
		assertEquals("/", reduceFilePath("/etc///../etc/../etc/../"));
		assertEquals("/", reduceFilePath("/../"));
		assertEquals("/", reduceFilePath("/etc/../etc/../etc/../"));
		assertEquals("/", reduceFilePath("/../"));
		assertEquals("/", reduceFilePath("/..///"));
	}
}
