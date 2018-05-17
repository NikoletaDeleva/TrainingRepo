package selo;

import java.util.Random;

//Consumer
public class Rakidjiq extends Hora implements Runnable {
	private Plod plod;

	public Rakidjiq(String name, byte godini, Selo selo) {
		super(name, godini, selo);
		this.plod = Plod.values()[new Random().nextInt(Plod.values().length)];
	}

	@Override
	public void run() {
		while(true) {
			Selo.vari(plod);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
