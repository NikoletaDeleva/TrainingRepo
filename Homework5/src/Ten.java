import java.util.Scanner;

public class Ten {
	public static String cryptText(String text, int shiftLetter) {
		char temp;
		text = text.toLowerCase();
		String criptedText = "";
		for (int index = 0; index < text.length(); index++) {
			if(text.charAt(index) == ' ' || (text.charAt(index) < 'A' || text.charAt(index) > 'z')) {
				criptedText += "" + text.charAt(index);
				continue;
			}
			if (text.charAt(index) + shiftLetter >= 'z') {
				temp = (char) ('a' + shiftLetter - ('z' - text.charAt(index) + 1)); 
			} else {
				temp = (char) (text.charAt(index) + shiftLetter);
			}
			criptedText += temp;
		}
		return criptedText;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		
		int shiftLetter = input.nextInt();
		
		System.out.println(cryptText(text, shiftLetter));
	}

}

