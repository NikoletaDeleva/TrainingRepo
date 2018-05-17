import java.util.Scanner;

public class Eighteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter arrays size...");
		int size = input.nextInt();
		int[] array = new int[size];
		int[] secondArr = new int[size];
		int[] newArray = new int [size];

		System.out.println("Initialize the first array...");
		for (byte index = 0; index < size; index++) {
			array[index] = input.nextInt();
		}
		
		System.out.println("Initialize the second array...");
		for (byte index = 0; index < size; index++) {
			secondArr[index] = input.nextInt();
		}
		for (byte index = 0; index < size; index++) {
			if(array[index] > secondArr[index]) {
				newArray[index] = array[index];
			}else {
				newArray[index] = secondArr[index];
			}
		}
		
		System.out.print("[");
		for(int index = 0; index < size; index++) {
			if(index == size-1) {
				System.out.print(newArray[index] + "]");
			}else {
				System.out.print(newArray[index] + " ");				
			}
		}
	}
}
