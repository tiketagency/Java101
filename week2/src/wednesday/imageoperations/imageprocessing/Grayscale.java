package wednesday.imageoperations.imageprocessing;

import wednesday.imageoperations.components.Pixel;
import wednesday.imageoperations.interfaces.MatrixOperation;

public class Grayscale implements MatrixOperation {

	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		Pixel pixel = matrix[x][y];
		// get average of r g b - gray
		float r = pixel.getR();
		float g = pixel.getG();
		float b = pixel.getB();
		int average = (int) ((r + g + b) / 3);
		return new Pixel(average, average, average);
	}
}
