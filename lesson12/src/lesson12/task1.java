package lesson12;

public class task1 {
	static void kratniNa5(int number) {
		if(number<5) {
			return;
		}else {
			System.out.println(number);
			kratniNa5(number-5);
		}
		
	}
	public static void main(String[] args) {
		kratniNa5(100);
	}
}
