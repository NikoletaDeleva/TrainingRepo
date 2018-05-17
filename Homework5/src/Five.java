import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String first = input.next();
		String second = input.next();
		int cross = 0;
		int cross2 = 0;
		int sizeShort;
		int sizeLong;
		
		if(first.length()>second.length()) {
			sizeShort = second.length();
			sizeLong = first.length();
			String temp = first;
			first = second;
			second = temp;
			
		}else {
			sizeShort = first.length();
			sizeLong = second.length();
		}
		
		System.out.println(first);
		System.out.println(second);
		
		
		for( int index = 0; index< sizeShort; index++) {
			for(int index2 = 0; index2<sizeLong; index2++) {
				if(first.charAt(index)==second.charAt(index2)){
					cross = index;
					cross2 = index2;
					break;
				}
			}
			break;
		}
		System.out.println(cross);
		System.out.println(cross2);
		
		for(int index2 = 0; index2< sizeLong; index2++) {
			if(index2!=cross2) {
				for(int numb = 0; numb<cross; numb++) {
					System.out.print(" ");
				}
				System.out.println(second.charAt(index2));
		}else {
			System.out.println(first);
		}
	}
}
}