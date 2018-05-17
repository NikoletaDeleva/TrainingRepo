
public class Twenty {
	public static void main(String[] args) {
		for (int row=1; row<=10; row++) {
			for (int num=row; num <= 9; num++) {
				System.out.print(num + " ");
			}
			
			for (int num=0; num <= row-1; num++) {
				System.out.print(num + " ");
			}
			
			System.out.println();
		}
	}
}
