package lesson5;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if(a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		for (int chislo = a; chislo<=b; chislo++) {
			if(chislo%3==0) {
				System.out.println(chislo);
			}
		}
		
	}
}
