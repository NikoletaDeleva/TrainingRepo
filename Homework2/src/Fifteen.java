import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi chislo.");
		int number = input.nextInt();
		int sum = 0;
		int current = 1;
		
		if(number == 0) {
			System.out.println(1);
			return;
		}else {
			if(number > 0) {
				do {
					sum += current;
					current++;
				}while(current <= number);
			
			}else {
				current = number;
				do {
					sum += current;
					current++;
				}while(current <= 1);
			}
			
		}
		if(number > 0) {
			System.out.println(sum);			
		}else {
			System.out.println(sum);
		}

	}

}
