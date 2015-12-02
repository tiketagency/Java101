package wednesday.imageoperations.components;

import java.io.File;
import java.io.IOException;

import wednesday.imageoperations.imageprocessing.ImageReader;
import wednesday.imageoperations.imageprocessing.ImageWriter;
import wednesday.imageoperations.interfaces.MatrixOperation;

public class Matrix {
	private Pixel[][] matrix;
	private String name;

	public Matrix(File f, String name) {
		this.name = name;
		try {
			matrix = ImageReader.readImage(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void operate(MatrixOperation op) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = op.withPixel(i, j, matrix);
			}
		}
		ImageWriter.writeImage(matrix,name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sb.append(matrix[i][j] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
