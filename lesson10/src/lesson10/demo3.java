package lesson10;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class demo3 {
	public static void main(String[] args) {
		String text = "abc";
		// int count = 0;
		// for( int index = 0; index < text.length(); index++) {
		// if(text.charAt(index)>='a' && text.charAt(index)<='z') {
		// count++;
		// }
		// } System.out.println(count);
		int chislo = 26; 
		char temp;
		String newText="";
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index)+chislo >= 'z') {
				temp = (char)('a'+ chislo - 1 - ('z'- text.charAt(index)));
			}else {
				temp = (char)(text.charAt(index) + chislo);
			}
			newText += temp;
		}
		System.out.println(newText);

	}
}
