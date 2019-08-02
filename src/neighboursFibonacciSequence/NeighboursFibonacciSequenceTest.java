package neighboursFibonacciSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class NeighboursFibonacciSequenceTest {

	@Test
	public void NeighboursCollecting_1x1Marix_Null() {
		int[][] matrix = { { 70 } };
		int elementRow = 0;
		int elementCol = 0;
		assertNull(NeighboursFibonacciSequence.neighboursCollecting(matrix, elementRow, elementCol));

	}

	@Test
	public void NeighboursCollecting_AtCornerOf4x4Matrix_ArrayWith3Elements() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int elementRow = 0;
		int elementCol = 0;
		int[] result = { 2, 6, 5 };
		assertArrayEquals(result, NeighboursFibonacciSequence.neighboursCollecting(matrix, elementRow, elementCol));

	}

	@Test
	public void NeighboursCollecting_1xnMarixElementAtCorner_1neighbour() {
		int[][] matrix = { { 1, 2, 3, 4 } };
		int elementRow = 0;
		int elementCol = 3;
		int[] result = new int[1];
		result[0] = 3;
		assertArrayEquals(result, NeighboursFibonacciSequence.neighboursCollecting(matrix, elementRow, elementCol));
	}

	@Test
	public void NeighboursCollecting_MarixElementInTheMiddle_ArrayWith8Elements() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int elementRow = 1;
		int elementCol = 1;
		int[] result = { 1, 2, 3, 7, 11, 10, 9, 5 };
		assertArrayEquals(result, NeighboursFibonacciSequence.neighboursCollecting(matrix, elementRow, elementCol));
	}

	@Test
	public void NeighboursCollecting_MarixElementOnTheBorder_ArrayWith5Elements() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int elementRow = 1;
		int elementCol = 3;
		int[] result = { 4, 3, 7, 11, 12 };
		assertArrayEquals(result, NeighboursFibonacciSequence.neighboursCollecting(matrix, elementRow, elementCol));
	}

	@Test
	public void When_isFibonacciSequence_Expect_True() {
		int[] array = { 3, 5, 8 };
		assertTrue(NeighboursFibonacciSequence.isFibonacciSequence(array));
		int[] array2 = { 0, 1, 1, 2, 3, 5, 8 };
		assertTrue(NeighboursFibonacciSequence.isFibonacciSequence(array2));
		int[] array3 = { 0, 1 };
		assertTrue(NeighboursFibonacciSequence.isFibonacciSequence(array3));
		int[] array4 = { 1 };
		assertTrue(NeighboursFibonacciSequence.isFibonacciSequence(array4));
	}

	@Test
	public void When_isNotFibonacciSequence_Expect_False() {
		int[] array = { 4, 5, 9 };
		assertFalse(NeighboursFibonacciSequence.isFibonacciSequence(array));
		int[] array2 = { 0, 1, 2, 3, 5, 8 };
		assertFalse(NeighboursFibonacciSequence.isFibonacciSequence(array2));
		int[] array3 = { 0, -1, -2, -3, -5, -8 };
		assertFalse(NeighboursFibonacciSequence.isFibonacciSequence(array3));
	}

	@Test
	public void When_emptyArrayGiven_Expect_EmptyArry() {
		int[] arr = new int[0];
		assertArrayEquals(new int[0],NeighboursFibonacciSequence.arraySort(arr));
	}

	@Test
	public void When_arrayGiven_Expect_toBeRetrunedSortedArray() {
		int[] array = { 1, 56, 42, 0, 89 };
		int[] sortedArray = { 0, 1, 42, 56, 89 };
		assertArrayEquals(sortedArray, NeighboursFibonacciSequence.arraySort(array));
		int[] arr = { -1, -56, -42, 0, 89 };
		int[] sortedArr = { -56, -42, -1, 0, 89 };
		assertArrayEquals(sortedArr, NeighboursFibonacciSequence.arraySort(arr));
	}
}
