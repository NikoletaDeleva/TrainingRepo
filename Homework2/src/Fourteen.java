import java.util.Scanner;

public class Fourteen {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi chislo mejdu 10 i 200");
		short number = input.nextShort();
		while (number < 10 || number > 200) {
			System.out.println("opitai otnovo");
			number = input.nextShort();
		}
		for (int i = number; i > 0; i--) {
			if (i % 7 == 0) {
				if (i < number) {
					System.out.println(i);
				}
			}
		}
	}
}