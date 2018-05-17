import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String first = input.next();
		String second = input.next();
		String newFirst;
		String newSecond;
		
		System.out.println((first.length() > second.length()) ? (first.length()) : (second.length()));
		if (second.length() > 5) {
			newFirst = first.substring(0, 5) + second.substring(5, second.length());
		} else {
			newFirst = first.substring(0, 5);
		}
		System.out.println(newFirst);
		
		if (first.length() > 5) {
			newSecond = second.substring(0, 5) + first.substring(5, first.length());
		} else {
			newSecond = second.substring(0, 5);
		}
		
		System.out.println(newSecond);
	}
}
