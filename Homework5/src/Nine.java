import java.util.Scanner;

public class Nine {
	public static int sumAllNumbers(String text) {
		if(text == null) {
			return 0;
		}
		String temp = "";
		int sum = 0;
		
		for(int index = 0; index < text.length(); index++) {
			while((text.charAt(index) >= '0' && text.charAt(index) <= '9') || text.charAt(index) == '-') {
				if(text.charAt(index) == '-' && (text.charAt(index-1) <= '9' && text.charAt(index-1) >= '1')){
					sum += Integer.parseInt(temp);
					temp = "" + text.charAt(index);
					index++;
				}
				
				temp += "" + text.charAt(index);
				if(index >= text.length()-1) {
					break;
				}
				index++;
			}
			if(!temp.equals("")) {
				sum += Integer.parseInt(temp);
			}
			temp = "";
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine(); 
		String text1 = "asd-12sdf45-56asdf100"; 
		
		System.out.println("Sumata na vsichki cifri v " + text1 + " e " + sumAllNumbers(text1)); 

	}
}
