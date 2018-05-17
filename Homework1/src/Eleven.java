import java.util.Scanner;

public class Eleven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		
		while(number<100 || number>999) {
			System.out.println("Vuvedi chislo:");
			number = input.nextInt();
		}
		
		int a=number/100;
		int b= (number%100)/10;
		int c= number%10;
		
		if(a==0 || b==0 || c==0) {
			System.out.println("Chisloto sudurja 0");
		}else {
			if(number%a==0) {
				System.out.println("Chisloto se deli na " + a);
			}else {
				System.out.println("Chisloto ne se deli na " + a);
			}
			if(number%b==0) {
				System.out.println("Chisloto se deli na " + b);
			}else {
				System.out.println("Chisloto ne se deli na " + b);
			}
			if(number%c==0) {
				System.out.println("Chisloto se deli na " + c);
			}else {
				System.out.println("Chisloto ne se deli na " + c);
			}
		}
		
	}
}