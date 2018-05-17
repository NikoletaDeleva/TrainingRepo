import java.util.Scanner;

public class Seventeen {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	System.out.println("Enter arrays size...");
	int size = input.nextInt();
	int[] array = new int[size];
	boolean isSpiky = false;
	boolean evenSize;
	
	System.out.println("Initialize the array...");
	for (byte index = 0; index < size; index++) {
		array[index] = input.nextInt();
	}
	
	evenSize = (array.length % 2 == 0) ? true : false;
	
	if (evenSize == true) {
		for (int index = 1; index < array.length-1; index += 2) {
			
			if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
				isSpiky = true;
			} else {
				isSpiky = false;
				break;
			}
		}
	}else {
		for (int index = 1; index < array.length; index += 2) {
			if (index == array.length - 1) {
				if (array[index] > array[index - 1]) {
					isSpiky = true;
				}
			}
			if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
				isSpiky = true;
			} else {
				isSpiky = false;
				break;
			}
		}
	}
	
	System.out.println(isSpiky ? "The array is spiky" : "The array is not spiky");
	input.close();
}
}