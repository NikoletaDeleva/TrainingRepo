package velikden;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class Masa {
	private static Masa masa = null;

	private Map<Cvqt, ArrayBlockingQueue<Qice>> burkaniSQica = new ConcurrentHashMap<>();

	private Masa() {
		burkaniSQica.put(Cvqt.CHERVEN, new ArrayBlockingQueue<Qice>(2));
		burkaniSQica.put(Cvqt.JULT, new ArrayBlockingQueue<Qice>(2));
		burkaniSQica.put(Cvqt.ORANJEV, new ArrayBlockingQueue<Qice>(2));
		burkaniSQica.put(Cvqt.SIN, new ArrayBlockingQueue<Qice>(2));
		burkaniSQica.put(Cvqt.ZELEN, new ArrayBlockingQueue<Qice>(2));
	}

	public static Masa getInstance() {
		if (masa == null) {
			masa = new Masa();
		}
		return masa;
	}

	public Cvqt vzemiSvobodenBurkan() throws BurkanException {
		for (Entry<Cvqt, ArrayBlockingQueue<Qice>> entry : burkaniSQica.entrySet()) {
			if (entry.getValue().remainingCapacity() < 2) {
				return entry.getKey();
			}
		}
		throw new BurkanException("Vsichki burkani sa pulni, sorka!");
	}

	public void naTiQice(Qice qice) throws BurkanException {
		try {
			qice.setCvqt(vzemiSvobodenBurkan());
			this.burkaniSQica.get(qice.getCvqt()).add(qice);
			System.out.println("Slojih edno " + qice.getVidQice() + " qice v" + qice.getCvqt() + " boq.");
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public Qice vzemiQice() {
		Cvqt cvqt = 
	}

	public boolean burkaniteSaPulni() {
		// TODO Auto-generated method stub
		return false;
	}

}
