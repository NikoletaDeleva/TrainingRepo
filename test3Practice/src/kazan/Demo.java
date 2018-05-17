package kazan;

public class Demo {

	public static void main(String[] args) {
		
		Kazani k = new Kazani();
		
		for(int i = 0; i < 50; i++){
			new Berach(k).start();
			new Rakijiq(k).start();
		}
		
	}
}
