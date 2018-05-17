
public class first {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 4, -2, 5 }, { 15, 24, -24, 20, 11 }, { -30, 15, 2, 4, 1 }, { 56, 12, 13, 3, 2 },
				{ 13, 23, 5, 3, 7 }, { 13, 14, 3, 16, 2 } };
		int min = matrix[0][0];
		int max = matrix[0][0];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				max = (matrix[row][col] > max) ? matrix[row][col] : max;
				min = (matrix[row][col] < min) ? matrix[row][col] : min;
			}
		}
		System.out.println("Nai-malkoto e " + min);
		System.out.println("Nai-golqmoto e " + max);
	}
}
