package neighboursFibonacciSequence;

public class NeighboursFibonacciSequence {

	public static int[] neighboursCollecting(int[][] matrix, int elementRow, int elementCol) {

		return null;
	}

	private static void sort(int[] arr, int start, int end) {
		if (start < end) {
			int m = start + (end - start) / 2;
			sort(arr, start, m);
			sort(arr, m + 1, end);
			merge(arr, start, m, end);
		}
	}

	private static void merge(int[] arr, int startFirst, int endFirst, int endSecond) {
		int firstSubArraySize = endFirst - startFirst + 1;
		int secondSubArraySize = endSecond - endFirst;

		int[] firstSub = new int[firstSubArraySize];
		int[] secondSub = new int[secondSubArraySize];
		for (int i = 0; i < firstSubArraySize; i++) {
			firstSub[i] = arr[startFirst + i];
		}
		for (int i = 0; i < secondSubArraySize; i++) {
			secondSub[i] = arr[endFirst + 1 + i];
		}
		int i = 0, j = 0, k = startFirst;
		while (i < firstSubArraySize && j < secondSubArraySize) {
			if (firstSub[i] < secondSub[j]) {
				arr[k] = firstSub[i];
				i++;
			} else {

				arr[k] = secondSub[j];
				j++;

			}
			k++;
		}

		while (i < firstSubArraySize) {
			arr[k] = firstSub[i];
			i++;
			k++;
		}
		while (j < secondSubArraySize) {
			arr[k] = secondSub[j];
			k++;
			j++;
		}
	}

	public static int[] arraySort(int[] array) {
		sort(array, 0, array.length - 1);
		return array;
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
