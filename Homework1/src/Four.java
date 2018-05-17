import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi purvoto chislo:");
		int first = input.nextInt();
		System.out.println("Vuvedi vtoroto chislo:");
		int second = input. nextInt();
		if(first>=second) {
			System.out.println(second+" "+ first);
		}else {
			System.out.println(first+" "+ second);
		}
	}
}
