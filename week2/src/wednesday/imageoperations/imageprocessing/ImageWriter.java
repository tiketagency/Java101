package wednesday.imageoperations.imageprocessing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import wednesday.imageoperations.components.Pixel;

public class ImageWriter {
	public static void writeImage(Pixel[][] matrix, String name) {
		BufferedImage bufferedImage = new BufferedImage(matrix.length, matrix[0].length, BufferedImage.TYPE_INT_ARGB);
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j) {
				// get every pixel color
				Pixel pixel = matrix[i][j];
				// get average of r g b - gray
				int r = (int) pixel.getR();
				int g = (int) pixel.getG();
				int b = (int) pixel.getB();
				Color color = new Color(r, g, b);
				bufferedImage.setRGB(i, j, color.getRGB());
			}
		File f = new File("src/images/" + name + ".png");
		try {
			ImageIO.write(bufferedImage, "PNG", f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
