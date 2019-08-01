package bitsArraySum;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitsArraySumTest {

	@Test
	public void getBitsOfNumberTest() {
		assertEquals(BitsArraySum.getBitsofNumber(211),5);
		assertEquals(BitsArraySum.getBitsofNumber(99_999),10);
	}

}
