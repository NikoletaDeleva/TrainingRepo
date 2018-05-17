package lesson7;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] names = new String[5];
		int[] zaplati = new int[names.length];

		for (int index = 0; index < names.length; index++) {
			System.out.println("Vuvedi ime:");
			names[index]= input.next();
			System.out.println("vuvedi zaplata:");
			zaplati[index]=input.nextInt();
		}
		for(int index=0; index< names.length;index++) {
		System.out.println(names[index] + " " + zaplati[index]);
		}
		
		System.out.println();
		
		int maxZaplata = zaplati[0];
		byte maxZaplataIndex = 0;
		
		for(byte index=0; index< names.length;index++) {
			if(zaplati[index]>maxZaplata) {
				maxZaplata=zaplati[index];
				maxZaplataIndex = index;
			}
		}System.out.println("Nai visokata zaplata e na: " +  names[maxZaplataIndex] + " i e  " +maxZaplata);
	}
}
