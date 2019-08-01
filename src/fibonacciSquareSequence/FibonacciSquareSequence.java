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

<<<<<<< HEAD
	public static boolean spiralMatrixWalk(int size, int firstCoordinate, int secondCoordinate, int[][] matrix) {
=======
	public static boolean spiralMatrixWalk(int size, int firstCoordinate, int secondCoordinate) {
		int previousNumber = matrix[firstCoordinate][secondCoordinate];
		if (isFibonnaciNumber(matrix[firstCoordinate][secondCoordinate], secondCoordinate)) {
			for (int i = 0; i < size / 2 + 1; i++) {
				for (int j = i; j < size - i; j++) {
					if(i ==0 && j > 1 || i > 0) {
						if()
					}
				}
				for (int j = i + 1; j < size - i; j++) {
				}
				for (int j = size - i - 2; j >= 0 + i; j--) {
				}
				for (int j = size - i - 2; j > 0 + i; j--) {
				}
			}
		}
		else {
			return false;
		}

>>>>>>> ef02af5556d0c4fa890439f4e3786b6b764af994
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
