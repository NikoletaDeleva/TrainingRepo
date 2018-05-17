import java.util.Scanner;

public class Eighteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi dve polojitelni chisla mejdu 1,9...");
		byte first = input.nextByte();
		while(first < 0 || first > 9) {
			System.out.println("Porbvai pak!");
			first = input.nextByte();
		}
		
		byte second = input.nextByte();
		while(second < 0 || second > 9) {
			System.out.println("Porbvai pak!");
			second = input.nextByte();
		}
		if(first > second) {
			first ^= second;
			second ^= first;
			first ^= second;
		}
		byte product;
		for(int i = 1; i <= second; i++) {
			for(int j = 1; j <= second; j++) {
				product = (byte) (i*j);
				System.out.println(i + " * " + j + " = " + product + ";");
				if(j == second) {
					product = (byte) (i*10);
					System.out.println(i + " * " + 10 + " = " + product + ";");
				}
			}
		}

	}

}
