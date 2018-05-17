import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] masiv = new int[7];
		int[] masivDve = new int[(masiv.length)*2];
		System.out.println("vuvedi masiv ot 7 chisla:");
		for (int index = 0; index < masiv.length; index++) {
			masiv[index] = input.nextInt();
		}

		for (int index = 0; index < masiv.length; index++) {
			masivDve[index] = masiv[index];
		}
		int br = 0;
		for(int index = masiv.length-1; index>=0; index--) {
			masivDve[index + ((br*2)+1)] = masiv[index];
			br++;
		}
		for(int index = 0; index < masivDve.length; index++) {
		System.out.print(masivDve[index] + " ");
		}
	}

}
