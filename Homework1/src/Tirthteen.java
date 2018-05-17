import java.util.Scanner;

public class Tirthteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Vuvedi temperatura ");
		short temperature = input.nextShort();

		if (temperature <= 0) {
			if (temperature < -20) {
				System.out.println("Ledeno studeno e");
			} else {
				System.out.println("Studeno");
			}
		} else {
			if (temperature <= 15) {
				System.out.println("Hladno e");
			} else {
				if (temperature <= 25) {
					System.out.println("Toplo e");
				} else {
					System.out.println("Goreshto e");
				}
			}
		}
	}
}