import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi duljina na masiva: ");
		int duljina = input.nextInt();
		int[] masiv = new int[duljina];
		int nastoqshtoChislo;
		int br = 1;
		int razmer = 0;
		int max = 0;

		System.out.println("Vuvedi masiva: ");
		for (int index = 0; index < duljina; index++) {
			masiv[index] = input.nextInt();
		}

		nastoqshtoChislo = masiv[0];
		for (int index = 1; index < duljina; index++) {
			if (nastoqshtoChislo == masiv[index]) {
				br++;
			} else {
				if (razmer < br) {
					razmer = br;
					max = nastoqshtoChislo;
				}
				br = 1;
				nastoqshtoChislo = masiv[index];
			}
			if (index == duljina - 1) {
				if (razmer < br) {
					razmer = br;
					max = nastoqshtoChislo;
				}
			}
		}

		for (int index = 0; index < razmer; index++) {
			System.out.print(max);
		}
	}
}