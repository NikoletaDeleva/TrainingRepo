import java.util.Scanner;

public class Ninetenn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi chislo mejdu 10 i 99");
		byte number = input.nextByte();
		
		while(number < 10 || number > 99) {
			System.out.println("Probvai pak");
			number = input.nextByte();
		}
		while(number > 1) {
			if((number-1) % 2== 0) {
				number = (byte) (number*3 + 1);
				System.out.print(number + " ");
			}else {
				number = (byte) (number/2);
				System.out.print(number + " ");
			}
			if(number == 0)
				break;
		}
	}
}
