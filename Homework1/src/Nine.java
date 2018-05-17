import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first = 0;
		int second = 0;

		while (first < 10 || first > 99 || second < 10 || second > 99) {
			System.out.println("Vuvedi dve chisla mejdu 10 i 99: ");
			first = input.nextInt();
			second = input.nextInt();
		}
		int proizvedenie = first * second;
		System.out.println(proizvedenie);
		int posledna = proizvedenie % 10;
		if (posledna % 2 == 0) {
			System.out.println(posledna + " chetna");
		} else {
			System.out.println(posledna + " nechetna");
		}

	}
}
