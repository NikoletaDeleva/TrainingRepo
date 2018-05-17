import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] args) {
		// 11-j,12-q,13-k,14-Ace 13
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi nomer na kartatat: ");
		int kartaNomer = input.nextInt();
		int previousMaxCardType = kartaNomer;
		while (previousMaxCardType % 4 != 0 && previousMaxCardType > 0) {
			previousMaxCardType--;
		}
		int startingPoint = 0;
		int type = 0;
		if (previousMaxCardType == 0) {
			type = kartaNomer;
			previousMaxCardType = kartaNomer;
			startingPoint = 1;
		} else {
			startingPoint = (previousMaxCardType / 4);
			type = 4;
		}

		while (previousMaxCardType < kartaNomer) {
			++previousMaxCardType;
			++type;
			if (type > 4) {
				startingPoint++;
				type = 1;
			}
		}

		do {
			int realCardType = startingPoint + 1;
			if (realCardType > 10) {
				switch (realCardType) {
				case 11:
					System.out.print("J");
					break;
				case 12:
					System.out.print("Q");
					break;
				case 13:
					System.out.print("K");
					break;
				case 14:
					System.out.print("A");
					break;
				}
			} else {
				System.out.print(startingPoint + 1);
			}

			switch (type) {
			case 1:
				System.out.print(" ♣");
				break;
			case 2:
				System.out.print(" ♦");
				break;
			case 3:
				System.out.print(" ♥");
				break;
			case 4:
				System.out.print(" ♠");
				break;
			}

			System.out.println();

			previousMaxCardType++;
			++type;
			if (type > 4) {
				type = 1;
				startingPoint++;
			}
		} while (previousMaxCardType <= 52);

	}
}