package war;

import java.util.Arrays;

public class FillDeck {
	public static void main(String[] args) {
		
		int[] deck = new int[52];
		int count = 0;
		for(int index = 0; index < deck.length; index+=14) {
			int pos = 1;
			for(int index2 = index; index2<index+13; index2++) {
				
				deck[index2] = pos;
				pos++;
				
			}
			count++;
		}
		
		System.out.println(Arrays.toString(deck));
	}
}
