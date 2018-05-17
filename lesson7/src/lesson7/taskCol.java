package lesson7;

import java.util.Scanner;

public class taskCol {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte m = input.nextByte();
		byte n = input.nextByte();

		int[][] matrix = new int[m][n];
		int numb = 1;
		
		for (byte col = 0; col < m; col++) {
			for (byte row = 0; row < n; row++) {
				matrix[row][col] = numb++;
			}
		}
		for(int mRow = 0; mRow< m; mRow++) {
			for(int mCol = 0; mCol<n; mCol++) {
				System.out.println(matrix[mRow][mCol] + " ");
			}System.out.println();
		}
	}
}