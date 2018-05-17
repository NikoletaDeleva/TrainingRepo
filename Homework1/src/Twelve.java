import java.util.Scanner;

public class Twelve {
	public static void main(String[] args) {
		
		byte maxJanMarMayJulAugOctDec = 31;
		byte maxFeb;
		byte maxAprJunSepNov = 30;

		Scanner input = new Scanner(System.in);
		System.out.println(" Vuvedi data: ");
		
		byte date = input.nextByte();
		byte month = input.nextByte();
		int year = input.nextInt();

		boolean leap;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true; 
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}
	 
	
		while (year < 0 || date<=0 || month<=0 || month>=12) {
			System.out.println("Opitai pak");
			year = input.nextInt();
		}

		
		maxFeb = (byte) (leap ? 29 : 28);
		
		if(leap==true) {
			maxFeb=29;
		}else {
			maxFeb=28;
		}

		if (month == 2) {
			if (date < maxFeb) {
				date++;
				System.out.println(date + "/" + month + "/" + year);
			} else {
				if (date == maxFeb) {
					date = 1;
					month++;
					System.out.println(date+ "/" + month + "/" + year);
				}
			}
		} else {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (date < maxAprJunSepNov) {
					date++;
					System.out.println(date + "/" + month + "/" + year);
				} else {
					if (date == maxAprJunSepNov) {
						date = 1;
						month++;
						System.out.println(date + "/" + month + "/" + year);
					}
				}
			} else {
				if (month == 12) {
					if(date < maxJanMarMayJulAugOctDec) {
						date++;
						System.out.println(date + "/" + month + "/" + year);
					}else {
						if(date == maxJanMarMayJulAugOctDec) {
							date = 1;
							month = 1;
							year++;
							System.out.println(date + "/" + month + "/" + year);
						}
					}
				} else {
					if (date < maxJanMarMayJulAugOctDec) {
						date++;
						System.out.println(date + "/" +month + "/" + year);
					} else {
						if (date == maxJanMarMayJulAugOctDec) {
							date = 1;
							month++;
							System.out.println(date + "/" + month + "/" + year);
						}
					}
				}
			}
		}

	}

}