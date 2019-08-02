package neighboursFibonacciSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class NeighboursFibonacciSequenceTest {

	@Test
	public void NeighboursCollecting_1x1Marix_Null() {
		int[][] matrix = { { 70 } };
		int elementRow = 0;
		int elementCol = 0;
		int[] result = null;
		assertArrayEquals(result, NeighboursFibonacciSequence.neighboursCollecting(matrix, elementRow, elementCol));

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
}
