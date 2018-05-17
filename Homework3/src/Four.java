import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		int[] masiv = new int[4];
		int br=0;
		boolean flag = true;
		for (int index = 0; index < masiv.length; index++) {
			masiv[index] = input.nextInt();
		}
		for (byte index = 0; index < masiv.length/2; index++) {
			if (masiv[index] != masiv[masiv.length-1-br]) {
				flag=false;
			}
			br++;
		} 
		if(flag==true) {
			System.out.println("Ogledalen e");
		}else {
			System.out.println("Ne e ogledalen");
		}

	}

}
