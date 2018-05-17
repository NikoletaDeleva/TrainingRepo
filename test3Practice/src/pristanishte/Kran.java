package pristanishte;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Kran implements Runnable {

	private static final int TIME_TO_UNLOAD = 2000;
	private static final int ALL_DOCKS_ARE_EMPTY = -7;
	private Map<Integer, Queue<Korab>> docks;
	private List<Sklad> sklads;
	private int number;

	public Kran(int number, Map<Integer, Queue<Korab>> docks, List<Sklad> sklads) {
		this.number = number;
		this.docks = docks;
		this.sklads = sklads;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			while (getOccupiedDock() == ALL_DOCKS_ARE_EMPTY) {
				synchronized (this.docks) {
					try {
						System.out.println("Vsichki dokove sa prazni, shte chakam korabi!");
						this.docks.wait();
					} catch (InterruptedException e) {
						System.out.println("Krana se schupi, krai!");
						return;
					}
				}
			}

			int dockNumber = getOccupiedDock();
			if (dockNumber != ALL_DOCKS_ARE_EMPTY) {
				System.out.println("Pochvam da raztovarvam dock nomer " + dockNumber);
				Queue<Korab> currentQueue = this.docks.get(dockNumber);
				synchronized (currentQueue) {
					if (currentQueue.size() > 0) {
						Korab korab = this.docks.get(dockNumber).poll();
						System.out.println("Sega raztovarvam korab s ime " + korab.getName());

						for (Pratka p : korab.getPratki()) {
							Sklad sklad = sklads.get((int) (Math.random() * sklads.size()));
							sklad.addPratka(p);

							System.out.println("Obrabotvam pratka nomer " + p.getId());

							synchronized (sklad) {
								sklad.notifyAll();
							}

							korab.removePratka(p);

							Pristanishte.getInstance().addRecord(this.number,
									new Pristanishte.UnloadedPackage(korab.getName(), p.getId()));

							try {
								Thread.sleep(TIME_TO_UNLOAD);
							} catch (InterruptedException e) {
								System.out.println("Fuck off neshtanici!");
							}
						}
					}
				}
			}
		}
	}

	private int getOccupiedDock() {
		for (Integer nomer : this.docks.keySet()) {
			if (this.docks.get(nomer).size() > 0) {
				return nomer;
			}
		}
		return ALL_DOCKS_ARE_EMPTY;
	}

}
