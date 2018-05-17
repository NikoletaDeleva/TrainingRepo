package lesson6;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int spaces = h - 1;
		int stars = 1;
		for (int row = 1; row <= h; row++) {
			for (int space = 1; space <= spaces; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= stars; star++) {
				System.out.print("*");
			}
			System.out.println();
			spaces--;
			stars += 2;
		}
	}
}
