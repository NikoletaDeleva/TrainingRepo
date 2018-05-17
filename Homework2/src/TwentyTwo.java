import java.util.Scanner;

public class TwentyTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte numberAmount = 10;
		short number = 0;
		while (number < 1 && number > 999) {
			System.out.println("Vuvedi chislo mejdu 1 i 99");
			number = input.nextShort();
		}
		int counter = 1;
		int current = number+1;
		while (counter <= numberAmount) {
			if(current % 2 == 0 || current % 3 == 0 || current % 5 == 0) {
				System.out.print(counter + ":" + current + "  " );
				current++;
			}else {
				current++;
				continue;
			}
			counter++;
		}
	}
}
