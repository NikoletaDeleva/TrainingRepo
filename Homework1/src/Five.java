import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi purvoto chislo:");
		int first = input.nextInt();
		System.out.println("Vuvedi vtoroto chislo:");
		int second = input.nextInt();
		System.out.println("Vuvedi tretoto chislo:");
		int third = input.nextInt();

		if (first > second) {

			first ^= second;
			second ^= first;
			first ^= second;

		}

		if (third >= second) {

			System.out.println("Tova sa chislata v nizhodqsht red: ");
			System.out.println(third + " " + second + " " + first);

		} else {
			if (third < first) {

				third ^= first;
				first ^= third;
				third ^= first;

				third ^= second;
				second ^= third;
				third ^= second;

				System.out.println("Tova sa chislata v nizhodqsht red: ");
				System.out.println(third + " " + second + " " + first);

			} else {
				if (third > first && third <= second) {
					third ^= second;
					second ^= third;
					third ^= second;

					System.out.println("Tova sa chislata v nizhodqsht red: ");
					System.out.println(third + " " + second + " " + first);

				}
			}
		}
	}
}
