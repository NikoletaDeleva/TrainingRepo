import java.util.Scanner;

public class Thirteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Vuvedi polojitelno chislo");
		int number = input.nextInt();
		if (number == 0) {
			System.out.println("[" + 0 + "]");
			return;
		}
		if (number < 0) {
			System.out.println("Vuvede otricatelno...");
			number = -number;
		}

		int temp = number;
		int counter = 0;

		while (temp > 0) {
			temp /= 2;
			counter++;
		}
		int[] arrayOfBits = new int[counter];
		int index = counter - 1;
		while (number > 0) {
			arrayOfBits[index] = number % 2;
			number /= 2;
			index--;
		}
		for(index = 0; index < counter; index++) {
			System.out.print(arrayOfBits[index]);
		}
	}
}
