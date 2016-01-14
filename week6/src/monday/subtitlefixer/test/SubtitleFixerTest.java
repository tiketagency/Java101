package monday.subtitlefixer.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import monday.subtitlefixer.SubtitleFixer;

import org.junit.BeforeClass;
import org.junit.Test;

public class SubtitleFixerTest {
	private static File file1;
	private static File file2;

	@BeforeClass
	public static void init() throws IOException {

		file1 = new File("lost.s04e11.hdtv.xvid-2hd.srt");
		new SubtitleFixer(file1);
		file2 = new File("encoded");
	}

	@Test
	public void subtitleFixerTest() throws IOException {
		List<String> lines2 = Files.readAllLines(file2.toPath());
		List<String> lines = Files.readAllLines(file1.toPath());
		assertEquals(lines, lines2);
		assertFalse(!lines2.equals(lines));
	}
}
