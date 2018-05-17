package pristanishte;

public class Distributor implements Runnable {

	private static final int TIME_TO_DELIVER = 5000;
	private Sklad sklad;

	public Distributor(Sklad sklad) {
		this.sklad = sklad;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			while (this.sklad.getNumberOfPratki() == 0) {
				try {
					synchronized (this.sklad) {
						this.sklad.wait();
					}
				} catch (InterruptedException e) {
					return;
				}
			}

			Pratka p;
			try {
				p = sklad.getFirst();
				System.out.println("Distributirah pratka nomer " + p.getId());
				Thread.sleep(TIME_TO_DELIVER);
				synchronized (this.sklad) {
					this.sklad.notifyAll();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
