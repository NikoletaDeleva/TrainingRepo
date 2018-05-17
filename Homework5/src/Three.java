import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String first = input.next();
		String second = input.next();
		
		
		System.out.println((first.length() == second.length()) ? "Duljinata im e ravna": "Duljinata im ne e ravna");
		
		if(first.length() == second.length()) {
			for(int index = 0; index < first.length(); index++){
				if (first.charAt(index)!=second.charAt(index)) {
					System.out.println(index + " " + first.charAt(index) +  "-" +second.charAt(index) );
				}
			}
		}
	}
}
