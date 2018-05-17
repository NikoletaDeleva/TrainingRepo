import java.util.Scanner;

//Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
//3 литра и ги ползвате едновременно.
//Да се състави програма, която по даден обем извежда как ще прелеете
//течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
//кофите. Кофите не могат да се ползват с частично количество вода.
//Входни данни: естествено число от интервала [10..9999].
//Пример: 107
//Изход: 21 пъти по 2 литра,
// 21 пъти по 3 литра
// допълнително кофа от 2 литра

public class Ten {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int litri = 0;

		while (litri < 10 || litri > 9999) {
			System.out.println("vuvedi litri mejdu 10 i 9999:");
			litri = input.nextInt();
		}

		int ostatuk = litri % 5;
		int broiKofi2 = 0;
		int broiKofi3 = 0;

		if (ostatuk == 1) {
			ostatuk = ((litri - 2) % 5) + 2;
			if (ostatuk % 2 == 0) {
				broiKofi2 = (litri - ostatuk) / 5 + ostatuk / 2;
				broiKofi3 = (litri - ostatuk) / 5;
				System.out.println(broiKofi2 + " puti po 2 litra.");
				System.out.println(broiKofi3 + " puti po 3 litra.");
			} else {
				broiKofi2 = (litri - ostatuk) / 2;
				broiKofi3 = (litri - ostatuk) / 3 + ostatuk / 3;
				System.out.println(broiKofi2 + " puti po 2 litra.");
				System.out.println(broiKofi3 + " puti po 3 litra.");
			}

		} else {
			if (ostatuk % 2 == 0) {
				broiKofi2 = (litri - ostatuk) / 5 + ostatuk / 2;
				broiKofi3 = (litri - ostatuk) / 5;
				System.out.println(broiKofi2 + " puti po 2 litra.");
				System.out.println(broiKofi3 + " puti po 3 litra.");
			} else {
				broiKofi2 = (litri - ostatuk) / 5;
				broiKofi3 = (litri - ostatuk) / 5 + ostatuk / 3;
				System.out.println(broiKofi2 + " puti po 2 litra.");
				System.out.println(broiKofi3 + " puti po 3 litra.");
			}
		}

	}

}
