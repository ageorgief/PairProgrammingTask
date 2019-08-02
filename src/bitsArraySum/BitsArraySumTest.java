package bitsArraySum;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitsArraySumTest {

	@Test
	public void When_arrangeArrayInvoked_Expect_ArrayToBeSorted() {
		BitsArraySum k = new BitsArraySum();
		int[][] matrix = { { 15, 85, 64, 97 }, { 9, 6, 16, 3 } };
		int[] arr = { 97, 85, 15, 64 };
		assertArrayEquals(arr, k.arrangeArray(matrix));
		int[][] matrix2 = { { 97 }, { 9 } };
		int[] arr2 = { 97 };
		assertArrayEquals(arr2, k.arrangeArray(matrix2));
		int[][] result = { { -1, 15, -3, -4 }, { 32, 6, 31, 30 } };
		int[] array = { 15, -4, -3, -1 };
		assertArrayEquals(array, k.arrangeArray(result));
	}

	@Test
	public void When_GetBitsOfNUmberInvoked_Expect_TheSumOfTheBits() {
		assertEquals(5, BitsArraySum.getBitsofNumber(211));
		assertEquals(10, BitsArraySum.getBitsofNumber(99_999));
		assertEquals(32, BitsArraySum.getBitsofNumber(-1));
		assertEquals(0, BitsArraySum.getBitsofNumber(0));
	}

	@Test
	public void When_BitMatrixBuilderInvokedWithPositiveNumbers_Expect_MatrixWithSecondRowFilledWithTheBitSums() {

		int[] array = { 1, 2, 3, 4, 0 };
		int[][] result = { { 1, 2, 3, 4, 0 }, { 1, 1, 2, 1, 0 } };
		assertArrayEquals(result, BitsArraySum.bitMatrixBuilding(array));
		int[] array1 = { 78, 564, 321, 1024 };
		int[][] result1 = { { 78, 564, 321, 1024 }, { 4, 4, 3, 1 } };
		assertArrayEquals(result1, BitsArraySum.bitMatrixBuilding(array1));
	}

	@Test
	public void When_BitMatrixBuilderInvokedWithNegativeNumbers_Expect_MatrixWithSecondRowFilledWithTheBitSums() {

		int[] array = { -1, -2, -3, -4 };
		int[][] result = { { -1, -2, -3, -4 }, { 32, 31, 31, 30 } };
		assertArrayEquals(result, BitsArraySum.bitMatrixBuilding(array));
		int[] array1 = { -78, -564, -321, -1024 };
		int[][] result1 = { { -78, -564, -321, -1024 }, { 28, 27, 30, 22 } };
		assertArrayEquals(result1, BitsArraySum.bitMatrixBuilding(array1));
	}

}
