package Sklad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rabotnik extends Contact {

	private final static int ZAPLATA = 500;
	protected List<Stoka> prietaStoka;
	protected List<Stoka> otpisanaStoka;
	protected Sklad sklad;
	protected int podredenaStoka;

	public Rabotnik(String name, Sklad sklad) {
		super(name);
		this.sklad = sklad;
		this.otpisanaStoka = new ArrayList<Stoka>();
		this.prietaStoka = new ArrayList<Stoka>();
	}

	public void podrediStoka(List<Stoka> stokiDaPodredq) {
		for(Stoka stoka : stokiDaPodredq) {
			this.sklad.addStoka(stoka);
			this.podredenaStoka++;
		}
	}

	public int getPodredenaStoka() {
		return this.podredenaStoka;
	}

	public Sklad getSklad() {
		return this.sklad;
	}

	public void setSklad(Sklad sklad) {
		if (sklad != null) {
			this.sklad = sklad;
			sklad.addRabotnik(this);
		} else {
			System.out.println("Nqma takuv sklad");
		}
	}
	
	public List<Stoka> getPrietiStoki() {
		return Collections.unmodifiableList(prietaStoka);
	}

	public static int getZaplata() {
		return ZAPLATA;
	}
	
	@Override
	public boolean equals(Object rabotnik) {
		Rabotnik rabotnik1;
		if(rabotnik instanceof Rabotnik) {
			rabotnik1 = (Rabotnik) rabotnik;
			return (this.getName().equals(rabotnik1.getName()));
		}
		return false;
	}
}
