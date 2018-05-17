import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi chislo:");
		int chislo = input.nextInt();
		int sum = 0;
		
		for(int count = 1; count<=chislo; count++) {
			sum +=count;
		}System.out.println("Sumata na vsichki chisla do " + chislo +" e ravna na " + sum);
		input.close();
	}
}
