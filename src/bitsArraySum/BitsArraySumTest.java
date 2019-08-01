package bitsArraySum;
import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitsArraySumTest {

	@Test
	public void getBitsOfNumberTest() {
		assertEquals(BitsArraySum.getBitsofNumber(211),5);
		assertEquals(BitsArraySum.getBitsofNumber(99_999),10);
	}
	@Test
	public void testArray() {
		
		int[] array = {
				1,2,3,4
		};
		int[][] result =
			{
					{1,2,3,4},
					{1,1,2,1}
			};
		assertTrue(java.util.Arrays.deepEquals(result,BitsArraySum.bitMatrixBuilding(array)));
	}
}
