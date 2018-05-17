import java.util.Scanner;

public class Thirteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		byte chislo = 0;
		
		while(chislo<3 || chislo>27) {
			System.out.println("vuvedi chilso mejdu 3 i 27:");
			chislo = input.nextByte();
		}
		
		for(int count=100; count<=999; count++) {
			byte first, second, third;
			first= (byte) (count/100);
			second= (byte) ((count%100)/10);
			third= (byte) (count%10);
			if(first + second + third == chislo) {
				System.out.println(count);
			}
		}
	}
}
