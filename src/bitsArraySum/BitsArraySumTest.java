package bitsArraySum;


import static org.junit.Assert.*;

import org.junit.Test;

public class BitsArraySumTest {

	@Test
	public void test() {
		fail("Not yet implemented");
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
		assertArrayEquals(result,BitsArraySum.bitMatrixBuilding(array));
	}
}
