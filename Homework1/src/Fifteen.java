import java.util.Scanner;

public class Fifteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi chas");
		byte hour = input.nextByte();
		
		if (hour < 0 || hour > 24) {
			while (hour < 0 || hour > 24) {
				System.out.println("Probvai pak");
				hour = input.nextByte();
			}
		}else {
			if(hour > 4 && hour <=9) {
				System.out.println("Dobro utro");
			}else {
				if(hour > 9 && hour <= 18) {
					System.out.println("Dobur den");
				}else {
					System.out.println("Dobur vecher");
				}
			}
		}
	}
}