package monday.mp3organizer.organizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;

import monday.duplicatesfinder.DuplicatesFinder;
import monday.mp3organizer.metadata.Mp3Metadata;

public class Mp3Organizer {
	private static PathMatcher matcher = FileSystems.getDefault()
			.getPathMatcher("glob:*.{mp3}");

	public void organizeSongs(Path path) throws IOException,
			NoSuchAlgorithmException, IllegalArgumentException {
		for (File file : path.toFile().listFiles()) {
			Path filePath = file.toPath();
			if (matcher.matches(filePath.getFileName())) {
				Id3TagExtractor extractor = new Id3TagExtractor(file);
				createArtistFolder(extractor.getMetaData(), file);
			}
		}
	}

	public void createArtistFolder(Mp3Metadata metaData, File file)
			throws IOException, NoSuchAlgorithmException {
		String artist = metaData.getArtist().toLowerCase();
		String parentDirectory = file.getParent();
		String albumName = metaData.getAlbum().toLowerCase();
		Path destination = Paths.get(parentDirectory + "/" + artist + "/"
				+ albumName);
		if (!Files.exists(Paths.get(parentDirectory + "/" + artist))) {
			FileManager.createDir(destination, file, metaData);
		} else {
			if (!destination.toFile().exists()) {
				FileManager.createDir(destination, file, metaData);
			}
			FileManager.copyFileToDir(destination, file,
					StandardCopyOption.REPLACE_EXISTING);

		}
		deleteIfExist(destination, file);
	}

	private void deleteIfExist(Path path, File file)
			throws NoSuchAlgorithmException, IOException {
		if (new File(path + "/" + file.getName()).exists()) {
			// remove duplicates
			file.delete();
		}
	}
}