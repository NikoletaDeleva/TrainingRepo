package exeptions;

public class demo {
	static void printArrayInfo(int[] array) {
		System.out.println(array.length);
		System.out.println(array[3]);
		System.out.println("Some text");
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		try {
			printArrayInfo(arr);
		}catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Probvah ama ne stana");
			return;
		}
	}
}
