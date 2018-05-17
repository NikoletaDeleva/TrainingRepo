package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Boi {
	public static void main(String[] args) {
		int peshoHealth = 100;
		int goshoHealth = 100;
		boolean isPeshoIll = false;
		boolean isGoshoIll = false;
		boolean bizonaLiGiUbi = false;

		float amfetaminCoeffPesho = 1f;
		float amfetaminCoeffGosho = 1f;

		int peshoMinHealth = 0;
		int goshoMinHealth = 0;
		
//		boolean mdmaPesho = false;
//		boolean mdmaGosho = false; 

		while ((peshoHealth > peshoMinHealth) && (goshoHealth > 0)) {
			

			// amfetamini - Pesho
			if (Math.random() < 0.2) {
				System.out.println("Pesho nameri sintetikata!");
				peshoHealth += 30;
				amfetaminCoeffPesho *= 1.5;
				peshoMinHealth += 20;

				if (peshoHealth < peshoMinHealth) {
					System.out.println("Pesho predrusa, krai");
					break;
				}
			}

			// amfeti - Gosho
			if (Math.random() < 0.2) {
				System.out.println("Gosho nameri sintetikata!");
				goshoHealth += 30;
				amfetaminCoeffGosho *= 1.5;
				goshoMinHealth += 20;

				if (goshoHealth < goshoMinHealth) {
					System.out.println("Gosho predrusa, krai");
					break;
				}
			}
			// bizon
			if (Math.random() < 0.07) {
				System.out.println("Diviq bizon pristigna!");
				if ((Math.random() < 0.5) && (amfetaminCoeffPesho < 1.5)) {
					System.out.println("Pesho umrq ot bizon, Gosho specheli slujebno!");
					bizonaLiGiUbi = true;
					break;
				} else {
					if ((amfetaminCoeffGosho < 1.5) && (amfetaminCoeffPesho >= 1.5)) {
						System.out.println("Gosho umrq ot bizon, Pesho specheli slujebno!");
						bizonaLiGiUbi = true;
						break;
					}
				}
			}

			// rakiq
			int peshoPower = (int) (Math.random() * 16) + 5;
			if (Math.random() < 0.1) {
				// 10% chance
				System.out.println("Pesho nameri rakiqta, pobeda!");
				peshoPower <<= 1;
			}

			// sharka
			if (!isPeshoIll && (Math.random() < 0.5)) {
				System.out.println("Pesho se razbolq ot edra sharka!");
				peshoHealth -= 15;
				isPeshoIll = true;
			}

			if (!isGoshoIll && (Math.random() < 0.05)) {
				System.out.println("Gosho se razbolq ot edra sharka!");
				goshoHealth -= 15;
				isGoshoIll = true;
			}

			System.out.println("Pesho prasna Gosho sys sila " + peshoPower);

			if (isPeshoIll) {
				peshoPower /= 2;
			}

			peshoPower *= amfetaminCoeffPesho;
			int kolkoPyti = 1;
			
			if(Math.random()<0.3) {
				System.out.println("Ehaaa, Pesho nameri MDMA");
				kolkoPyti = 5;
			}
			
			for(int count=1;count<5; count++) {
				
				if (goshoHealth==0) break;
				
				goshoHealth=(peshoPower>goshoHealth) ? 0 : goshoHealth - peshoPower;
				System.out.println("Na Gosho mu osnta " + goshoHealth + " zdrave.");
			}
			goshoHealth = (peshoPower > goshoHealth) ? 0 : goshoHealth - peshoPower;
			System.out.println("Na Gosho mu osnta " + goshoHealth + " zdrave.");

			if (goshoHealth > 0) {
				int goshoPower = (int) (Math.random() * 16) + 5;
				if (Math.random() < 0.1) {
					// 10% chance
					System.out.println("Gosho nameri rakiqta, pobeda!");
					goshoPower *= 2;
				}
				System.out.println("Gosho prasna Pesho sys sila " + goshoPower);

				if (isGoshoIll) {
					goshoPower /= 2;
				}

				goshoPower *= amfetaminCoeffGosho;
				peshoHealth = (peshoHealth > goshoPower) ? peshoHealth - goshoPower : 0;
				System.out.println("Na Pesho mu ostana " + peshoHealth + " zdrave.");
				System.out.println();
			}
		}

		if (bizonaLiGiUbi == false) {
			if (peshoHealth == 0) {
				System.out.println("Pesho gushna buketa, Gosho specheli!");
			} else {
				System.out.println("Gosho gushna buketa, Pesho specheli!");
			}
		}
	}
}