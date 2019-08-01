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
	}

	@Test
	public void getBitsOfNumberTest() {
		assertEquals(5, BitsArraySum.getBitsofNumber(211));
		assertEquals(10, BitsArraySum.getBitsofNumber(99_999));
		assertEquals(0, BitsArraySum.getBitsofNumber(0));
	}

	@Test
	public void testArray() {

		int[] array = { 1, 2, 3, 4 };
		int[][] result = { { 1, 2, 3, 4 }, { 1, 1, 2, 1 } };
		assertArrayEquals(result, BitsArraySum.bitMatrixBuilding(array));
	}
}
