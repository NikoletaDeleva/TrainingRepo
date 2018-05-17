package lesson5;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("vuvedi chislo:");
		int chislo = input.nextInt();
		System.out.println("cisloto v dvuicen vid e:");

		while (chislo > 0) {
			if ((chislo & 1) == 1) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			chislo >>= 1;
		}
	}
}
