package monday.mp3organizer.metadata;

public class Mp3MetaDataChecker {
	private Mp3Metadata data;
	public static final String UNKNOWN_STATUS = null;
	public static final char BAD_ENCODING = '?';

	public Mp3MetaDataChecker(Mp3Metadata mp3MetaData) {
		data = mp3MetaData;
	}

	public boolean hasAlbumTag() {
		return checkTag(data.getAlbum());
	}

	public boolean hasArtistTag() {
		return checkTag(data.getArtist());
	}

	public boolean checkTag(String tag) {
		return tag.equals(UNKNOWN_STATUS) || tag.isEmpty()
				|| checkForBadEncoding(tag);
	}

	private boolean checkForBadEncoding(String tag) {
		return tag.indexOf(BAD_ENCODING) != -1;
	}
}
