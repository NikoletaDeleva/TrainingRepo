import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi purvoto chislo:");
		int first = input.nextInt();
		System.out.println("Vuvedi vtoroto chislo:");
		int second = input.nextInt();
		first ^= second;
		second ^= first;
		first ^= second;
		System.out.println("Novoto purvo e: " + first);
		System.out.println("Novoto vtoro e: " + second);

	}
}
