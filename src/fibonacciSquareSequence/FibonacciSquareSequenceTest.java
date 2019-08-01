package fibonacciSquareSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSquareSequenceTest {

	@Test
	public void testIsFibonacciNumber() {
		assertTrue(FibonacciSquareSequence.isFibonnaciNumber(317811,514229));
		assertFalse(FibonacciSquareSequence.isFibonnaciNumber(22,22));
	}
	public void testSpiralMatrixWalk() {
		
	}

}
