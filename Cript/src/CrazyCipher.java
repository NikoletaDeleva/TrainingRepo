import java.util.Scanner;

public class CrazyCipher {
	public static final char[][] codeMatrix = { { 'G', 'A', 'S', 'P', 'D' }, { 'O', 'E', 'H', 'B', 'M' },
			{ 'I', 'N', 'C', 'L', 'Q' }, { 'V', 'K', 'T', 'Y', 'W' }, { 'J', 'U', 'F', 'R', 'X' } };

	public static int returnRow(char letter) {
		int currentRow = 0;
		for (int row = 0; row < codeMatrix.length; row++) {
			for (int col = 0; col < codeMatrix[row].length; col++) {
				if (letter == codeMatrix[row][col]) {
					currentRow = row;
					break;
				}
			}
		}
		return currentRow;
	}

	public static int returnCol(char letter) {
		int currentCol = 0;
		for (int row = 0; row < codeMatrix.length; row++) {
			for (int col = 0; col < codeMatrix[row].length; col++) {
				if (letter == codeMatrix[row][col]) {
					currentCol = col;
					break;
				}
			}
		}
		return currentCol;
	}

	public static String encryptMessage(String text) {
		String formatedString = formatString(text);
		String encryptedMessage = "";
		String temp;
		int currentRowFirst;
		int currentRowSecond;
		int currentColFirst;
		int currentColSecond;
		int firstChar = 0;
		int secondChar = 2;

		for (int index = 0; index < formatedString.length(); index ++) {
			while (formatedString.charAt(firstChar) == 'Z') {
				firstChar++;
				secondChar++;
			}
			while (formatedString.charAt(secondChar) == 'Z') {
				secondChar++;
			}
			temp = formatedString.substring(firstChar, secondChar);

			currentRowFirst = returnRow(temp.charAt(firstChar));
			currentColFirst = returnCol(temp.charAt(firstChar));
			currentRowSecond = returnRow(temp.charAt(secondChar));
			currentColSecond = returnCol(temp.charAt(secondChar));

			if (currentRowFirst != currentRowSecond && currentColFirst != currentColSecond) {
				encryptedMessage += codeMatrix[currentRowFirst][currentColSecond]
						+ codeMatrix[currentRowSecond][currentColFirst];
			} else {
				if(currentRowFirst == currentRowSecond && currentColFirst == currentColSecond) {
					if(currentRowFirst == codeMatrix.length-1 && currentColFirst!=codeMatrix.length-1) {
						encryptedMessage += codeMatrix[0][currentColFirst]
								+ codeMatrix[0][currentColSecond];
					}else {
						if(currentColFirst == codeMatrix.length-1 && currentRowFirst!=codeMatrix.length-1) {
							encryptedMessage += codeMatrix[currentRowFirst][0]
									+ codeMatrix[currentRowSecond][0];
						}else {
							encryptedMessage += codeMatrix[0][0]
									+ codeMatrix[0][0];
						}
					}
				}else {
					if(currentRowFirst == currentRowSecond && currentColFirst != currentColSecond) {
						if(currentColFirst == codeMatrix.length-1 || currentColSecond==codeMatrix.length-1) {
							if(currentColFirst == codeMatrix.length-1) {
								encryptedMessage += codeMatrix[currentRowFirst][0]
										+ codeMatrix[currentRowSecond][currentColSecond + 1];
							}else {
								encryptedMessage += codeMatrix[currentRowFirst][currentColFirst+1]
										+ codeMatrix[currentRowSecond][0];
							}
						}else {
							encryptedMessage += codeMatrix[currentRowFirst][currentColFirst+1]
									+ codeMatrix[currentRowSecond][currentColSecond + 1];
						}
					}else {
						if(currentRowFirst != currentRowSecond && currentColFirst == currentColSecond) {
							if(currentRowFirst == codeMatrix.length - 1 || currentRowSecond == codeMatrix.length - 1 ) {
								if(currentRowFirst == codeMatrix.length - 1) {
									encryptedMessage += codeMatrix[0][currentColFirst]
											+ codeMatrix[currentRowSecond+1][currentColSecond];
								}else {
									encryptedMessage += codeMatrix[currentRowFirst+1][currentColFirst]
											+ codeMatrix[0][currentColSecond];
								}
							}else {
								encryptedMessage += codeMatrix[currentRowFirst+1][currentColFirst]
										+ codeMatrix[currentRowSecond+1][currentColSecond];
							}
						}
					}
				}
				
			}	
			firstChar= secondChar+1;
			secondChar = firstChar+2;
		}
		return encryptedMessage;
	}

	public static String formatString(String text) {
		// removes all intervals and formats the string to upper case
		String newString = "";

		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) != ' ') {
				if (text.charAt(index) < 'A' || text.charAt(index) > 'z') {
					continue;
				}
				newString += text.charAt(index);
			}
		}

		newString = newString.toUpperCase();

		return newString;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Write a text...");
		String text = input.nextLine();
		System.out.println(encryptMessage(text));
		input.close();
	}

}
