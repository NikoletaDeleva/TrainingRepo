package threadsTwo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		
	}
	static String text;
	
	private static void countWithFor() {
		int count = 0;
		for(int i = 0; i< text.length(); i ++) {
			if((text.charAt(i)=='a') || (text.charAt(i)=='A')) {
				count++;
			}
		}
	}
	private static void load() throws MalformedURLException, IOException {
		StringBuilder builder = new StringBuilder();
		try(Scanner sc =new Scanner( new BufferedInputStream(new URL("http://norvig.com/big.txt").openStream()))){
			while(sc.hasNextLine()) {
				builder.append(sc.hasNext());
				builder.append(System.lineSeparator());
			}
		}
		text = builder.toString();
	}
}
