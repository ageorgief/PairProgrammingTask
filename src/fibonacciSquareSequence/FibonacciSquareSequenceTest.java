package fibonacciSquareSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSquareSequenceTest {

	@Test

	public void testIsFibonacciNumber() {
		assertTrue(FibonacciSquareSequence.isFibonnaciNumber(317811, 514229));
		assertFalse(FibonacciSquareSequence.isFibonnaciNumber(22, 22));
	}

	public void testSpiralMatrixWalk() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 1, 3, 5, 8 }, { 1, 89, 144, 13 }, { 1, 55, 34, 21 } };
		assertTrue(FibonacciSquareSequence.spiralMatrixWalk(3, 1, 1, matrix));

		int[][] matrix2 = { { 1, 1, 1, 1, 1, 1 }, { 2, 3, 5, 8, 13, 1 }, { 2584, 4181, 6765, 10946, 21, 1 },
				{ 1597, 121393, 196418, 17711, 34, 1 }, { 987, 75025, 46368, 28657, 55, 1 },
				{ 610, 377, 233, 144, 89, 1 } };
		assertTrue(FibonacciSquareSequence.spiralMatrixWalk(5, 1, 0, matrix2));
	}

	public void testCroppingMatrix() {
		int[][] matrix = { { 1, 1, 1, 1, 1, 1 }, { 2, 3, 5, 8, 13, 1 }, { 2584, 4181, 6765, 10946, 21, 1 },
				{ 1597, 121393, 196418, 17711, 34, 1 }, { 987, 75025, 46368, 28657, 55, 1 },
				{ 610, 377, 233, 144, 89, 1 } };
		int[][] croppedMatrix = FibonacciSquareSequence.croppingMatrix(5, 1, 0, matrix);
		int[][] testMatrix = { { 2, 3, 5, 8, 13 }, { 2584, 4181, 6765, 10946, 21 }, { 1597, 121393, 196418, 17711, 34 },
				{ 987, 75025, 46368, 28657, 55 }, { 610, 377, 233, 144, 89 } };
		assertArrayEquals(croppedMatrix, testMatrix);
	}
}
