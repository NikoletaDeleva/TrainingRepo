import java.util.Scanner;

public class Sixteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi dve chisla mejdu 10 i 5555");

		short firstNumber = input.nextShort();
		while (firstNumber < 10 || firstNumber > 5555) {
			System.out.println("Probvai pak");
			firstNumber = input.nextShort();
		}
		short secondNumber = input.nextShort();
		while (secondNumber < 10 || secondNumber > 5555) {
			System.out.println("Probvai pak");
			secondNumber = input.nextShort();
		}
		
		if(firstNumber > secondNumber) {
			firstNumber ^= secondNumber;
			secondNumber ^= firstNumber;
			firstNumber ^= secondNumber;
		}
		
		for (int i = secondNumber; i >= firstNumber; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}
	}
}
