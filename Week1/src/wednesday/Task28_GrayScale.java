package wednesday;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Task28_GrayScale {

	public static void makeGray(File file) throws IOException {
		BufferedImage bi = ImageIO.read(file);
		for (int x = 0; x < bi.getWidth(); ++x)
			for (int y = 0; y < bi.getHeight(); ++y) {
				// get every pixel color
				Color c = new Color(bi.getRGB(x, y));
				// get average of r g b - gray
				int r = c.getRed();
				int g = c.getGreen();
				int b = c.getBlue();
				int average = (r + g + b) / 3;
				// set same pixel with the new color - gray
				Color gray = new Color(average, average, average);
				bi.setRGB(x, y, gray.getRGB());
			}
		File f = new File("src/wednesday/images/grayLego.png");
		ImageIO.write(bi, "PNG", f);
	}

	public static void main(String[] args) throws IOException {
		makeGray(new File("src/wednesday/images/lego.jpg"));
	}
}
