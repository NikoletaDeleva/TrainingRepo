
public class five {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int maxSumRow = 0;
		int maxSumCol = 0;
		int sumRow = 0;
		int sumCol = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				sumRow += matrix[row][col];
			}
			if (sumRow > maxSumRow) {
				maxSumRow = sumRow;
			}
			sumRow = 0;
		}
		for (int col = 0; col < matrix.length; col++) {
			for (int row = 0; row < matrix.length; row++) {
				sumCol += matrix[row][col];
			}
			if (sumCol > maxSumCol) {
				maxSumCol = sumCol;
			}
			sumCol = 0;
		}
		System.out.println("Maksimalnata suma po redowe e: " + maxSumRow);
		System.out.println("Maksimalnata suma po coloni e: " + maxSumCol);
		System.out.println((maxSumRow > maxSumCol) ? "sumata po redove e > ot sumata po koloni"
				: "Sumata po koloni e > ot sumata po redove");
	}

}
