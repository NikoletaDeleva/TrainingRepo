import java.util.Scanner;

public class Seven {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vuvedi n:");
		int n = input.nextInt();
		
		for(int count=3; count<=n; count++) {
			if(count%3==0) {
				System.out.print(count+",");
			}
		}
		input.close();
	}
}
