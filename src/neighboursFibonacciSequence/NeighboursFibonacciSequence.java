package neighboursFibonacciSequence;

public class NeighboursFibonacciSequence {
	public static int[] neighboursCollecting(int[][] matrix, int elementRow, int elementCol) {
		boolean one = ((elementRow - 1 < 0) && (elementCol - 1 < 0));
		boolean two = ((elementRow - 1 < 0) && (elementCol + 1 >= matrix[elementRow].length));
		boolean three = ((elementRow + 1 >= matrix.length) && ((elementCol + 1 >= matrix[elementRow].length)));
		boolean four = ((elementRow + 1 >= matrix.length) && (elementCol - 1 < 0));
		int[] result1 = new int[1];
		int[] result2 = new int[2];
		if (one && four && three && two) // matrix 1x1
		{
			return null;
		}
		if (one || two || three || four) { // at the corner
			int[] result = new int[3];
			if (one) {
				if (elementRow + 1 >= matrix.length) // First element of matrix 1xn
				{
					result1[0] = matrix[elementRow][elementCol + 1];
					return result1;
				} else if (elementCol + 1 >= matrix[elementRow].length) // First element of nx1 matrix
				{
					result1[0] = matrix[elementRow - 1][elementCol];
					return result1;
				} else {
					result[0] = matrix[0][1];
					result[1] = matrix[1][1];
					result[2] = matrix[1][0];
					return result;
				}
			} else if (two) {
				if (elementRow + 1 >= matrix.length)// Last element of matrix 1xn
				{
					result1[0] = matrix[elementRow][elementCol - 1];
					return result1;
				} else {
					result[0] = matrix[0][elementCol - 1];
					result[1] = matrix[1][elementCol - 1];
					result[2] = matrix[1][elementCol];
					return result;
				}
			} else if (three) {
				if (elementCol - 1 < 0) // LastElement of nx1 matrix
				{
					result1[0] = matrix[elementRow - 1][elementCol];
					return result1;
				} else {
					result[0] = matrix[elementRow - 1][elementCol];
					result[1] = matrix[elementRow - 1][elementCol - 1];
					result[2] = matrix[elementRow][elementCol - 1];
					return result;
				}
			} else {
				result[0] = matrix[elementRow - 1][elementCol];
				result[1] = matrix[elementRow - 1][elementCol + 1];
				result[2] = matrix[elementRow][elementCol + 1];
				return result;
			}
		} else if ((elementRow - 1 < 0) && (elementRow + 1 >= matrix.length))//
		{
			result2[0] = matrix[elementRow][elementCol - 1];
			result2[1] = matrix[elementRow][elementCol + 1];
			return result2;
		} else if ((elementCol - 1 < 0) && (elementCol + 1 >= matrix[elementRow].length))//
		{
			result2[0] = matrix[elementRow - 1][elementCol];
			result2[1] = matrix[elementRow + 1][elementCol];
			return result2;
		} else if (elementRow - 1 < 0 || elementCol + 1 >= matrix[elementRow].length || elementRow + 1 >= matrix.length
				|| elementCol - 1 < 0) // on the border
		{
			int[] result = new int[5];
			if (elementRow - 1 < 0) {
				result[0] = matrix[elementRow][elementCol - 1];
				result[1] = matrix[elementRow][elementCol + 1];
				result[2] = matrix[elementRow + 1][elementCol - 1];
				result[3] = matrix[elementRow + 1][elementCol];
				result[4] = matrix[elementRow + 1][elementCol + 1];
				return result;
			} else if (elementCol + 1 >= matrix[elementRow].length) {
				result[0] = matrix[elementRow - 1][elementCol];
				result[1] = matrix[elementRow - 1][elementCol - 1];
				result[2] = matrix[elementRow][elementCol - 1];
				result[3] = matrix[elementRow + 1][elementCol - 1];
				result[4] = matrix[elementRow + 1][elementCol];
				return result;
			} else if (elementRow + 1 >= matrix.length) {
				result[0] = matrix[elementRow][elementCol - 1];
				result[1] = matrix[elementRow - 1][elementCol - 1];
				result[2] = matrix[elementRow - 1][elementCol];
				result[3] = matrix[elementRow - 1][elementCol + 1];
				result[4] = matrix[elementRow][elementCol + 1];
				return result;
			} else {
				result[0] = matrix[elementRow - 1][elementCol];
				result[1] = matrix[elementRow - 1][elementCol + 1];
				result[2] = matrix[elementRow][elementCol + 1];
				result[3] = matrix[elementRow + 1][elementCol + 1];
				result[4] = matrix[elementRow + 1][elementCol];
				return result;
			}
		} else // in the middle
		{
			int[] result = new int[8];
			result[0] = matrix[elementRow - 1][elementCol - 1];
			result[1] = matrix[elementRow - 1][elementCol];
			result[2] = matrix[elementRow - 1][elementCol + 1];
			result[3] = matrix[elementRow][elementCol + 1];
			result[4] = matrix[elementRow + 1][elementCol + 1];
			result[5] = matrix[elementRow + 1][elementCol];
			result[6] = matrix[elementRow + 1][elementCol - 1];
			result[7] = matrix[elementRow][elementCol - 1];
			return result;
		}
	}

	public static int[] arraySort(int[] array) {
		return null;
	}

	public static boolean isFibonacciSequence(int[] array) {
		return false;
	}

	public static boolean hasFibonnaciNeighbours(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (isFibonacciSequence(arraySort(neighboursCollecting(matrix, i, j)))) {
					return true;
				}
			}
		}
		return false;
	}

}
