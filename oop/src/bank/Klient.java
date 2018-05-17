package bank;

import java.util.Collections;
import java.util.Set;

public class Klient extends Contact {
	
	private float money;
	private float zaplata;
	private Set<Depozit> depoziti;
	private Set<Kredit> krediti;
	
	public Klient(String name, String address, float money, float zaplata) {
		super(name, address);
		this.money = money;
		this.zaplata = zaplata;

	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public float getZaplata() {
		return zaplata;
	}

	public void setZaplata(float zaplata) {
		this.zaplata = zaplata;
	}
	
	public Set<Depozit> getDepoziti(){
		return Collections.unmodifiableSet(this.depoziti);
	}
	public Set<Kredit> getKrediti(){
		return Collections.unmodifiableSet(this.krediti);
	}
	
}
