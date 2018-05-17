import java.util.Scanner;

public class Eight {
	public static boolean isPalindrome(String word) {
		int backIndex = word.length() - 1;
		for (int index = 0; index < word.length() / 2; index++, backIndex--) {
			if (word.charAt(index) != word.charAt(backIndex)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		System.out.println(isPalindrome(word) ? "Palindrom" : "ne e palindrom");
	}

}
