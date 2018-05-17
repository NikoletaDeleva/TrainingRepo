package lesson12;

public class task2 {
	static void izvediMasivNaObratno(int[] array, int index) {
		int point = index - 1;
		if (point < 0) {
			return;
		} else {
			System.out.println(array[point]);
		}
		izvediMasivNaObratno(array, index - 1);
	}

	public static void main(String[] args) {
		int[] masiv = { 1, 2, 3, 4, 6 };

		izvediMasivNaObratno(masiv, masiv.length);
	}
}
