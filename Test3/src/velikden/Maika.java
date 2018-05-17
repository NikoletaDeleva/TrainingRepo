package velikden;

public class Maika implements Runnable {
	private Masa masa;
	private Hladilnik hladilnik;

	@Override
	public void run() {
		while (masa.burkaniteSaPulni()) {
			Qice qice = masa.vzemiQice();
			if (Math.random() <= 0.2f) {
				qice.naprviShareno();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			hladilnik.dobavqmGotovoQice();
		}

	}

}
