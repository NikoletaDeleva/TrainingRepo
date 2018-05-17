package Sklad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Sklad extends Contact implements ISkald {

	private final static int NACHALEN_OBOROT = 10000;
	public static final int DEFAULT_KOL = 15;

	private final String address;
	private int oborot;

	private List<Distributor> distributori;
	private List<Dostavchik> dostavchici;
	private List<Rabotnik> rabotnici;
	private Map<Stoka, Integer> stoki;

	public Sklad(String name, String address) {
		super(name);
		this.setOborot(NACHALEN_OBOROT);
		this.address = address;
		this.dostavchici = new ArrayList<Dostavchik>();
		this.distributori = new ArrayList<Distributor>();
		this.rabotnici = new ArrayList<Rabotnik>();
		this.stoki = new HashMap<Stoka, Integer>();

	}

	public String getAddress() {
		return this.address;
	}

	public int getOborot() {
		return this.oborot;
	}

	public void setOborot(int oborot) {
		this.oborot = oborot;
	}

	@Override
	public void zarediSklad(List<Stoka> listSysStoki) {
		if (listSysStoki != null && !listSysStoki.isEmpty()) {
			if (this.dostavchici != null && !this.dostavchici.isEmpty()) {
				Dostavchik dostavchik = this.dostavchici.get((int) Math.random() * this.dostavchici.size());
				dostavchik.kupiStoka(listSysStoki);
				Rabotnik rabotnik = this.rabotnici.get((int) Math.random() * this.rabotnici.size());

				for (Stoka stoka : dostavchik.getKupeniStoki()) {
					rabotnik.prietaStoka.add(stoka);
					this.namaliParite(stoka.getPrice());
				}
				rabotnik.podrediStoka(rabotnik.getPrietiStoki());
				dostavchik.osvobodiSeOtStoki();
			} else {
				System.out.println("Nqma dostavchici!");
			}
		} else {
			System.out.println("Nqma takuv list sus stoki!");
		}
	}

	@Override
	public void dostavi(Magazin magazin, List<Stoka> stoki) {
		if (magazin != null && stoki != null && !stoki.isEmpty()) {
			Distributor distributor = this.distributori.get((int) Math.random() * this.distributori.size());
			distributor.zarediMagazin(magazin, stoki);

			Rabotnik rabotnik = this.rabotnici.get((int) Math.random() * this.dostavchici.size());
			rabotnik.otpisanaStoka.addAll(stoki);

			for (Stoka stoka : stoki) {
				int nostoqshtoKolichestvo = this.stoki.get(stoka);
				this.stoki.put(stoka, nostoqshtoKolichestvo - stoka.getNalicnost());
				this.oborot += stoka.getPrice() * (1 - Distributor.getComisionna());
			}
		}

	}

	@Override
	public void topStoki() {

	}

	Comparator<Rabotnik> broiPodredeniStokiComp = new Comparator<Rabotnik>() {
		@Override
		public int compare(Rabotnik rabotnik, Rabotnik rabotnik2) {
			return rabotnik.getPodredenaStoka() - rabotnik2.getPodredenaStoka();
		};
	};

	@Override
	public void loshiSlujiteli() {
		Set<Rabotnik> sortiraniRabotnici = new TreeSet<Rabotnik>(broiPodredeniStokiComp);
		sortiraniRabotnici.addAll(this.rabotnici);
		int index = 0;
		for (Iterator<Rabotnik> itr = sortiraniRabotnici.iterator(); itr.hasNext() && index < 3; index++) {
			System.out.println(itr.next().getName());
		}
	}

	@Override
	public void dificitniStoki() {
		for (Entry<Stoka, Integer> entry : this.stoki.entrySet()) {
			if (entry.getValue() < 10) {
				System.out.println(entry.getKey().getName());
			}
		}
	}

	@Override
	public void statistikaProdajbi() {
		for (Distributor distributor : distributori) {
			System.out.println(distributor.getName() + " " + distributor.getPari());
		}

	}

	@Override
	public void statistikaPokupki() {
		for (Dostavchik dostavchik : dostavchici) {
			System.out.println(dostavchik.getName() + " " + dostavchik.getMoney());
		}

	}

	@Override
	public void parichenBalans() {

	}

	public void addStoka(Stoka stoka) {
		if (stoka != null) {
			if (this.stoki.containsKey(stoka)) {
				int stoki = this.stoki.get(stoka);
				this.stoki.put(stoka, stoki+1);
			} else {
				this.stoki.put(stoka, 1);
			}
		} else {
			System.out.println("Nqma takava Stoka");
		}
	}

	public void namaliParite(double pari) {
		if (pari > 0 && pari < this.oborot) {
			this.oborot -= pari;
		}
	}
	
	public void addRabotnik(Rabotnik rabotnik) {
		if(rabotnik != null && !this.rabotnici.contains(rabotnik)) {
			this.rabotnici.add(rabotnik);
		}else {
			System.out.println("Ne moje da dobavite tozi rabotnik!");
		}
	}
	
	public void addDostavchik(Dostavchik dostavchik) {
		if(dostavchik != null && !this.dostavchici.contains(dostavchik)) {
			this.dostavchici.add(dostavchik);
		}else {
			System.out.println("Ne moje da dobavite tozi dostavchik!");
		}
	}
	
	public void addDistributor(Distributor distributor) {
		if(distributor != null && !this.distributori.contains(distributor)) {
			this.distributori.add(distributor);
		}else {
			System.out.println("Ne moje da dobavite tozi distributor!");
		}
	}
	
	public List<Distributor> getDistributori(){
		return Collections.unmodifiableList(this.distributori);
	}
}
