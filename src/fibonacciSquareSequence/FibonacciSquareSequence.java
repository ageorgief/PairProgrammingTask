package fibonacciSquareSequence;

public class FibonacciSquareSequence {
	public static boolean isFibonnaciNumber(long number1, long number2) {
		long currentNumber = 1, previousNumber = 0;
		while (currentNumber < number2) {
			long temp = previousNumber;
			previousNumber = currentNumber;
			currentNumber += temp;
		}
		return (currentNumber == number2 && previousNumber == number1) ;
	}
	public static boolean spiralMatrixWalk(int size,int firstCoordinate,int secondCoordinate){
		return false;
	}
	public static boolean containsFibonacciSequence(int[][] matrix) {
		return false;
	}
	public static void main(String[] args) {
		
	}
}
