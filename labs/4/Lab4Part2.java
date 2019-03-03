
public class Lab4Part2 {

	public static void main(String[] args) {
		double[][] matrix = new double[5][5]; // JA: These were chars
		
		for (int row = 0; row < matrix.length; row++ ) {
			for (int column = 0; column < matrix[row].length; column++ ) {
				matrix[row][column] = (int)(Math.random() * 100);
			}
		}
		for (int row = 0; row < matrix.length; row++ ) {
			for (int column = 0; column < matrix[row].length; column++ ) {
				System.out.print(matrix[row][column] + " ");
				
			}
		System.out.println();
		}
	}
}


