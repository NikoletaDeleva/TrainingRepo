import java.util.Scanner;

public class Six {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Vuvedi purvoto chislo:");
		int a1 = input.nextInt();
		System.out.println("Vuvedi vtoroto chislo:");
		int a2 = input.nextInt();
		System.out.println("Vuvedi tretoto chislo:");
		int a3 = input.nextInt();

		a1 ^= a2;
		a2 ^= a1;
		a1 ^= a2;

		a2 ^= a3;
		a3 ^= a2;
		a2 ^= a3;

		System.out.println("Purvoto chislo e: " + a1);
		System.out.println("Purvoto vtoroto e: " + a2);
		System.out.println("Purvoto tretoto e: " + a3);
	}
}
