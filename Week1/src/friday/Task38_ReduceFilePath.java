package friday;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task38_ReduceFilePath {
	@Test
	public void reduceFilePathTest() {
		assertEquals("", reduceFilePath(""));
		assertEquals("/", reduceFilePath("/"));
		assertEquals("/", reduceFilePath("/srv/../"));
		assertEquals("/srv/www/htdocs/wtf", reduceFilePath("/srv/www///htdocs/wtf/"));
		assertEquals("/srv", reduceFilePath("/srv/./././././"));
		assertEquals("/etc/wtf", reduceFilePath("/etc//wtf/"));
		assertEquals("/", reduceFilePath("/etc///../etc/../etc/../"));
		assertEquals("/hahaha", reduceFilePath("/a/..///..//..//hahaha/.//..//"));
		assertEquals("/", reduceFilePath("/../"));
		assertEquals("/a/wcf", reduceFilePath("/a/./../wcf/./././../"));
		assertEquals("/", reduceFilePath("/etc/../etc/../etc/../"));
		assertEquals("/", reduceFilePath("/../"));
		assertEquals("/", reduceFilePath("/..///"));
	}

	static final String slashesRegex = "\\/+";
	static final String currentDirRegex = "\\./";
	static final String lastSlashRegex = "/$";

	public static String reduceFilePath(String path) {
		if (path.isEmpty()) {
			return "";
		}
		path = path.replaceAll(slashesRegex, "/");
		StringBuilder sb = new StringBuilder(path);
		int len = sb.length();
		for (int i = len; i > 3; i--) {
			if (sb.substring(i - 4, i).equals("/../")) {
				sb.delete(i - 4, i);
				i -= 5;
				while (i > 0 && sb.charAt(i) != '/') {
					sb.deleteCharAt(i--);
				}
				i += 2;
			}
		}
		sb.append("/");
		path = sb.toString();
		path = path.replaceAll(slashesRegex, "/").replaceAll(currentDirRegex, "");
		return path.length() > 1 ? path.replaceFirst(lastSlashRegex, "") : path;
	}
}
