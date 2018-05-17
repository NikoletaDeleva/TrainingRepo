package kazan;

import java.util.Random;

public class Berach extends Thread{

	private String name;
	private int age;
	private Enum plod;
	private Kazani kazani;
	
	public Berach(Kazani k){
		this.kazani = k;
		this.plod = Kazani.Plodove.values()[new Random().nextInt(Kazani.Plodove.values().length)];
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public void run() {
		while(true){
			kazani.beri(plod);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
