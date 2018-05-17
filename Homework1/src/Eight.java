import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Vuvedi chislo mejdu 1000 i 9999:");
		int x = input.nextInt();

		if (x < 1000 || x > 9999) {
			System.out.println("Vuvede nevalidna stoinost!");
		} else {
			int FirstLast;
			int Middle;

			FirstLast = x % 10 + ((x - x % 1000) / 100);
			System.out.println(FirstLast);

			Middle = (x % 1000) / 10;
			System.out.println(Middle);

			if (FirstLast < Middle) {
				System.out.println("po-malko(" + FirstLast + "<" + Middle + ")");
			} else {
				if (FirstLast == Middle) {
					System.out.println("ravno(" + FirstLast + "=" + Middle + ")");
				} else {
					System.out.println("po-golqmo(" + FirstLast + ">" + Middle + ")");
				}
			}
		}
	}
}
