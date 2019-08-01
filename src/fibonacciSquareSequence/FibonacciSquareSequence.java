package fibonacciSquareSequence;

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

	public static boolean spiralMatrixWalk(int size, int firstCoordinate, int secondCoordinate, int[][] matrix) {
		int previousNumber = matrix[firstCoordinate][secondCoordinate];
		int currentNumber = matrix[firstCoordinate][secondCoordinate + 1];
		int counter = 0;
		if (isFibonnaciNumber(previousNumber, currentNumber)) {
			for (int i = firstCoordinate; i < size / 2 + 1; i++) {
				for (int j = secondCoordinate; j < size - i; j++) {
					counter++;
					if (counter > 2) {
						if (matrix[i][j] != previousNumber + currentNumber) {
							return false;
						} else {
							previousNumber = currentNumber;
							currentNumber = matrix[i][j];
						}
					}
				}
				for (int j = i + 1; j < size - i; j++) {
					if (matrix[j][size - i - 1] != previousNumber + currentNumber) {
						return false;
					} else {
						previousNumber = currentNumber;
						currentNumber = matrix[j][size - i - 1];
					}
				}
				for (int j = size - i - 2; j >= 0 + i; j--) {
					if (matrix[size - i - 1][j] != previousNumber + currentNumber) {
						return false;
					} else {
						previousNumber = currentNumber;
						currentNumber = matrix[size - i - 1][j];
					}
				}
				for (int j = size - i - 2; j > 0 + i; j--) {
					if (matrix[j][i] != previousNumber + currentNumber) {
						return false;
					} else {
						previousNumber = currentNumber;
						currentNumber = matrix[j][i];
					}
				}
			}
		} else {
			return false;
		}

		return true;
	}

	public static boolean containsFibonacciSequence(int[][] matrix) {
		return false;
	}
}
