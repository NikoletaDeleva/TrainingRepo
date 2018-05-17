import java.util.Arrays;

public class Twoelve {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int temp;
		
		temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		
		array[4] = array[4]*array[5];
		array[5] = array[4]/array[5];
		array[4] = array[4]/array[5];
		
		System.out.println(Arrays.toString(array));
	}
}
