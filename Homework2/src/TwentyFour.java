import java.util.Scanner;

public class TwentyFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int chislo = 0;
		
		while(chislo<10 || chislo>30000) {
			System.out.println("Vuvedi chislo mejdu 10 i 30000");
			chislo = input.nextInt();
		}
		
		
	}
}
