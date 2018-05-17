import java.text.DecimalFormat;
import java.util.Arrays;

public class Sisxteen {
	public static void main(String[] args) {
		DecimalFormat numberFormat = new DecimalFormat("#.00");

		float[] array = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};
		float[] copyArray = Arrays.copyOf(array, array.length);
		float min = -0.231f;
		float sumWithoutZeros = 0;
		byte zeroCounter = 0;
		float averageWithoutZeros;
		
		System.out.println("Originalen masiv: ");
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println();
		for(int index = 0; index < array.length; index++) {
			if(array[index] < min) {
				array[index] = (float) ((index+1)*(index+1) + 41.25);
			}else {
				array[index] *= (float)(index+1);
			}
			
			if(array[index] != 0) {
				sumWithoutZeros += array[index];
			}else {
				zeroCounter++;
			}
		}
		averageWithoutZeros = sumWithoutZeros/(array.length - zeroCounter);
		
		System.out.println("Originalen masiv:  " + Arrays.toString(copyArray));
		System.out.print("Nov masiv  [");
		for(int index = 0; index < array.length; index++) {
			if(index == array.length - 1) {
				System.out.print(numberFormat.format(array[index]) + "]\n");				
				break;
			}
			System.out.print(numberFormat.format(array[index]) + ", ");
		}
		System.out.println("Sredna stoinost: " + numberFormat.format(averageWithoutZeros));


	}
}
