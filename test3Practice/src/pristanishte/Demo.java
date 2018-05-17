package pristanishte;
import java.io.IOException;
import java.util.Random;

public class Demo {
	public static void main(String[] args) throws IOException {
		Pristanishte pristanishte = Pristanishte.getInstance();

		final String[] names = { "Titanik", "Noeviq korab", "Ilinden", "Prycki", "Radecki" };

		for (int i = 1; i <= 30; i++) {
			Korab korab = new Korab(names[(int) (names.length * Math.random())]);
			for (int p = 1; p <= new Random().nextInt(4) + 1; p++) {
				Pratka pratka = new Pratka();
				korab.addPratka(pratka);
			}

			new Thread(() -> {
				System.out.println("Koraba plava");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Nov korab akustira na pristanishteto!");
				pristanishte.priemiKorab(korab);
			}).start();
			;

		}

		new Zapisvach(pristanishte).start();
	}
}
