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

	public static int[] arrangeArray(int[][] matrix) {
		return null;
	}

}
