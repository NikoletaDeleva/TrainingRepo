import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b;
		System.out.println("Vuvedi dve chilsa:");
		a= input.nextInt();
		b=input.nextInt();
		int result = 0;
		int sum = 0;
		
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		for(int count=a; count<=b;count++) {
			result = count*count;
			sum+=result;
			if(result%3==0) {
				System.out.println("skip");
			}else {
				System.out.println(result);
			}
			if(sum>=200) {
				break;
			}
		}
	}
}
