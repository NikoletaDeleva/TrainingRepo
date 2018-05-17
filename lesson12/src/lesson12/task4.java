package lesson12;

public class task4 {
	static int proizvedenieChetni (int x) {
		if(x<1) {
			return 1;
		}
		if(x%2 == 0) {
			return x* proizvedenieChetni(x-2);
		}else {
			--x;
			return x* proizvedenieChetni(x-2);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(proizvedenieChetni(10));
	}
}
