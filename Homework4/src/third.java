
public class third {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 4, -2, 5 }, { 15, 24, -24, 20, 11 }, { -30, 15, 2, 4, 1 }, { 56, 12, 13, 3, 2 },
				{ 13, 23, 5, 3, 7 }, { 13, 14, 3, 16, 2 } };
		
		int sum = 0;
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				sum+=matrix[row][col];
				count++;
			}
		}
		System.out.println("Sumata e: " + sum);
		System.out.println("Sredno aretmetichnoto e: " + ((float) sum/count));
	}
}
