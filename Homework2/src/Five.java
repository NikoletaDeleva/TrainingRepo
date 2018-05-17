import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vuvedi edno chislo:");
		int first = input.nextInt();
		System.out.println("vuvedi vtorochislo:");
		int second = input.nextInt();
		
		if(first>second) {
			int temp = first;
			first = second;
			second= temp;
		}
		
		for(int chislo=first; chislo<=second; chislo++) {
			System.out.print(chislo + " ");
		}
		input.close();
	}
}
