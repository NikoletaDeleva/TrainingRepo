package lesson7;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte m = input.nextByte();
		byte n = input.nextByte();

		int[][] matrix = new int[m][n];

		for (byte row = 0; row < matrix.length; row++) {
			for (byte col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextInt();
			}
		}
		int maxSum = 0;
		int sum=0;
		byte maxRow = 0;
		
		for (byte row = 0; row < matrix.length; row++) {
			for (byte col = 0; col < matrix[row].length; col++) {
				sum += matrix[row][col];
			}
			if(sum>maxSum) {
				maxSum = sum;
				maxRow = row;
			} sum = 0;
		}
		System.out.println("Maksimalnata suma e " + maxSum + " i e na " + (byte)(maxRow+1) + " red.");
	}
}
