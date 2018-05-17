import java.util.Scanner;

public class Sixteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		short number = 0;
		
		while(number<100 || number>999) {
			System.out.println("vuvedi tricifreno chislo:");
			number = input.nextShort();
		}
		
		short a, b, c;
		a = (short) (number / 100);
		b = (short) ((number / 10) % 10);
		c = (short) (number % 10);
		if (a == b && b == c) {
			System.out.println("Trite cifri sa ednakvi: a = b = c");
		} else {
			if (a > b && b > c) {
				System.out.println("Cifrite sa v nizhodqsht red: a > b > c");
			} else {
				if (a < b && b < c) {
					System.out.println("Cifrite sa v vuzhodqsht red: a < b < c");
				} else {
					System.out.println("Cifrite ne sa podredeni");
				}
			}
		}
	}
}
