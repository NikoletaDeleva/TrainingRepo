package lesson10;

public class demo2 {
	public static void main(String[] args) {
		String text = "Evala ti si golqm idiot, evala, naistina kak moja da opleskash nestata taka-evala.";
		int count = 0;
		String evala = "evala";
		
		for(int index= 0; index<text.length()- evala.length()+1; index++) {
			String subText = text.substring(index, index+evala.length());
			if(subText.equalsIgnoreCase(evala)) {
				count++;
			}
		}System.out.println(count);
	}
}
