import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] masiv = new int[7];
		System.out.println("vuvedi masiv ot 7 chisla:");
		for(int index=0; index<masiv.length; index++) {
			masiv[index] = input.nextInt();
		}
		
		int minKratnoTri =3;
		for(int index = 0; index<masiv.length; index++) {
			if(masiv[index]%3==0 && masiv[index]<minKratnoTri) {
				minKratnoTri = masiv[index];
			}
		}System.out.println("Най-малкото число кратно на 3 е " + minKratnoTri);
		
	}
}
