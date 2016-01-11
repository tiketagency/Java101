package wednesday;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Task10_Histogram {
	/*
	 * Grayscale image histogram
	 * 
	 * int[] histogram(short[][] image)
	 * 
	 * A histogram is a representation of distribution of some data.
	 * 
	 * Here you receive a grayscale image matrix (image). Each of the matrix's
	 * values will be between 0 and 255. Return an array result, which is a
	 * histogram of image => the value of result[i] should be the ammount of
	 * times i is in the matrix image.
	 * 
	 * 
	 */
	public static int[][] imageReader(File file) {
		try {
			BufferedImage img = ImageIO.read(file);
			Raster raster = img.getData();
			int w = raster.getWidth(), h = raster.getHeight();
			int pixels[][] = new int[w][h];
			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					pixels[x][y] = raster.getSample(x, y, 0);
				}
			}
			return pixels;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static int[] createImageHistogram(int[][] image) {
		int[] arr = new int[256];
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				arr[image[i][j]]++;
			}
		}
		return arr;
	}

	public static void printHistogram(int[] histogram) {
		for (int i = 0; i < histogram.length; i++) {
			System.out.println(i + ": " + histogram[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		int[][] arr = imageReader(new File("src/wednesday/images/lego.jpg"));
		int[] histogram = createImageHistogram(arr);
		printHistogram(histogram);
	}
}
