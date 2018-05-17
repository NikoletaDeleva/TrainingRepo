import java.util.Scanner;

public class Eight {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numb = input.nextInt();
		int temp = numb-1;
		
		while(!(temp>(3*numb-3))){
			for(int count=1; count<=numb; count++) {
				System.out.print(temp);
			}System.out.println();
			temp+=2;
		}
	}
}
