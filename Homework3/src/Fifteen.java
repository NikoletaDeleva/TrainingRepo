
public class Fifteen {
	public static void main(String[] args) {
		float[] arrayOfReals = { 7.13f, 0.2f, 4.9f, 5.1f, 6.34f, 1.12f };
		int size = arrayOfReals.length;

		float minimum = arrayOfReals[0];
		float medium = arrayOfReals[0];
		float maximum = arrayOfReals[0];

		for (int index = 0; index < size; index++) {
			if (arrayOfReals[index] > maximum) {
				maximum = arrayOfReals[index];
			}
		}
		for (int index = 0; index < size; index++) {
			if ((arrayOfReals[index] > medium || medium == maximum) && arrayOfReals[index] < maximum) {
				medium = arrayOfReals[index];
			}
		}
		for (int index = 0; index < size; index++) {
			if ((arrayOfReals[index] > minimum || minimum == maximum) && arrayOfReals[index] < medium) {
				minimum = arrayOfReals[index];
			}
		}
		System.out.println(minimum + "; " + medium + "; " + maximum);
	}
}
