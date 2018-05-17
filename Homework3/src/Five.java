import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		
		int[] masiv = new int[10];
		
		for (int index = 0; index < masiv.length; index++) {
			masiv[index] = index*3;
		}
		for (int index = 0; index < masiv.length; index++) {
			System.out.print(masiv[index]+ " ");
		}
	}
}
