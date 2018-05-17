import java.util.Scanner;

public class Eleven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte duljina = 7;
		int[] masiv = new int[duljina];
		byte count = 0;
		System.out.println("Vuvedi masiva: ");
		for (byte index = 0; index < duljina; index++) {
			masiv[index] = input.nextInt();
		}
		for (byte index = 0; index < duljina; index++) {
			if (masiv[index] % 5 == 0 && masiv[index] > 5) {
				System.out.print(masiv[index] + " ");
				count++;
			}
		}
		System.out.println("--> " + count + " numbers");
	}
}
