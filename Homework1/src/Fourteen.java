import java.util.Scanner;

public class Fourteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Vuvedi red i kolona");
		byte firstRow = input.nextByte();
		byte firstColumn = input.nextByte();

		System.out.println("Vuvedi vtori red i kolona");
		byte secondRow = input.nextByte();
		byte secondColumn = input.nextByte();

		if (firstRow % 2 == 0) {
			if (secondRow % 2 == 0) {
				if (firstColumn % 2 == 0 && secondColumn % 2 == 0) {
					System.out.println("Poziciite sa s edin i sushti cvqt");
				} else {
					System.out.println("Poziciite ne sa s edin i sushti cvqt");
				}
			} else {
				if ((firstColumn % 2 == 0 && secondColumn % 2 == 1)
						|| (secondColumn % 2 == 0 && firstColumn % 2 == 1)) {
					System.out.println("Poziciite sa s edin i sushti cvqt");
				} else {
					System.out.println("Poziciite ne sa s edin i sushti cvqt");
				}
			}
		} else {
			if (secondRow % 2 == 0) {
				if ((firstColumn % 2 == 0 && secondColumn % 2 == 1)
						|| (secondColumn % 2 == 0 && firstColumn % 2 == 1)) {
					System.out.println("Poziciite sa s edin i sushti cvqt");
				} else {
					System.out.println("Poziciite ne sa s edin i sushti cvqt");
				}
			} else {
				if (firstColumn % 2 == 1 && secondColumn % 2 == 1) {
					System.out.println("Poziciite sa s edin i sushti cvqt");
				} else {
					if (firstColumn % 2 == 0 && secondColumn % 2 == 0) {
						System.out.println("Poziciite sa s edin i sushti cvqt");
					} else {
						System.out.println("Poziciite ne sa s edin i sushti cvqt");
					}
				}
			}
		}
	}
}
