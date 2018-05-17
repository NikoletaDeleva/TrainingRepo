package kazan;

import java.util.Random;

public class Rakijiq extends Thread{

	private String name;
	private int age;
	private Kazani kazani;
	private Enum plod;
	
	public Rakijiq(Kazani k){
		this.kazani = k;
		this.plod = Kazani.Plodove.values()[new Random().nextInt(Kazani.Plodove.values().length)];
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public void run() {
		while(true){
			kazani.vari(plod);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
