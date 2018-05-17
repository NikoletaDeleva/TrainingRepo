import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Kolko e chasa:");
		int chas = input.nextInt();

		if (chas < 0 || chas > 24) {
			System.out.println("Vuvede nevaliden chas!");
		} else {

			System.out.println("Zdrav li si (true or false):");
			boolean zdrave = input.nextBoolean();
			System.out.println("Kolko pari imash:");
			double pari = input.nextDouble();

			if (pari < 0) {
				System.out.println("Vuvede nevalidna suma!");
			} else {

				if (zdrave == false) {
					System.out.println("Dnes nqma da izlizash.");
					if (pari > 0) {
						System.out.println("Kupi si lekarstva.");
					} else {
						System.out.println("Pii topul chai vkushti.");
					}
				} else {
					if (pari > 10) {
						System.out.println("Mojesh da otidesh na kino s priqteli.");
					} else {
						System.out.println("Mojesh da piesh kafe s priqteli.");
					}
				}
			}
		}
	}
}