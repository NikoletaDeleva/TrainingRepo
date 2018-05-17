package velikden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Hladilnik {
	public static final int VIDOVE = 3;

	private Hladilnik hladilnik = null;

	private Map<VidQive, List<Qice>> kartoniSQica = new ConcurrentHashMap<>(VIDOVE);

	private Hladilnik() {
		kartoniSQica.put(VidQive.KOKOSHE, new ArrayList<Qice>());
		kartoniSQica.put(VidQive.GUSHE, new ArrayList<Qice>());
		kartoniSQica.put(VidQive.PATESHKO, new ArrayList<Qice>());
	}

	public Hladilnik getInstance() {
		if (hladilnik == null) {
			this.hladilnik = new Hladilnik();
		}
		return hladilnik;
	}

	public Map<VidQive, List<Qice>> getAllKartoniSQica() {
		return Collections.unmodifiableMap(this.kartoniSQica);
	}

	public void dobavqmGotovoQice() {

	}
}
