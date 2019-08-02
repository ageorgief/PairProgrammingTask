package fibonacciSquareSequence;

import static org.junit.Assert.assertTrue;

public class FibonacciSquareSequence {
	public static boolean isFibonnaciNumber(long number1, long number2) {
		long currentNumber = 1, previousNumber = 0;
		while (currentNumber < number2) {
			long temp = previousNumber;
			previousNumber = currentNumber;
			currentNumber += temp;
		}
		return (currentNumber == number2 && previousNumber == number1);
	}

	public static int[][] croppingMatrix(int size, int firstCoordinate, int secondCoordinate, int[][] matrix) {
		int[][] croppedMatrix = new int[size][size];
		int row = 0, col = 0;
		for (int i = firstCoordinate; row < size; i++) {
			for (int j = secondCoordinate; col < size; j++) {
				croppedMatrix[row][col] = matrix[i][j];
				col++;
			}
			col = 0;
			row++;
		}
		return croppedMatrix;
	}

	public static boolean spiralMatrixWalk(int size, int firstCoordinate, int secondCoordinate, int[][] matrix) {
		int previousNumber = matrix[firstCoordinate][secondCoordinate];
		int currentNumber = matrix[firstCoordinate][secondCoordinate + 1];
		int counter = 0;
		int[][] croppedMatrix = croppingMatrix(size, firstCoordinate, secondCoordinate, matrix);
		if (isFibonnaciNumber(previousNumber, currentNumber)) {
			for (int i = 0; i < size / 2 + 1; i++) {
				for (int j = i; j < size - i; j++) {
					counter++;
					if (counter > 2) {
						if (croppedMatrix[i][j] != previousNumber + currentNumber) {
							return false;
						} else {
							previousNumber = currentNumber;
							currentNumber = croppedMatrix[i][j];
						}
					}

				}
				for (int j = i + 1; j < size - i; j++) {
					if (croppedMatrix[j][size - i - 1] != previousNumber + currentNumber) {
						return false;
					} else {
						previousNumber = currentNumber;
						currentNumber = croppedMatrix[j][size - i - 1];
					}
				}
				for (int j = size - i - 2; j >= 0 + i; j--) {
					if (croppedMatrix[size - i - 1][j] != previousNumber + currentNumber) {
						return false;
					} else {
						previousNumber = currentNumber;
						currentNumber = croppedMatrix[size - i - 1][j];
					}
				}
				for (int j = size - i - 2; j > 0 + i; j--) {
					if (croppedMatrix[j][i] != previousNumber + currentNumber) {
						return false;
					} else {
						previousNumber = currentNumber;
						currentNumber = croppedMatrix[j][i];
					}
				}
			}
		} 
		else {
			return false;
		}
		return true;
	}
	public static boolean containsFibonacciSequence(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				for (int s = 2; i + s < matrix.length && j + s < matrix[0].length; s++) {
					if (spiralMatrixWalk(s, i, j, matrix)) {
						return true;
					}
				}
			}
		}
		return false;
	}	
}
