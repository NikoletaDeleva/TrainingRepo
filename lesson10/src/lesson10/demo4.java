package lesson10;

public class demo4 {
	public static void main(String[] args) {

		String list1 = "Pesho,Gosho,Misho,Kiro,Tosho";
		String list2 = "Pesho,Gosho";

		String[] masiv = list1.split(",");
		String[] temp;

		for (int index = 0; index < masiv.length; index++) {
			if(!(list2.contains(masiv[index]))) {
				System.out.print(masiv[index] + " ");
			}
		}
	}
}