import java.util.Scanner;

public class TwentyFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int chislo = input.nextInt();
		int faktoriel=1; 
		int count=1;
		
		do {
			faktoriel*=count;
			count++;
		}while(count<=chislo);
		
		System.out.println(faktoriel);
	}
}
