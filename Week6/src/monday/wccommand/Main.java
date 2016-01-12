package monday.wccommand;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println(WcCommand.wordCount(new File("testData/A/a")));
		System.out.println(WcCommand.wordCount(Paths.get("prop.properties")));
	}
}
