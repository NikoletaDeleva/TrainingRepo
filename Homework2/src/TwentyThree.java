
public class TwentyThree {
	public static void main(String[] args) {
		int start = 1;
		while(start <= 9) {
			for(int j = start; j < 10; j++) {
				System.out.print(start + " * " + j + "   ");
			}
			System.out.println();
			start++;
		}
	}
}
