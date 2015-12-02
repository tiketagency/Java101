package wednesday.imageoperations.imageprocessing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import wednesday.imageoperations.components.Pixel;

public class ImageReader {

	public static Pixel[][] readImage(File file) throws IOException {
		BufferedImage image = ImageIO.read(file);
		Pixel[][] matrix = new Pixel[image.getWidth()][image.getHeight()];
		for (int x = 0; x < image.getWidth(); ++x)
			for (int y = 0; y < image.getHeight(); ++y) {
				Color c = new Color(image.getRGB(x, y));
				int r = c.getRed();
				int g = c.getGreen();
				int b = c.getBlue();
				Pixel pixel = new Pixel(r, g, b);
				matrix[x][y] = pixel;
			}
		return matrix;
	}
}
