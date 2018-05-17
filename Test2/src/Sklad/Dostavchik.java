package Sklad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Dostavchik extends Contact {
	protected double money;
	protected List<Stoka> kupeniStoki;
	

	public Dostavchik(String name, double money) {
		super(name);
		this.money = money;
		this.kupeniStoki = new ArrayList<Stoka>();
	}

	public abstract void kupiStoka(List<Stoka> stoki);
	
	public double getMoney() {
		return money;
	}

	public void uvelichiMiParite(double money) {
		if(money > 0) {
			this.money += money;
		}
	}
	public void setMoney(double money) {
		this.money = money;
	}

	public List<Stoka> getKupeniStoki() {
		return Collections.unmodifiableList(this.kupeniStoki);
	}

	public void osvobodiSeOtStoki() {
		this.kupeniStoki.clear();
	}
	@Override
	public boolean equals(Object dostavchik) {
		Dostavchik dostavchik1;
		if(dostavchik instanceof Dostavchik) {
			dostavchik1 = (Dostavchik) dostavchik;
			return (this.getName().equals(dostavchik1.getName()));
		}
		return false;
	}

}
