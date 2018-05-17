package velikden;

import java.util.ArrayList;
import java.util.List;

public class Tendjera {
	private static Tendjera tendjera = null;
	public static final byte BROI_QICA = 50;
	public List<Qice> tendjeraSQica = new ArrayList<Qice>(BROI_QICA);

	private Tendjera() {

	}

	public static Tendjera getInstance() {
		if (tendjera == null) {
			tendjera = new Tendjera();
		}
		return tendjera;
	}

	public Qice vzemiQice() throws QicataSvurshihaException {
		if (tendjeraSQica.size() > 0) {
			int index = (int)(Math.random()*tendjeraSQica.size());
			Qice qice = tendjeraSQica.get(index);
			tendjeraSQica.remove(index);
			return qice;
		} else
			throw new QicataSvurshihaException("Nqma poveche qica");
	}

	public void svariQicata() {
		for (int index = 0; index < BROI_QICA; index++) {
			tendjeraSQica.add(new Qice());
		}
	}

	public boolean isFull() {
		if (tendjeraSQica.size() > 0) {
			return true;
		}
		return false;
	}
}
