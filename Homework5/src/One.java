import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String first = input.nextLine();
		String second = input.nextLine();
		if (first.length() > 40) {
			first = first.substring(0, 40);
		}
		if (second.length() > 40) {
			second = second.substring(0, 40);
		}

		System.out.println(first.toUpperCase());
		System.out.println(first.toLowerCase());
		System.out.println(second.toUpperCase());
		System.out.println(second.toLowerCase());
	}
}
