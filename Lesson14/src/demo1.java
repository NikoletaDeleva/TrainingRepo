import java.util.Arrays;
import java.util.Scanner;

public class demo1 {
	static int partition(int[] arr, int l, int r) {
		int last = arr[r];
		int indexLower = l - 1;

		for (int index = l; index < arr.length - 1; index++) {
			if (arr[index] <= last) {
				indexLower++;

				int temp = arr[index];
				arr[index] = arr[indexLower];
				arr[indexLower] = temp;

			}
		}
		return indexLower;
	}
	static void quickSort(int[] arr, int l, int r) {
		if(l>=r) {
			return ;
		}
		int indexLower = partition(arr, l, r);
		quickSort(arr, l, indexLower-1);
		quickSort(arr, indexLower+1, r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] arr = new int[10];

		for (int index = 0; index < arr.length; index++) {
			arr[index] = input.nextInt();
		}
		
		
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
