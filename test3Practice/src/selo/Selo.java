package selo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Selo {
	private static final int BROI_KAZANI = 5;
	private static Selo selo = null;
	private static ConcurrentHashMap<Plod,Byte> kazaniteNaSeloto = new ConcurrentHashMap<Plod,Byte>(
			BROI_KAZANI);
	private List<Berach> berachi = new ArrayList<Berach>();
	private List<Rakidjiq> rakidjii = new ArrayList<Rakidjiq>();

	private Selo() {

	}

	public static Selo getInstance() {
		if (selo == null) {
			selo = new Selo();
//			int index = 0;
//			if (kazaniteNaSeloto.isEmpty()) {
//				while (kazaniteNaSeloto.size() <= BROI_KAZANI) {
//					kazaniteNaSeloto.put(++index, new Kazan());
//				}
//			}
		}
		return selo;
	}

	public void suzdaiBerachi(int broi) {
		for (int index = 0; index < broi; index++) {
			berachi.add(new Berach(("berach " + index), (byte) (Math.random() * 50 + 15),selo));
		}
	}

	public void suzdaiRakidjii(int broi) {
		for (int index = 0; index < broi; index++) {
			rakidjii.add(new Rakidjiq(("rakidjiq " + index), (byte) (Math.random() * 50 + 15),selo));
		}
	}

	public void pochvaite() {
		for (int index = 0; index < berachi.size(); index++) {
			new Thread(berachi.get(index)).start();
		}

		for (int index = 0; index < rakidjii.size(); index++) {
			new Thread(rakidjii.get(index)).start();
		}
	}

	public static void beri(Plod plod) {
		//wait
		while(!nqmaSvobodenKazan(plod)) {
			try {
				plod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//produce
		kazaniteNaSeloto.put(plod, (byte)(kazaniteNaSeloto.get(plod)+1));
		System.out.println("Slojih oshte edno kilo " + plod + " v kazana.Veche ima tolkova " + kazaniteNaSeloto.get(plod));
		//notify
		plod.notifyAll();
	}

	private static boolean nqmaSvobodenKazan(Plod plod) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void vari(Plod plod) {
		
		
	}
}
