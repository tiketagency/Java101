package monday.duplicatesfinder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class DuplicatesFinder {
	protected final class Key {
		/*
		 * Guarantee same hashCode for files which have same content
		 */
		private byte[] md5Hash;

		public Key(byte[] md5Hash) {
			this.md5Hash = md5Hash;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + Arrays.hashCode(md5Hash);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (this.md5Hash.length != other.md5Hash.length) {
				return false;
			}
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (!Arrays.equals(md5Hash, other.md5Hash))
				return false;
			return true;
		}

		private DuplicatesFinder getOuterType() {
			return DuplicatesFinder.this;
		}
	}

	private DuplicatesStorage storage;

	public DuplicatesFinder() {
		storage = new DuplicatesStorage();
	}

	public void findDuplicate(Path path, Options option) throws IOException,
			NoSuchAlgorithmException {
		File file = path.toFile();
		File[] files = file.listFiles();
		for (File file2 : files) {
			Path filePath = file2.toPath();
			if (file2.isDirectory()) {
				findDuplicate(filePath, option);
			} else {
				if (checkSize(filePath) && Files.isRegularFile(filePath)) {
					if (Files.isSymbolicLink(filePath)) {
						System.out.println("SYMBOLIC LINK ==> " + filePath);
						filePath = Files.readSymbolicLink(filePath);
					}
					byte[] hashedFile = MD5Hash.generateMd5(filePath);
					storage.storeFiles(new Key(hashedFile), filePath, option);
				}
			}
		}
	}

	private boolean checkSize(Path filePath) {
		return (filePath.toFile().length() / 1024) / 1024 < 512;
	}

	@Override
	public String toString() {
		return storage.toString();
	}
}
