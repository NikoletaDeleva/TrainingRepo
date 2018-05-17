package lesson7;

import java.util.Scanner;

public class task9 {
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
		
		int sum = 0;
		int maxSum=0;
		
		
		for (byte row = 0; row < matrix.length-3; row++) {
			for (byte col = 0; col < matrix[row].length-3; col++) {
				for(byte indexRow = row; indexRow< row+2; indexRow++) {
					for(byte indexCol = col; indexCol<col+2; indexCol++) {
						sum += matrix[indexRow][indexCol];
					}
					if(sum>maxSum) {
						maxSum = sum;
					} 
				}
			}
		}System.out.println("Maksimalnata suma e " + maxSum );
		
		System.out.println();
		
	}
}
