import java.util.Arrays;
import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vuvedi duljina na masiva: ");
		int duljina = input.nextInt();
		int[] masiv = new int[duljina];
		
		System.out.println("Vuvedi masiva: ");
		for (int index = 0; index < duljina; index++) {
			masiv[index] = input.nextInt();
		}
		System.out.println(Arrays.toString(masiv));
															 
		int count = duljina-1;
		
		System.out.println("Noviqt masiv e: ");
		for(int index = 0; index < duljina/2; index++, count--) {
			masiv[index] ^= masiv[count];
			masiv[count] ^= masiv[index];
			masiv[index] ^= masiv[count];
		}
		System.out.println(Arrays.toString(masiv));
	}
}
