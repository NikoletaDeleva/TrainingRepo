package lesson10;

public class demo {
	public static void main(String[] args) {
		String text = "Zdravei, az sum Nikoleta!";
		int brA = 0;
		int brB = 0;
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) == 'a' || text.charAt(index) == 'A') {
				brA++;
			}
			if (text.charAt(index) == 'b' || text.charAt(index) == 'B') {
				brA++;
			}
		}
		System.out.println("Ima tolkos A-ta: " + brA);
		System.out.println("Ima tolkos B-ta: " + brB);
	}
}
