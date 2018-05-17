import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int matrixLenght = 0;
		while (matrixLenght <= 1) {
			System.out.println("Vuvedi golemina na  gvadratnata matricata: ");
			matrixLenght = input.nextInt();
		}

		int[][] matrix = new int[matrixLenght][matrixLenght];

		System.out.println("Vuvedi matricata: ");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextInt();
			}
		}
		
		System.out.print("Glavniqt diagonal e : ");
		
		for (int row = 0, col = 0; col < matrix.length; row++, col++) {
			System.out.print(matrix[row][col] + " ");
		}
		System.out.println();
		System.out.print("Drugiqt diagonal e : ");
		for (int row = 0, col = matrix.length - 1; col>=0; row++, col--) {
			System.out.print(matrix[row][col] + " ");
		}

	}
}
