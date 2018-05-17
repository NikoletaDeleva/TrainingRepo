import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int chislo=0;
		
		while (chislo <= 0) {
			System.out.println("vuvedi edno chislo: ");
			chislo = input.nextInt();
		}
		boolean isPrime = true;

		for (int count = 2; count < chislo; count++) {
			if (chislo % count == 0) {
				isPrime = false;
				System.out.println();
			}
		}
		if (isPrime == true) {
			System.out.println("Prosto e");
		} else {
			System.out.println("Ne e prosto!!!");
		}
	}
}
