
public class Fourteen {
	public static void main(String[] args) {

		float[] arrayOfReals = { 7.1f, 8.5f, 0.2f, 3.7f, 0.99f, 1.4f, -3.5f, -110f, 212f, 341f, 1.2f };
		float min = -2.99f;
		float max = 2.99f;
		for (int index = 0; index < arrayOfReals.length; index++) {
			if (arrayOfReals[index] >= min && arrayOfReals[index] <= max) {
				System.out.print(arrayOfReals[index] + "; ");
			}
		}
	}
}
