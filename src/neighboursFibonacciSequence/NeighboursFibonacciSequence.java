package neighboursFibonacciSequence;

public class NeighboursFibonacciSequence {
	public static int[] neighboursCollecting(int[][] matrix, int elementRow,int elementCol) {
		return null;
	}
	public static int[] arraySort(int[] array) {
		return null;
	}
	public static boolean isFibonacciSequence(int[] array) {
		return false;
	}
	public static boolean hasFibonnaciNeighbours(int[][] matrix) {
		for (int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(isFibonacciSequence(arraySort(neighboursCollecting(matrix,i,j)))) {
					return true;
				}
			}
		}
		return false;
	}
	
}
