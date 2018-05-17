import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] splitText = text.split(" ");
		
		for(int index = 0; index < splitText.length; index++) {
			splitText[index] = splitText[index].substring(0, 1).toUpperCase() + 
							   splitText[index].substring(1, splitText[index].length()).toLowerCase();  
			System.out.print(splitText[index] + " ");
		}
		
	}

}

