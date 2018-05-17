import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("vuvedi duljina na purviq masiv: ");
		int duljinaPurvi = input.nextInt();
		System.out.println("vuvedi duljina na vtoriq masiv: ");
		int duljinaVtori = input.nextInt();

		if (duljinaPurvi != duljinaVtori) {
			System.out.println("Razlichni sa");
			return;
		}

		int[] masivEdno = new int[duljinaPurvi];
		int[] masivDve = new int[duljinaVtori];
		System.out.println("Vuvedi purviq masiv:");
		for (int index = 0; index < duljinaPurvi; index++) {
			masivEdno[index] = input.nextInt();
		}
		System.out.println("Vuvedi vtoriq masiv:");
		for (int index = 0; index < duljinaVtori; index++) {
			masivDve[index] = input.nextInt();
		}
		for (int index = 0; index < duljinaPurvi; index++) {
			if (masivEdno[index] != masivDve[index]) {
				System.out.println("Razlichni sa");
				return;
			}
		}
		System.out.println("Ednakvi sa");

	}
}
