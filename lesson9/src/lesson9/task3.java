package lesson9;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[] array = new char[5];
		boolean flag = false;
		
		System.out.println("vuvedi masiv ot simvoli: ");
		
		for (byte index = 0; index < array.length; index++) {
			array[index] = input.next().charAt(0);
		}
		
		System.out.println("Vuvedi turseniq simvol: ");
		char simvol = input.next().charAt(0);
		byte index = 0;
		
		for (; index < array.length; index++) {
			if (array[index] == simvol) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? ("Ima go na " + ((byte)(index+1)) +" poziciq") : "Nqma go");
		
	}
}
