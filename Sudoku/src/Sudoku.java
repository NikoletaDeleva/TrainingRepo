
public class Sudoku {
	// verification function
	public static boolean verification(byte[][] sudoku) {
		if ((sudoku == null)) {
			return false;
		}
		for (int row = 0; row < sudoku.length; row++) {
			for (int col = 0; col < sudoku[row].length; col++) {
				if ((sudoku[row][col] < 1 || sudoku[row][col] > 9) || (sudoku.length != 9 || sudoku[row].length != 9)) {
					return false;
				}
			}
		}
		return true;
	}// verification function

	// check rows function
	public static boolean checkRows(byte[][] sudoku) {

		for (int row = 0; row < sudoku.length; row++) {
			for (int col = 0; col < sudoku[row].length - 1; col++) {
				for (int index = col + 1; index < sudoku[row].length; index++) {
					if (sudoku[row][col] == sudoku[row][index]) {
						return false;
					}
				}
			}
		}

		return true;
	}// check rows function

	// check columns function
	public static boolean checkCols(byte[][] sudoku) {

		for (int col = 0; col < sudoku.length; col++) {
			for (int row = 0; row < sudoku[col].length - 1; row++) {
				for (int index = row + 1; index < sudoku[col].length; index++) {
					if (sudoku[row][col] == sudoku[index][col]) {
						return false;
					}
				}
			}
		}

		return true;
	}// check columns function

	// check quadrants function
	public static boolean checkQuadrants(byte[][] sudoku) {

		for (int row = 0; row < sudoku.length; row += 3) {
			for (int col = 0; col < sudoku[row].length; col += 3) {
				for (int pos = 0; pos < sudoku.length - 1; pos++) {
					for (int pos2 = pos + 1; pos2 < sudoku[row].length; pos2++) {
						if (sudoku[row + pos % 3][col + pos / 3] == sudoku[row + pos2 % 3][col + pos2 / 3]) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}// check quadrants function
	
	// check Sudoku function
	public static boolean checkSudoku(byte[][] sudoku) {
		if ((verification(sudoku) == true && checkRows(sudoku) == true && checkCols(sudoku) == true
				&& checkQuadrants(sudoku) == true)) {
			return true;
		} else {
			return false;
		}
	}// check Sudoku function

	public static void main(String[] args) {
		byte[][] sudoku = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		byte[][] sudoku1 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 2, 3, 4, 5, 6, 7, 8, 9, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 1, 2 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, { 8, 9, 1, 2, 3, 4, 5, 6, 7 },
				{ 9, 1, 2, 3, 4, 5, 6, 7, 8 } };
		System.out.println(checkSudoku(sudoku));
	}

}
