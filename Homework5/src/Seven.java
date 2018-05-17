import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		String[] words = text.split(" ");
		
		int maxWordLength = words[0].length();
		int wordLength = 0;
		
		for(int index = 0; index < words.length; index++) {
			wordLength = words[index].length();
			if(wordLength > maxWordLength) {
				maxWordLength = wordLength;
			}
		}
		System.out.println(words.length + " dumi, nai-dulgata e sustavena ot " + maxWordLength + " bukvi");
		
	}

}
