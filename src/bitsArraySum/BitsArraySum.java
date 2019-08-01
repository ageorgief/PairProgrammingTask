package bitsArraySum;

public class BitsArraySum {
	public static int getBitsofNumber(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 2;
			number = number / 2;
		}
		return sum;
	}

	public static int[][] bitMatrixBuilding(int[] array) {
		return null;
	}

	private static void sort(int[][] matrix, int start, int end) {
		if (start < end) {
			int m = start + (end - start) / 2;
			sort(matrix, start, m);
			sort(matrix, m + 1, end);
			merge(matrix, start, m, end);
		}
	}

	private static void merge(int[][] matrix, int startFirst, int endFirst, int endSecond) {
		int firstSubArraySize = endFirst - startFirst + 1;
		int secondSubArraySize = endSecond - endFirst;

		int[][] firstSub = new int[2][firstSubArraySize];
		int[][] secondSub = new int[2][secondSubArraySize];
		for (int i = 0; i < firstSubArraySize; i++) {
			firstSub[0][i] = matrix[0][startFirst + i];
			firstSub[1][i] = matrix[1][startFirst + i];
		}
		for (int i = 0; i < secondSubArraySize; i++) {
			secondSub[0][i] = matrix[0][endFirst + 1 + i];
			secondSub[1][i] = matrix[1][endFirst + 1 + i];
		}
		int i = 0, j = 0, k = startFirst;
		while (i < firstSubArraySize && j < secondSubArraySize) {
			if (firstSub[1][i] < secondSub[1][j]) {
				matrix[0][k] = firstSub[0][i];
				matrix[1][k] = firstSub[1][i];
				i++;
			} else {
				matrix[0][k] = secondSub[0][j];
				matrix[1][k] = secondSub[1][j];
				j++;

			}
			k++;
		}

		while (i < firstSubArraySize) {
			matrix[0][k] = firstSub[0][i];
			matrix[1][k] = firstSub[1][i];
			i++;
			k++;
		}
		while (j < secondSubArraySize) {
			matrix[0][k] = secondSub[0][j];
			matrix[1][k] = secondSub[1][j];
			k++;
			j++;
		}
	}

	public int[] arrangeArray(int[][] matrix) {
		sort(matrix, 0, matrix[0].length - 1);
		return matrix[0];

	}

}
