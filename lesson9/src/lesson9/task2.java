package lesson9;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] masiv = new int[7];
		boolean flag = true;

		for (int index = 0; index < masiv.length; index++) {
			masiv[index] = input.nextInt();
		}
		for (int index = 1; index < masiv.length - 1; index += 2) {
			if (!((masiv[index] > masiv[index - 1] && masiv[index] > masiv[index + 1])
					|| (masiv[index] < masiv[index - 1] && masiv[index] < masiv[index + 1]))) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "Masivut e nazuben" : "Masivut ne e nazuben");
	}
}
