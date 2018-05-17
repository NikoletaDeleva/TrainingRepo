package lesson9;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] masiv = new int[10];
		boolean flag = true;

		for (int index = 0; index < masiv.length; index++) {
			masiv[index] = input.nextInt();
		}
		for (int index = 0; index < masiv.length; index++) {
			if (masiv[index] <= 0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "Nqma otricatelni" : "Ima otricatelni");
	}
}
