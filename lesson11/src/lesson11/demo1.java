package lesson11;

public class demo1 {
	static void izvediMasiv(int[] masiv) {
		for (int index = 0; index < masiv.length; index++) {
			System.out.print(masiv[index]+ " ");
		}
	}

	static void napulniMasiv(int[] masiv) {
		for (int index = 0; index< masiv.length; index++) {
			masiv[index]= (int) (Math.random()*21);
		}
	}
	
	static void broiPeshovci(String[] masiv) {
		int count = 0;
		for( int index = 0; index< masiv.length; index++) {
			if(masiv[index].equals("Pesho")){
				count++;
			}
		}
		System.out.println("Ima tolkos Peshovci " + count);
	}
	
	static int divide (int a, int b) {
		if(b!=0) {
			return a/b;
		}
		else {
			System.out.println("Ai vuvedi neshto na koeto moje da se deli!");
			return 0;
		}
	
	}
	
	static int[] proizvedenieNaMasivi(int[] a, int[] b) {
		if(a != null && b!=null) {
			
			int lenght = (a.length>b.length) ? b.length : a.length ;

			int[] novMasiv = new int[lenght];
			
			for(int index = 0; index < lenght; index++) {
				novMasiv[index] = a[index]*b[index];
			}
			return novMasiv;
			
		}else {
			return new int[0];
		}
		
	}
	
	static  boolean proveriPurviITretiRed (int[][] a) {
		if(a!=null && a.length>=4) {
			boolean flag = true;
			for(int index = 0; index< a[index].length; index++) {
				if(a[1][index]==a[3][index]) {
					
				}
			}
		} return false;
	}

	public static void main(String[] args) {
		int[] moqMasiv = { 1, 2, 25, 24, 32 };
		izvediMasiv(moqMasiv);
		System.out.println();
		
		int[][] matrix = {
				{1, 2, 3},
				{2,5,8},
				{1, 4, 6},
				{2,5,8}
		};
		
		System.out.println(proveriPurviITretiRed(matrix));
		 
		int[] moqMasiv2 = new int[20];
		napulniMasiv(moqMasiv2);
		izvediMasiv(moqMasiv2);
		
		System.out.println();
		
		String[] masivHora = { "Pesho", "Gosho", "Stoyan", "Gosho", "Pesho", "Misho", "Pesho"};
		broiPeshovci(masivHora);
		
		int a = 20;
		int b = 5 ;
		int result = divide(a,b);
		System.out.println(result);
		
		
		int[] first = {12, 14,24,15,16,18};
		int[] second = {14, 15,23, 7};
		
		izvediMasiv(proizvedenieNaMasivi(first, second));

	}
}
