import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete dve razlichni celi chisla:");
		int first = input.nextInt();
		int second = input.nextInt();
		if (first == second) {
			System.out.println("Probvai pak! \n");
		} else {
			int sum = first + second;
			int dif = first - second;
			int pro = first * second;
			int dev = first / second;
			int mod = first % second;
			System.out.println("Sumata e: " + sum);
			System.out.println("Razlikata e: " + dif);
			System.out.println("Proizvedenieto e: " + pro);
			System.out.println("Castnoto e: " + dev);
			System.out.println("Ostatukut e: " + mod);
			System.out.println("\n");
		}

		System.out.println("Vuvedete dve razlichni chisla:");
		double One = input.nextDouble();
		double Two = input.nextDouble();
		if (One == Two) {
			System.out.println("Probvai pak!");
		} else {
			double sum = One + Two;
			double dif = One - Two;
			double pro = One * Two;
			double dev = One / Two;
			double mod = One % Two;
			System.out.println("Sumata e: " + sum);
			System.out.println("Razlikata e: " + dif);
			System.out.println("Proizvedenieto e: " + pro);
			System.out.println("Castnoto e: " + dev);
			System.out.println("Ostatukut e: " + mod);
		}
	}

}
