package Sklad;

import java.util.ArrayList;
import java.util.List;

public class Distributor extends Contact{

	
	private static final double COMISIONNA = 0.2f;
	private double pari;
	private List<Magazin> magazini;

	public Distributor(String name) {
		super(name);
		this.magazini = new ArrayList<Magazin>();
	}
	
	public void zarediMagazin(Magazin magazin, List<Stoka> stoki) {
		if(magazin != null && stoki != null && !stoki.isEmpty()) {
			for(Stoka stoka : stoki) {
				double price = stoka.getPrice();
				stoka.setPrice(price + (int)(price*COMISIONNA));
				magazin.stokiVMagazina.add(stoka);
				this.uvelichiMiParite((int)(price*COMISIONNA));
				System.out.println("Stokata beshe dostavena i si vzeh parite!");
				
			}
		}else {
			System.out.println("Nqma takuv magazin ili takiva stoki!");
		}
	}
	
	public void uvelichiMiParite(int money) {
		if(money > 0) {
			this.setPari(this.getPari() + money);
		}
	}

	public static double getComisionna() {
		return COMISIONNA;
	}

	public double getPari() {
		return this.pari;
	}

	public void setPari(double pari) {
		this.pari = pari;
	}
	
	public void addMagazin(Magazin magazin) {
		if(magazin != null && !this.magazini.contains(magazin)) {
			this.magazini.add(magazin);
		}
	}
	@Override
	public boolean equals(Object distributor) {
		Distributor distributor1;
		if(distributor instanceof Distributor) {
			distributor1 = (Distributor) distributor;
			return (this.getName().equals(distributor1.getName()));
		}
		return false;
	}
}
