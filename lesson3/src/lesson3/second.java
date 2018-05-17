package lesson3;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int beer = input.nextInt();
		int rakia = input.nextInt();
		if(beer<0) {
			System.out.println("probvai pak, piqn si!");
		}else {
			if(rakia>0) {
				int smetka = beer*2+rakia*4;
				System.out.println("smetkata ti e: "+smetka+" lv");
			}else {
				System.out.println("probvai pak, piqn si!");
			}
			System.out.println("probvai pak, piqn si!");
		}
	
	}
}