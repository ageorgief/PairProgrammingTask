package bitsArraySum;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitsArraySumTest {

	

	@Test
	public void When_arrangeArrayInvoked_Expect_ArrayToBeSorted() {
		BitsArraySum k = new BitsArraySum();
		int[][] matrix = { { 15, 85, 64, 97 }, { 9, 6, 16, 3 } };
		int[] arr = { 97, 85, 15, 64 };
		assertArrayEquals(arr,k.arrangeArray(matrix));
	}
	@Test
	public void getBitsOfNumberTest() {
		assertEquals(BitsArraySum.getBitsofNumber(211),5);
		assertEquals(BitsArraySum.getBitsofNumber(99_999),10);

	}

}
