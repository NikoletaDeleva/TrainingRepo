package pristanishte;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Pristanishte {
	public static final int DOCKS_COUNT = 5;
	private Map<Integer, Queue<Korab>> docks = new ConcurrentHashMap<Integer, Queue<Korab>>();

	private Distributor[] distributors = new Distributor[2];
	private Kran[] krans = new Kran[2];
	private List<Sklad> sklads = new ArrayList<Sklad>();
	private List<Set<UnloadedPackage>> dnevnik = new ArrayList<Set<UnloadedPackage>>();
	private static Pristanishte instance = null;

	public static class UnloadedPackage {
		private String shipName;
		private int packageId;
		private LocalDateTime time;

		public String getShipName() {
			return shipName;
		}

		public void setShipName(String shipName) {
			this.shipName = shipName;
		}

		public int getPackageId() {
			return packageId;
		}

		public void setPackageId(int packageId) {
			this.packageId = packageId;
		}

		public LocalDateTime getTime() {
			return time;
		}

		@Override
		public String toString() {
			return "\t pratka " + this.packageId + " korab " + this.shipName + " vreme " + this.time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}

		public UnloadedPackage(String shipName, int packageId) {
			this.shipName = shipName;
			this.packageId = packageId;
			this.time = LocalDateTime.now();
		}
	}

	private Pristanishte() {

		sklads.add(new Sklad());
		sklads.add(new Sklad());

		this.distributors[0] = new Distributor(sklads.get(0));
		this.distributors[1] = new Distributor(sklads.get(1));

		new Thread(this.distributors[0]).start();
		new Thread(this.distributors[1]).start();

		this.krans[0] = new Kran(1, docks, sklads);
		this.krans[1] = new Kran(2, docks, sklads);

		new Thread(this.krans[0]).start();
		new Thread(this.krans[1]).start();

		for (int d = 1; d <= DOCKS_COUNT; d++) {
			this.docks.put(d - 1, new LinkedList<Korab>());
			this.dnevnik.add(new TreeSet<UnloadedPackage>((p1, p2) -> {
				return p1.time.compareTo(p2.time);
			}));
		}
	}

	public void addRecord(int kranNumber, UnloadedPackage info) {
		this.dnevnik.get(kranNumber).add(info);
	}

	public List<Set<UnloadedPackage>> getAllUnloadedPratki() {
		return Collections.unmodifiableList(this.dnevnik);
	}

	public static Pristanishte getInstance() {
		if (instance == null) {
			instance = new Pristanishte();
		}
		return instance;
	}

	public void priemiKorab(Korab korab) {
		System.out.println("Prieh nov korab s ime : " + korab.getName());
		int dockIndex = (int) (Math.random() * DOCKS_COUNT);

		synchronized (this.docks) {
			Queue<Korab> dock = this.docks.get(dockIndex);
			System.out.println("Vkarvam korab na dock nomer " + dockIndex);
			dock.add(korab);
			this.docks.notifyAll();
		}
	}
}
