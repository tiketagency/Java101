package wednesday.imageoperations.interfaces;

import wednesday.imageoperations.components.Pixel;

public interface MatrixOperation {
	Pixel withPixel(int x, int y, Pixel[][] matrix);
}
