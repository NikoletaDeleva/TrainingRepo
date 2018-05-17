package lesson7;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class таск3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Vuvedi broi dni v meseca: ");
		byte broiDni = input.nextByte();

		float[] gradusi = new float[broiDni];

		float sum = 0.0f;
		System.out.println("Vuvedi gradusi: ");
		for (byte index = 0; index < broiDni; index++) {
			gradusi[index] = input.nextFloat();
			sum += gradusi[index];
		}
		float srednaTemp = sum / broiDni;
		System.out.println("Sredna temeperatura: " + srednaTemp);

		byte count = 0;
		byte maxDays = 0;
		byte endOfMax = 0;
		for (byte index = 0; index < broiDni; index++) {
			if (gradusi[index] < srednaTemp) {
				count++;
			} else {
				count = 0;
			}
			if (count > maxDays) {
				maxDays = count;
				endOfMax = index;
			}
		}
		System.out.println("Nai-mnogo studeni dni: " + maxDays);

		byte startOfMax = (byte) (endOfMax - maxDays + 1);
		for (byte index = startOfMax; index <= endOfMax; index++) {
			System.out.println(gradusi[index] + " ");
		}
		
		for(byte index = 1; index< broiDni; index++) {
			if(gradusi[index] <gradusi[index-1]) {
				count++;
			} else {
				count = 0;
			}
			if (count > maxDays) {
				maxDays = count;
				endOfMax = index;
			
			}
		}
	}
}
