package lesson12;

public class task3 {
	static void showMatrix(int[][] matrix, int row, int col) {
		
		if(row >= matrix.length) {
			return;
		}
		if(col>=matrix[row].length) {
			System.out.println();
			showMatrix(matrix, row+1,0);
			return;
		}
		System.out.print(matrix[row][col] + " ");
		showMatrix(matrix, row, col+1);
		
	}	public static void main(String[] args) {
		int[][] matrix = {  {1,2,3},
							{4,5,6},
							{7,8,9}
						};
		for(int row = 0; row<matrix.length; row++) {
			for(int col = 0; col<matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
		showMatrix(matrix,0,0);
	}

}
