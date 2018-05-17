import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi duljina na masiva");
		int duljina = input.nextInt();
		
		int[] masiv = new int[duljina];
		int[] novMasiv = new int[duljina];

		System.out.println("Vuvedi purviq masiv: ");
		for (int index = 0; index < duljina; index++) {
			masiv[index] = input.nextInt();
		}
		System.out.println("Vtoriq masiv e: ");
		for (int index = 0; index < duljina; index++) {
			if (index == 0) {
				novMasiv[index] = masiv[index + 1];
				continue;
			}
			if (index == duljina - 1) {
				novMasiv[index] = masiv[index - 1];
				continue;
			}
			novMasiv[index] = masiv[index - 1] + masiv[index + 1];
		}
		System.out.println(Arrays.toString(novMasiv));
	}
}
