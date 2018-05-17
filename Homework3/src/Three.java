import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vuvedi chislo: ");
		int number = input.nextInt();
		
		int[] masiv = new int[10];
		
		for(byte index = 0; index < masiv.length; index++) {
			if(index==0 || index == 1) {
				masiv[index]=number;
			}else {
				masiv[index]= masiv[index-1]+masiv[index-2];
			}
			System.out.print(masiv[index] + " ");
		}
		
	}
}
