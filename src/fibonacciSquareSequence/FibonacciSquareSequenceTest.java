package fibonacciSquareSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSquareSequenceTest {

	@Test
	public void When_CheckIfFibonacciNumberIsFibonacciNumber_Expect_True() {
		assertTrue(FibonacciSquareSequence.areFibonnaciNumbers(317811, 514229));
		assertTrue(FibonacciSquareSequence.areFibonnaciNumbers(1, 1));
		assertTrue(FibonacciSquareSequence.areFibonnaciNumbers(0, 1));
	}

	@Test
	public void When_CheckIfNoFibonacciNumberIsFibonacciNumber_Expect_False() {
		assertFalse(FibonacciSquareSequence.areFibonnaciNumbers(317815, 514229));
		assertFalse(FibonacciSquareSequence.areFibonnaciNumbers(1, 0));
		assertFalse(FibonacciSquareSequence.areFibonnaciNumbers(1, 7));
	}

	@Test
	public void When_MatrixContainsFibonacciSequence_Expect_True() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 1, 3, 5, 8 }, { 1, 89, 144, 13 }, { 1, 55, 34, 21 } };
		assertTrue(FibonacciSquareSequence.spiralMatrixWalk(3, 1, 1, matrix));
		int[][] matrix2 = { { 1, 1, 1, 1, 1, 1 }, { 2, 3, 5, 8, 13, 1 }, { 2584, 4181, 6765, 10946, 21, 1 },
				{ 1597, 121393, 196418, 17711, 34, 1 }, { 987, 75025, 46368, 28657, 55, 1 },
				{ 610, 377, 233, 144, 89, 1 } };
		assertTrue(FibonacciSquareSequence.spiralMatrixWalk(5, 1, 0, matrix2));
		int[][] matrix3 = { { 1, 2, 3, 5, 8, 13 }, { 1, 2584, 4181, 6765, 10946, 21, },
				{ 1, 1597, 121393, 196418, 17711, 34 }, { 1, 987, 75025, 46368, 28657, 55 },
				{ 1, 610, 377, 233, 144, 89 }, { 1, 1, 1, 1, 1, 1 } };
		assertTrue(FibonacciSquareSequence.spiralMatrixWalk(5, 0, 1, matrix3));
	}
	
	@Test
	public void When_MatrixDoesntContainFibonacciSequence_Expect_False() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 1, 3, 7, 8 }, { 1, 89, 144, 13 }, { 1, 55, 34, 21 } };
		assertFalse(FibonacciSquareSequence.spiralMatrixWalk(3, 1, 1, matrix));
		int[][] matrix2 = { { 1, 1, 1, 1, 1, 1 }, { 2, 3, 12, 8, 13, 1 }, { 2584, 4181, 67685, 10946, 21, 1 },
				{ 1597, 121393, 196418, 17711, 34, 1 }, { 987, 75025, 46368, 28657, 55, 1 },
				{ 610, 377, 233, 144, 89, 1 } };
		assertFalse(FibonacciSquareSequence.spiralMatrixWalk(5, 1, 0, matrix2));
		int[][] matrix3 = { { 1, 2, 3, 5, 82, 13 }, { 1, 2584, 4181, 6765, 10946, 21, },
				{ 1, 1597, 121393, 196418, 17711, 34 }, { 1, 9877, 75025, 46368, 28657, 55 },
				{ 1, 610, 377, 233, 144, 89 }, { 1, 1, 1, 1, 1, 1 } };
		assertFalse(FibonacciSquareSequence.spiralMatrixWalk(5, 0, 1, matrix3));
	}

	@Test
	public void When_CroppingMatrix_Expect_ExactMatrix() {
		int[][] matrix = { { 1, 1, 1, 1, 1, 1 }, { 2, 3, 5, 8, 13, 1 }, { 2584, 4181, 6765, 10946, 21, 1 },
				{ 1597, 121393, 196418, 17711, 34, 1 }, { 987, 75025, 46368, 28657, 55, 1 },
				{ 610, 377, 233, 144, 89, 1 } };
		int[][] croppedMatrix = FibonacciSquareSequence.croppingMatrix(5, 1, 0, matrix);
		int[][] testMatrix = { { 2, 3, 5, 8, 13 }, { 2584, 4181, 6765, 10946, 21 }, { 1597, 121393, 196418, 17711, 34 },
				{ 987, 75025, 46368, 28657, 55 }, { 610, 377, 233, 144, 89 } };
		assertArrayEquals(croppedMatrix, testMatrix);
	}
	
	@Test
	public void When_MatrixContainsFibonacciSequence_Expect_ToBeFoundAndToBeReturnedTrue() {
		int[][] matrix = { { 1, 1, 1, 1, 1, 1 }, { 2, 3, 5, 8, 13, 1 }, { 2584, 4181, 6765, 10946, 21, 1 },
				{ 1597, 121393, 196418, 17711, 34, 1 }, { 987, 75025, 46368, 28657, 55, 1 },
				{ 610, 377, 233, 144, 89, 1 } };
		assertTrue(FibonacciSquareSequence.containsFibonacciSequence(matrix));
	}
	@Test
	public void When_MatrixDoesntContainFibonacciSequence_Expect_NotToBeFoundAndToBeReturnedFalse() {
		int[][] matrix = { { 1, 1, 1, 1, 1, 1 }, { 2, 3, 5, 18, 13, 1 }, { 2584, 41881, 6765, 10946, 21, 1 },
				{ 1597, 12139, 196418, 16711, 34, 1 }, { 987, 7525, 46368, 2657, 55, 1 },
				{ 610, 377, 233, 14, 89, 1 } };
		assertFalse(FibonacciSquareSequence.containsFibonacciSequence(matrix));
	}
}
