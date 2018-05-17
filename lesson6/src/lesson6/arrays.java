package lesson6;

public class arrays {
	public static void main(String[] args) {
		int[] groupAges = {15, 21, 34, 20, 69, 18, 25};
		
		for(int index= groupAges.length -1; index>=(groupAges.length)/2 ; index--) {
			System.out.println("Chovek nomer "+ (index+1) + " e na " + groupAges[index] + " godini");
		}
	}
}