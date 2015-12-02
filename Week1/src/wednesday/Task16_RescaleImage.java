package wednesday;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Task16_RescaleImage {
	/*
	 * Rescale an image using nearest neighbour interpolation
	 * 
	 * int[][] rescale(int[][] original, int newWidth, int newHeight)
	 * 
	 * You are given an image original. Rescale it to newWidth, newHeight, using
	 * nearest neighbour interpolation. (See
	 * http://en.wikipedia.org/wiki/Nearest-neighbor_interpolation)
	 */

	public static void main(String[] args) throws IOException {
		int[][] arrs = Task10_Histogram.imageReader(new File("src/wednesday/images/lego.jpg"));
		int[][] resized = rescale(arrs, 300, 300);
		BufferedImage img = new BufferedImage(resized.length, resized[0].length, BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < resized.length; x++) {
			for (int y = 0; y < resized[x].length; y++) {
				img.setRGB(x, y, resized[x][y]);
			}
		}
		File imageFile = new File("src/wednesday/images/resized.jpg");
		ImageIO.write(img, "jpg", imageFile);
	}

	public static int[][] rescale(int[][] original, int newWidth, int newHeight) {
		int[][] newImage = new int[newHeight][newWidth];
		double height = (double) newHeight / original.length;
		double width = (double) newWidth / original[0].length;
		int pw = 0;
		for (int i = 0; i < newHeight; i++) {
			int ph = (int) (i / height);
			for (int j = 0; j < newWidth; j++) {
				pw = (int) (j / width);
				int pixel = original[ph][pw];
				newImage[i][j] = pixel;
			}
		}
		return newImage;
	}
}
