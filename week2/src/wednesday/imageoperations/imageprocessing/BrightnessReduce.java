package wednesday.imageoperations.imageprocessing;

import wednesday.imageoperations.components.Pixel;
import wednesday.imageoperations.interfaces.MatrixOperation;

public class BrightnessReduce implements MatrixOperation {
	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		Pixel p = matrix[x][y];
		int rgb = (int) ((p.getR() + p.getG() + p.getB()) + 5);
		if (rgb > 255) {
			rgb = 255;
		}
		if (rgb < 0) {
			rgb = 0;
		}
		return new Pixel(rgb, rgb, rgb);
	}
}
