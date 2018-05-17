package lesson3;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int br=0;
		x = input.nextInt();
		
			if((x&1)!=0){
				br++;
			}
			x=x>>1;
			System.out.println(br);
		}	
}