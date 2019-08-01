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
		return false;
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
