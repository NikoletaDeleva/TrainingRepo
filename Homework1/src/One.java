import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		System.out.println("Insert A:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		System.out.println("Insert B:");
		double b = input.nextDouble();
		System.out.println("Insert C:");
		double c = input.nextDouble();
		if (a >= c && b <= c) {
			System.out.println("Yes, it is between");
		} else {
			if (b >= c && a <= c) {
				System.out.println("Yes, it is between");
			} else {
				System.out.println("No, it isn't");
			}
		}
	}
}
