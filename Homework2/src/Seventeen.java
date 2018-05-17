import java.util.Scanner;

public class Seventeen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi golemina na stranata.");
		byte squareSide = input.nextByte();

		for (int i = 0; i < squareSide; i++) {
			if (i == 0 || i == squareSide - 1) {
				if (i == 0) {
					for (int j = 0; j < squareSide; j++) {
						if(j == squareSide-1) {
							System.out.print("*");
						}else {
							System.out.print("* ");
						}
					}
					System.out.println();
				} else {
					for (int j = 0; j < squareSide; j++) {
						if(j == squareSide-1) {
							System.out.print("*");
						}else {
							System.out.print("* ");
						}
					}
				}
			}else {
				System.out.print("* ");
				for(int l = 0; l < squareSide-2; l++) {
					System.out.print("+ ");
				}
				System.out.println("*");
			}
		}
	}
}
