import java.util.Arrays;
import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int duljina = 7;
		int[] masiv = new int[duljina];
		int sum = 0;
		double sredna;
		double minRazlika;
		double tempRazlika;
		int naiBlizkoChislo = 0;
		
		System.out.println("Vuvedi masiva: ");
		for (int index = 0; index < duljina; index++) {
			masiv[index] = input.nextInt();
		}
		System.out.println(Arrays.toString(masiv));
		
		for (int index = 0; index < duljina; index++) {
			sum += masiv[index];
		}
		sredna = sum/duljina;
		System.out.println("Sredna stoinost " + sredna);
		
		minRazlika = (masiv[0] > sredna) ? (masiv[0] - sredna) : (sredna - masiv[0]);
		
		for(int index = 1; index < duljina; index++) {
			tempRazlika = (masiv[index] > sredna) ? (masiv[index] - sredna) : (sredna - masiv[index]);
			if(tempRazlika < minRazlika) {
				minRazlika = tempRazlika;
				naiBlizkoChislo = index;
			}
		}
		System.out.println(masiv[naiBlizkoChislo]);
	}
}
